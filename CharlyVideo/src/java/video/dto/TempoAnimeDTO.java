/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.dto;

import java.util.Date;

/**
 *
 * @author TheChaarly
 */
public class TempoAnimeDTO {
    
    private Integer IdTemporada;
    private Integer IdAnime;
    private String NombreTemporada;
    private Integer NumeroTemporada;
    private Date FechaLanza;
    private Date FechaFinal;
    private byte[] Poster;
    private String Estatus;
    private String Clasificacion;
    private String Idioma;
    private String subtitulos;
    private Integer CapActual;
    private Integer CapFinal;
    private Date Fecha;

    public Integer getIdTemporada() {
        return IdTemporada;
    }

    public void setIdTemporada(Integer IdTemporada) {
        this.IdTemporada = IdTemporada;
    }

    public Integer getIdAnime() {
        return IdAnime;
    }

    public void setIdAnime(Integer IdAnime) {
        this.IdAnime = IdAnime;
    }

    public String getNombreTemporada() {
        return NombreTemporada;
    }

    public void setNombreTemporada(String NombreTemporada) {
        this.NombreTemporada = NombreTemporada;
    }

    public Integer getNumeroTemporada() {
        return NumeroTemporada;
    }

    public void setNumeroTemporada(Integer NumeroTemporada) {
        this.NumeroTemporada = NumeroTemporada;
    }

    public Date getFechaLanza() {
        return FechaLanza;
    }

    public void setFechaLanza(Date FechaLanza) {
        this.FechaLanza = FechaLanza;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public byte[] getPoster() {
        return Poster;
    }

    public void setPoster(byte[] Poster) {
        this.Poster = Poster;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
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
    
    
    
}
