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
public class CapAnimeDTO {
    
    private Integer idCap;
    private Integer idAnime;
    private Integer numcap;
    private String titulo;
    private String descripcion;
    private Integer duracion;
    private Date fecha;
    private String ruta;
    private Integer numTemporada;
    private String NomTemporada;

    public Integer getIdCap() {
        return idCap;
    }

    public void setIdCap(Integer idCap) {
        this.idCap = idCap;
    }

    public Integer getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(Integer idAnime) {
        this.idAnime = idAnime;
    }

    public Integer getNumcap() {
        return numcap;
    }

    public void setNumcap(Integer numcap) {
        this.numcap = numcap;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getNomTemporada() {
        return NomTemporada;
    }

    public void setNomTemporada(String NomTemporada) {
        this.NomTemporada = NomTemporada;
    }
    
    
}
