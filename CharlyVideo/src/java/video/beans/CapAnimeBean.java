/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import video.dao.imp.AnimeDAOImp;
import video.dao.imp.CapAnimeDAOImp;
import video.dto.AnimeDTO;
import video.dto.CapAnimeDTO;
import video.model.CapAnime;

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
    
    private Integer idcap;
    private Integer idanime;
    private Integer numcap;
    private String nomcap;
    private String desc;
    private Integer duracion;
    private Date fecha;
    private String ruta;
    private Integer numTemporada;
    private String NombreTemporada;
    private List<CapAnimeDTO> listcapAnime;
    private List<AnimeDTO> listtitAnime;
    private List<SelectItem> listselectitem;
    
    
    public CapAnimeBean(){
        System.out.println("Ingresa en heresers");
        recCapAnime();
    }
    
    public void recCapAnime(){
        animeDAOImp = new AnimeDAOImp();
        listtitAnime = animeDAOImp.getlisttitanimes();
        if(listtitAnime.size() == 0){
            System.out.println("Ingresa here");
            listselectitem = new ArrayList<SelectItem>();
            for(AnimeDTO anim : listtitAnime){
                System.out.println("Ingresa here");
                listselectitem.add(new SelectItem(anim.getIdanime(), anim.getTitOrig()));
            }
        }
    }
    
    public void regCapAnime(){
        
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

    public Integer getIdcap() {
        return idcap;
    }

    public void setIdcap(Integer idcap) {
        this.idcap = idcap;
    }

    public Integer getIdanime() {
        return idanime;
    }

    public void setIdanime(Integer idanime) {
        this.idanime = idanime;
    }

    public Integer getNumcap() {
        return numcap;
    }

    public void setNumcap(Integer numcap) {
        this.numcap = numcap;
    }

    public String getNomcap() {
        return nomcap;
    }

    public void setNomcap(String nomcap) {
        this.nomcap = nomcap;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Integer getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(Integer numTemporada) {
        this.numTemporada = numTemporada;
    }

    public String getNombreTemporada() {
        return NombreTemporada;
    }

    public void setNombreTemporada(String NombreTemporada) {
        this.NombreTemporada = NombreTemporada;
    }

    public List<CapAnimeDTO> getListcapAnime() {
        return listcapAnime;
    }

    public void setListcapAnime(List<CapAnimeDTO> listcapAnime) {
        this.listcapAnime = listcapAnime;
    }

    public List<SelectItem> getListselectitem() {
        return listselectitem;
    }

    public void setListselectitem(List<SelectItem> listselectitem) {
        this.listselectitem = listselectitem;
    }
    
}
