/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TheChaarly
 */
@Entity
@Table(name = "cap_anime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CapAnime.FindAll", query = "SELECT ca FROM CapAnime ca" ),
    @NamedQuery(name = "Estado.FindByidCap", query = "SELECT ca FROM CapAnime ca WHERE ca.idCap = :idCap" ),
    @NamedQuery(name = "Estado.FindByidTemporada", query = "SELECT ca FROM CapAnime ca WHERE ca.idTemporada = :idTemporada" ),
    @NamedQuery(name = "Estado.FindByNCap", query = "SELECT ca FROM CapAnime ca WHERE ca.NCap = :NCap" ),
    @NamedQuery(name = "Estado.FindByTitcap", query = "SELECT ca FROM CapAnime ca WHERE ca.Titcap = :Titcap" ),
    @NamedQuery(name = "Estado.FindByDesc", query = "SELECT ca FROM CapAnime ca WHERE ca.Desc = :Desc" ),
    @NamedQuery(name = "Estado.FindByDura", query = "SELECT ca FROM CapAnime ca WHERE ca.Dura = :Dura" ),
    @NamedQuery(name = "Estado.FindByfechExt", query = "SELECT ca FROM CapAnime ca WHERE ca.fechExt = :fechExt" ),
    @NamedQuery(name = "Estado.FindByfech", query = "SELECT ca FROM CapAnime ca WHERE ca.fech = :fech" ),
    @NamedQuery(name = "Estado.FindByruta", query = "SELECT ca FROM CapAnime ca WHERE ca.ruta = :ruta" )
    
})
public class CapAnime implements Serializable{
            private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_capanime")    
    private Integer idCap;
    @Column(name = "id_temp")    
    private Integer idTemporada;
    @Column(name = "num_cap")    
    private Integer NCap;
    @Column(name = "titulo")    
    private String Titcap;
    @Column(name = "Descripcion")    
    private String Desc;
    @Column(name = "Duracion")    
    private Integer Dura;
    @Column(name = "fecha_extre")    
    private Date fechExt;
    @Column(name = "fecha")    
    private Date fech;
    @Column(name = "Ruta")    
    private byte[] ruta;

    public Date getFechExt() {
        return fechExt;
    }

    public void setFechExt(Date fechExt) {
        this.fechExt = fechExt;
    }

    public Integer getIdCap() {
        return idCap;
    }

    public void setIdCap(Integer idCap) {
        this.idCap = idCap;
    }

    public Integer getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }

    public Integer getNCap() {
        return NCap;
    }

    public void setNCap(Integer NCap) {
        this.NCap = NCap;
    }

    public String getTitcap() {
        return Titcap;
    }

    public void setTitcap(String Titcap) {
        this.Titcap = Titcap;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Integer getDura() {
        return Dura;
    }

    public void setDura(Integer Dura) {
        this.Dura = Dura;
    }

    public Date getFech() {
        return fech;
    }

    public void setFech(Date fech) {
        this.fech = fech;
    }

    public byte[] getRuta() {
        return ruta;
    }

    public void setRuta(byte[] ruta) {
        this.ruta = ruta;
    }
        
    public int hashCode(){
        int hash = 0;
        hash += (idCap != null ? idCap.hashCode() : 0);
        return hash;
    }
    
    public boolean equals ( Object object){
        if( !(object instanceof CapAnime)){
            return false;
       }
        CapAnime other = (CapAnime) object;
        if((this.idCap == null && other.idCap != null) || (this.idCap != null && !this.idCap.equals(other.idCap))){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "video.model.CapAnime[ idCap=" + idCap +"]";
    }
}
