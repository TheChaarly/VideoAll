/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.beans;

import java.util.Date;
import video.dao.imp.AnimeDAOImp;
import video.dao.imp.CapAnimeDAOImp;
import video.model.CapAnime;

/**
 *
 * @author TheChaarly
 */
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
    
    
    public CapAnimeBean(){
        
    }
    
    
}
