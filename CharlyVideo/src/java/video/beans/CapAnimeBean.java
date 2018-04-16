/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.ServletContext;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import video.dao.imp.AnimeDAOImp;
import video.dao.imp.CapAnimeDAOImp;
import video.dao.imp.TempoAnimevDAOImp;
import video.dto.AnimeDTO;
import video.dto.CapAnimeDTO;
import video.dto.TempoAnimeDTO;
import video.model.CapAnime;
import video.model.TempoAnime;
import video.util.HibernateUtil;

/**
 *
 * @author TheChaarly
 */
@ManagedBean(name = "capAnimeBean")
@SessionScoped
public class CapAnimeBean {
    
    private CapAnime capanime;
    private CapAnimeDAOImp capAnimeDAOImp;
    private AnimeDAOImp animeDAOImp; 
    private TempoAnimevDAOImp tempoAnimevDAOImp; 
    private TempoAnime tempoAnime;
    private Integer idanime;
    private String NombreTemporada;
    private Integer numTemporada;
    private Date fechaLanzamiento;
    private Date fechaFin;
    private UploadedFile poster;
    private String Estatus;
    private String Clasificaciion;
    private String Idioma;
    private String Subtitulo;
    private Integer CapActual;
    private Integer CapFinal;
    private Date Fecha;
    private File filpoto;
    private List<CapAnimeDTO> listcapAnime;
    private List<AnimeDTO> listtitAnime;
    private List<TempoAnimeDTO> listtitTempo;
    private List<TempoAnime> listTempoAnime;
    private List<SelectItem> listselectitem;
    private List<SelectItem> listselectitem2;
    private List<SelectItem> listselectitem3;
    
    private Integer idtemp;
    private Integer idanime2;
    private String tituloCap;
    private Integer NumCapitulo;
    private Integer Duracion;
    private String Ruta;
    private UploadedFile RutaUp;
    private File Ruta1;
    private Date fecha_ext;
    private Date fechaRg;
    private String DEscipcion;
    
    public CapAnimeBean(){
        System.out.println("Ingresa en heresers");
        recCapAnime();
    }
    
    public void regCapAnime(){
        Session session = null;           
        try {
            Calendar c3 = new GregorianCalendar();
            System.out.println("1.-" + idtemp);
            System.out.println("3.-" + NumCapitulo);
            System.out.println("2.-" + tituloCap);
            
            System.out.println("8.-" + DEscipcion);
            System.out.println("4.-" + Duracion);
            System.out.println("6.-" + fecha_ext);
            System.out.println("7.-" + c3.getTime());
            byte[] video = IOUtils.toByteArray(RutaUp.getInputstream());
            System.out.println("video" + video.length);
            
            session = HibernateUtil.getSessionFactory().openSession();
            capanime = new CapAnime();
            
            capanime.setIdTemporada(idtemp);
            capanime.setNCap(NumCapitulo);
            capanime.setTitcap(tituloCap);
            capanime.setDesc(DEscipcion);
            capanime.setDura(Duracion);
            capanime.setFechExt(fecha_ext);
            capanime.setFech(Fecha);
            capanime.setRuta(video);
            
            session.save(capanime);
            session.flush();
            session.close();
        } catch (IOException ex) {
            Logger.getLogger(CapAnimeBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }
    
   
    public void cleanDatos(){
        idanime = null;
        NombreTemporada = null;
        numTemporada = null;
        fechaLanzamiento = null;
        fechaFin = null;
        poster = null;
        Estatus = null;
        Clasificaciion = null;
        Idioma = null;
        Subtitulo = null;
        CapActual = null;
        CapFinal = null;
        Fecha = null;
    }
    
    public void regTempoAnime(){
        
        System.out.println("1.- " + idanime);
        System.out.println("2.- " + NombreTemporada);
        System.out.println("3.- " + numTemporada);
        System.out.println("4.- " + fechaLanzamiento);
        System.out.println("5.- " + fechaFin);
        System.out.println("6.- " + poster.getFileName());
        System.out.println("6.- " + poster.getContentType());        
        System.out.println("7.- " + Estatus);
        System.out.println("8.- " + Clasificaciion);
        System.out.println("9.- " + Idioma);
        System.out.println("10.- " + Subtitulo);
        System.out.println("11.- " + CapActual);
        System.out.println("12.- " + CapFinal);
        System.out.println("13.- " + Fecha);
        
            Session session = null;            
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            
            byte[] img = IOUtils.toByteArray(poster.getInputstream());
            Calendar c2 = new GregorianCalendar();
            tempoAnime = new TempoAnime();
            tempoAnime.setIdAnime(idanime);
            tempoAnime.setNombreTemporada(NombreTemporada);
            tempoAnime.setNumeroDTemporada(numTemporada);
            tempoAnime.setFechaLanz(fechaLanzamiento);
            tempoAnime.setFechaFinal(fechaFin);
            tempoAnime.setImg(img);
            tempoAnime.setEstatusT(Estatus);
            tempoAnime.setClasifica(Clasificaciion);
            tempoAnime.setIdiomaT(Idioma);
            tempoAnime.setSubtitulosT(Subtitulo);
            tempoAnime.setCapituloActual(CapActual);
            tempoAnime.setCapituloFinal(CapFinal);
            tempoAnime.setFechaTemp(c2.getTime());
            
            session.save(tempoAnime);
            session.flush();
            session.close();
            cleanDatos();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        
    }
    
    public void recCapAnime(){
        System.out.println("Ingresa en rec Cap anime");
        animeDAOImp = new AnimeDAOImp();
        listtitAnime = animeDAOImp.getlisttitanimes();
        if(listtitAnime.size() != 0){
            System.out.println("Ingresa here");
            listselectitem = new ArrayList<SelectItem>();
            listselectitem2 = new ArrayList<SelectItem>();
            for(AnimeDTO anim : listtitAnime){
                System.out.println("Ingresa here");
                listselectitem.add(new SelectItem(anim.getIdanime(), anim.getTitOrig()));
                listselectitem2.add(new SelectItem(anim.getIdanime(), anim.getTitOrig()));
            }
        }
    }
    
    public void getlisttempo(){
        System.out.println("Ingresa");
        tempoAnime = new TempoAnime();
        tempoAnimevDAOImp = new TempoAnimevDAOImp();
        if(idanime2 != 0){
            listtitTempo = tempoAnimevDAOImp.getlistTempoAnime(idanime2);
            if(listtitTempo.size() != 0){
                listselectitem3 = new ArrayList<SelectItem>();
                System.out.println("Ingrresa antes de for");
                for(TempoAnimeDTO tempodto : listtitTempo){
                    listselectitem3.add(new SelectItem(tempodto.getIdTemporada(), tempodto.getNombreTemporada()));
                }
            }else{
            listselectitem3.clear();
        }      
        }
    }

    public UploadedFile getRutaUp() {
        return RutaUp;
    }

    public void setRutaUp(UploadedFile RutaUp) {
        this.RutaUp = RutaUp;
    }
    

    public String getTituloCap() {
        return tituloCap;
    }

    public void setTituloCap(String tituloCap) {
        this.tituloCap = tituloCap;
    }

    public Integer getNumCapitulo() {
        return NumCapitulo;
    }

    public void setNumCapitulo(Integer NumCapitulo) {
        this.NumCapitulo = NumCapitulo;
    }

    public Integer getDuracion() {
        return Duracion;
    }

    public void setDuracion(Integer Duracion) {
        this.Duracion = Duracion;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public File getRuta1() {
        return Ruta1;
    }

    public void setRuta1(File Ruta1) {
        this.Ruta1 = Ruta1;
    }

    public Date getFecha_ext() {
        return fecha_ext;
    }

    public void setFecha_ext(Date fecha_ext) {
        this.fecha_ext = fecha_ext;
    }

    public Date getFechaRg() {
        return fechaRg;
    }

    public void setFechaRg(Date fechaRg) {
        this.fechaRg = fechaRg;
    }

    public String getDEscipcion() {
        return DEscipcion;
    }

    public void setDEscipcion(String DEscipcion) {
        this.DEscipcion = DEscipcion;
    }

    public CapAnime getCapanime() {
        return capanime;
    }

    public void setCapanime(CapAnime capanime) {
        this.capanime = capanime;
    }

    public CapAnimeDAOImp getCapAnimeDAOImp() {
        return capAnimeDAOImp;
    }

    public void setCapAnimeDAOImp(CapAnimeDAOImp capAnimeDAOImp) {
        this.capAnimeDAOImp = capAnimeDAOImp;
    }

    public AnimeDAOImp getAnimeDAOImp() {
        return animeDAOImp;
    }

    public void setAnimeDAOImp(AnimeDAOImp animeDAOImp) {
        this.animeDAOImp = animeDAOImp;
    }

    public Integer getIdtemp() {
        return idtemp;
    }

    public void setIdtemp(Integer idtemp) {
        this.idtemp = idtemp;
    }

    public Integer getIdanime() {
        return idanime;
    }

    public void setIdanime(Integer idanime) {
        this.idanime = idanime;
    }

    public String getNombreTemporada() {
        return NombreTemporada;
    }

    public void setNombreTemporada(String NombreTemporada) {
        this.NombreTemporada = NombreTemporada;
    }

    public Integer getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(Integer numTemporada) {
        this.numTemporada = numTemporada;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public UploadedFile getPoster() {
        return poster;
    }

    public void setPoster(UploadedFile poster) {
        this.poster = poster;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public String getClasificaciion() {
        return Clasificaciion;
    }

    public void setClasificaciion(String Clasificaciion) {
        this.Clasificaciion = Clasificaciion;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String Subtitulo) {
        this.Subtitulo = Subtitulo;
    }

    public Integer getCapActual() {
        return CapActual;
    }

    public void setCapActual(Integer CapActual) {
        this.CapActual = CapActual;
    }

    public Integer getCapFinal() {
        return CapFinal;
    }

    public void setCapFinal(Integer CapFinal) {
        this.CapFinal = CapFinal;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public List<CapAnimeDTO> getListcapAnime() {
        return listcapAnime;
    }

    public void setListcapAnime(List<CapAnimeDTO> listcapAnime) {
        this.listcapAnime = listcapAnime;
    }

    public List<AnimeDTO> getListtitAnime() {
        return listtitAnime;
    }

    public void setListtitAnime(List<AnimeDTO> listtitAnime) {
        this.listtitAnime = listtitAnime;
    }

    public List<SelectItem> getListselectitem() {
        return listselectitem;
    }

    public void setListselectitem(List<SelectItem> listselectitem) {
        this.listselectitem = listselectitem;
    }

    public File getFilpoto() {
        return filpoto;
    }

    public void setFilpoto(File filpoto) {
        this.filpoto = filpoto;
    }

    public TempoAnime getTempoAnime() {
        return tempoAnime;
    }

    public void setTempoAnime(TempoAnime tempoAnime) {
        this.tempoAnime = tempoAnime;
    }

    public List<TempoAnime> getListTempoAnime() {
        return listTempoAnime;
    }

    public void setListTempoAnime(List<TempoAnime> listTempoAnime) {
        this.listTempoAnime = listTempoAnime;
    }

    public List<SelectItem> getListselectitem2() {
        return listselectitem2;
    }

    public void setListselectitem2(List<SelectItem> listselectitem2) {
        this.listselectitem2 = listselectitem2;
    }

    public List<SelectItem> getListselectitem3() {
        return listselectitem3;
    }

    public void setListselectitem3(List<SelectItem> listselectitem3) {
        this.listselectitem3 = listselectitem3;
    }

    public Integer getIdanime2() {
        return idanime2;
    }

    public void setIdanime2(Integer idanime2) {
        this.idanime2 = idanime2;
    }

    public TempoAnimevDAOImp getTempoAnimevDAOImp() {
        return tempoAnimevDAOImp;
    }

    public void setTempoAnimevDAOImp(TempoAnimevDAOImp tempoAnimevDAOImp) {
        this.tempoAnimevDAOImp = tempoAnimevDAOImp;
    }

    public List<TempoAnimeDTO> getListtitTempo() {
        return listtitTempo;
    }

    public void setListtitTempo(List<TempoAnimeDTO> listtitTempo) {
        this.listtitTempo = listtitTempo;
    }

    
}
