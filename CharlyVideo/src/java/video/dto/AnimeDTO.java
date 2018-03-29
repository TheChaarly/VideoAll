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
public class AnimeDTO {
    
    private Integer idanime;
    private String titOrig;
    private String titSecun;
    private String Descrip;
    private Integer Gen1;
    private Integer Gen2;
    private Integer Gen3;
    private Date fechaLanz;
    private Date fechafin;
    private byte[] poster; 
    private String estatus;
    private String Clasifica;
    private Integer estado;
    private String Idioma;
    private String subtitulos;
    private Integer CapIn;
    private Integer CapFn;

    public Integer getIdanime() {
        return idanime;
    }

    public void setIdanime(Integer idanime) {
        this.idanime = idanime;
    }

    public String getTitOrig() {
        return titOrig;
    }

    public void setTitOrig(String titOrig) {
        this.titOrig = titOrig;
    }

    public String getTitSecun() {
        return titSecun;
    }

    public void setTitSecun(String titSecun) {
        this.titSecun = titSecun;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public Integer getGen1() {
        return Gen1;
    }

    public void setGen1(Integer Gen1) {
        this.Gen1 = Gen1;
    }

    public Integer getGen2() {
        return Gen2;
    }

    public void setGen2(Integer Gen2) {
        this.Gen2 = Gen2;
    }

    public Integer getGen3() {
        return Gen3;
    }

    public void setGen3(Integer Gen3) {
        this.Gen3 = Gen3;
    }

    public Date getFechaLanz() {
        return fechaLanz;
    }

    public void setFechaLanz(Date fechaLanz) {
        this.fechaLanz = fechaLanz;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getClasifica() {
        return Clasifica;
    }

    public void setClasifica(String Clasifica) {
        this.Clasifica = Clasifica;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
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

    public Integer getCapIn() {
        return CapIn;
    }

    public void setCapIn(Integer CapIn) {
        this.CapIn = CapIn;
    }

    public Integer getCapFn() {
        return CapFn;
    }

    public void setCapFn(Integer CapFn) {
        this.CapFn = CapFn;
    }
    
    
    
}
