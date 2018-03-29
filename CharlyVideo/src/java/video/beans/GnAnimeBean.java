/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.primefaces.model.UploadedFile;
import video.dao.imp.GnAnimeDAOImp;
import video.dto.GnAnimeDTO;
import video.dto.UsuarioDTO;
import video.model.Animes;
import video.model.GnAnime;
import video.model.Usuario;
import video.util.HibernateUtil;

/**
 *
 * @author TheChaarly
 */
@ManagedBean(name = "gnAnimeBean")
@SessionScoped
public class GnAnimeBean {
    
    private Loginusuario loginusuario;
    private Animes animes;
    private GnAnime gnanime;
    private GnAnimeDAOImp gnAnimeDAOImp;
    private Usuario usuario;
    private List<GnAnimeDTO> listGnAnimeDTO;
    private List<SelectItem> listselecgen;
    private List<SelectItem> listselecgen2;
    private List<SelectItem> listselecgen3;
    private Integer Id;
    private String Nombre;
    private String Descripcion;
    private Integer Estado;
    
    private String tituloorg;
    private String titulosec;
    private String Idioma;
    private String Subtitul;
    private String Descrip;
    private String Estatus;
    private String Cclasif;
    private Integer Gene1;
    private Integer Gene2;
    private Integer Gene3;
    private Integer CapIn;
    private Integer CapFin;
    private Integer EstadoAn;
    private Date fechini;
    private Date fechfin;
    private UploadedFile filefoto;
    private UsuarioDTO usuarioDTO;
    
    public GnAnimeBean(){
        getListGnAnime();
        System.out.println("Date " );
        
        
    }
    
    public void limpiaAnimes(){
        filefoto = null;
        tituloorg = "";
        titulosec = "";
        Idioma = "";
        Subtitul = "";
        Descrip = "";
        Estatus = null;
        Cclasif = "";
        Gene1 = 0;
        Gene2 = 0;
        Gene3 = 0;
        CapIn = 0;
        CapFin = 0;
        EstadoAn = 0;
        fechini = null;
        fechfin = null;
    }
    
    public void rgAnime(){
        System.out.println("Ingresa en RgAnime " + filefoto.getFileName());
        System.out.println("1.- " + tituloorg);
        System.out.println("2.- " + titulosec);
        System.out.println("3.- " + Idioma);
        System.out.println("4.- " + Subtitul);
        System.out.println("5.- " + Descrip);
        System.out.println("6.- " + Estatus);
        System.out.println("7.- " + Cclasif);
        System.out.println("8.- " + Gene1);
        System.out.println("9.- " + Gene2);
        System.out.println("10.- " + Gene3);
        System.out.println("11.- " + CapIn);
        System.out.println("12.- " + CapFin);
        System.out.println("13.- " + EstadoAn);
        System.out.println("14.- " + fechini);
        System.out.println("15.- " + fechfin);
        
        try {
            byte[] img = IOUtils.toByteArray(filefoto.getInputstream());
            
            Session session = null;
            
            session = HibernateUtil.getSessionFactory().openSession();
            
            animes.setTitOriginal(tituloorg);
            animes.setTitSecund(titulosec);
            animes.setIdio(Idioma);
            animes.setSub(Subtitul);
            animes.setDescripcionA(Descrip);
            animes.setEstatu(Estatus);
            animes.setClasifica(Cclasif);
            animes.setGen1(Gene1);
            animes.setGen2(Gene2);
            animes.setGen3(Gene2);
            animes.setCapAct(CapIn);
            animes.setCapfin(CapFin);
            animes.setEstad(EstadoAn);
            animes.setFechalanza(fechini);
            animes.setFechafinal(fechfin);
            animes.setPost(img);
            
            session.save(animes);
            session.flush();
            session.close();
            limpiaAnimes();
        } catch (IOException ex) {
            System.out.println("Error RgAnime --- EEE ---");
            Logger.getLogger(GnAnimeBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void getListGnAnime(){
        gnAnimeDAOImp = new GnAnimeDAOImp();
        listGnAnimeDTO = gnAnimeDAOImp.getListGnA();
        if(listGnAnimeDTO.size() != 0){
            listselecgen = new ArrayList<SelectItem>();
            listselecgen2 = new ArrayList<SelectItem>();
            listselecgen3 = new ArrayList<SelectItem>();
            for (GnAnimeDTO gn : listGnAnimeDTO){
                listselecgen.add(new SelectItem(gn.getId(), gn.getNombre()));
                listselecgen2.add(new SelectItem(gn.getId(), gn.getNombre()));
                listselecgen3.add(new SelectItem(gn.getId(), gn.getNombre()));
            }
        }
    }
    
    public void registraGeneroA(){
        gnanime = new GnAnime();
        System.out.println("Desc " + Descripcion);
        Session session = null;
        session = HibernateUtil.getSessionFactory().openSession();
        
        gnanime.setGeneroA(Nombre);
        gnanime.setDescripcionA(Descripcion);
        System.out.println("Des " + gnanime.getDescripcionA());

        session.save(gnanime);
        session.flush();
        session.close();
        cleanDT();
        getListGnAnime();
    }
    
    private void cleanDT() {
        Nombre = "";
        Descripcion = "";
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public GnAnime getGnanime() {
        return gnanime;
    }

    public void setGnanime(GnAnime gnanime) {
        this.gnanime = gnanime;
    }

    public Integer getEstado() {
        return Estado;
    }

    public void setEstado(Integer Estado) {
        this.Estado = Estado;
    }

    public GnAnimeDAOImp getGnAnimeDAOImp() {
        return gnAnimeDAOImp;
    }

    public void setGnAnimeDAOImp(GnAnimeDAOImp gnAnimeDAOImp) {
        this.gnAnimeDAOImp = gnAnimeDAOImp;
    }

    public List<GnAnimeDTO> getListGnAnimeDTO() {
        return listGnAnimeDTO;
    }

    public void setListGnAnimeDTO(List<GnAnimeDTO> listGnAnimeDTO) {
        this.listGnAnimeDTO = listGnAnimeDTO;
    }

    public List<SelectItem> getListselecgen() {
        return listselecgen;
    }

    public void setListselecgen(List<SelectItem> listselecgen) {
        this.listselecgen = listselecgen;
    }

    public List<SelectItem> getListselecgen2() {
        return listselecgen2;
    }

    public void setListselecgen2(List<SelectItem> listselecgen2) {
        this.listselecgen2 = listselecgen2;
    }

    public List<SelectItem> getListselecgen3() {
        return listselecgen3;
    }

    public void setListselecgen3(List<SelectItem> listselecgen3) {
        this.listselecgen3 = listselecgen3;
    }

    public String getTituloorg() {
        return tituloorg;
    }

    public void setTituloorg(String tituloorg) {
        this.tituloorg = tituloorg;
    }

    public String getTitulosec() {
        return titulosec;
    }

    public void setTitulosec(String titulosec) {
        this.titulosec = titulosec;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getSubtitul() {
        return Subtitul;
    }

    public void setSubtitul(String Subtitul) {
        this.Subtitul = Subtitul;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public String getCclasif() {
        return Cclasif;
    }

    public void setCclasif(String Cclasif) {
        this.Cclasif = Cclasif;
    }

    public Integer getGene1() {
        return Gene1;
    }

    public void setGene1(Integer Gene1) {
        this.Gene1 = Gene1;
    }

    public Integer getGene2() {
        return Gene2;
    }

    public void setGene2(Integer Gene2) {
        this.Gene2 = Gene2;
    }

    public Integer getGene3() {
        return Gene3;
    }

    public void setGene3(Integer Gene3) {
        this.Gene3 = Gene3;
    }

    public Integer getCapIn() {
        return CapIn;
    }

    public void setCapIn(Integer CapIn) {
        this.CapIn = CapIn;
    }

    public Integer getCapFin() {
        return CapFin;
    }

    public void setCapFin(Integer CapFin) {
        this.CapFin = CapFin;
    }

    public Integer getEstadoAn() {
        return EstadoAn;
    }

    public void setEstadoAn(Integer EstadoAn) {
        this.EstadoAn = EstadoAn;
    }

    public Date getFechini() {
        return fechini;
    }

    public void setFechini(Date fechini) {
        this.fechini = fechini;
    }

    public Date getFechfin() {
        return fechfin;
    }

    public void setFechfin(Date fechfin) {
        this.fechfin = fechfin;
    }

    public UploadedFile getFilefoto() {
        return filefoto;
    }

    public void setFilefoto(UploadedFile filefoto) {
        this.filefoto = filefoto;
    }

    public Animes getAnimes() {
        return animes;
    }

    public void setAnimes(Animes animes) {
        this.animes = animes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
