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
@Table(name = "tempoAnime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TempoAnime.FindAll", query = "SELECT ta FROM TempoAnime ta" ),
    @NamedQuery(name = "TempoAnime.FindByidTemporada", query = "SELECT ta FROM TempoAnime ta WHERE ta.idTemporada = :idTemporada" ),
    @NamedQuery(name = "TempoAnime.FindByNombreTemporada", query = "SELECT ta FROM TempoAnime ta WHERE ta.NombreTemporada = :NombreTemporada" ),
    @NamedQuery(name = "TempoAnime.FindByNumeroDTemporada", query = "SELECT ta FROM TempoAnime ta WHERE ta.NumeroDTemporada = :NumeroDTemporada" ),
    @NamedQuery(name = "TempoAnime.FindByfechaLanz", query = "SELECT ta FROM TempoAnime ta WHERE ta.fechaLanz = :fechaLanz" ),
    @NamedQuery(name = "TempoAnime.FindByfechaFinal", query = "SELECT ta FROM TempoAnime ta WHERE ta.fechaFinal = :fechaFinal" ),
    @NamedQuery(name = "TempoAnime.FindByimg", query = "SELECT ta FROM TempoAnime ta WHERE ta.img = :img" ),
    @NamedQuery(name = "TempoAnime.FindByestatusT", query = "SELECT ta FROM TempoAnime ta WHERE ta.estatusT = :estatusT" ),
    @NamedQuery(name = "TempoAnime.FindByClasifica", query = "SELECT ta FROM TempoAnime ta WHERE ta.Clasifica = :Clasifica" ),
    @NamedQuery(name = "TempoAnime.FindByIdiomaT", query = "SELECT ta FROM TempoAnime ta WHERE ta.IdiomaT = :IdiomaT" ),    
    @NamedQuery(name = "TempoAnime.FindBySubtitulosT", query = "SELECT ta FROM TempoAnime ta WHERE ta.SubtitulosT = :SubtitulosT" ),
    @NamedQuery(name = "TempoAnime.FindByCapituloActual", query = "SELECT ta FROM TempoAnime ta WHERE ta.CapituloActual = :CapituloActual" ),
    @NamedQuery(name = "TempoAnime.FindByCapituloFinal", query = "SELECT ta FROM TempoAnime ta WHERE ta.CapituloFinal = :CapituloFinal" ),    
    @NamedQuery(name = "TempoAnime.FindByidAnime", query = "SELECT ta FROM TempoAnime ta WHERE ta.idAnime = :idAnime" ),
    @NamedQuery(name = "TempoAnime.FindByFechaTemp", query = "SELECT ta FROM TempoAnime ta WHERE ta.FechaTemp = :FechaTemp" )
})
public class TempoAnime implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tem")
    private Integer idTemporada;
    @Column(name = "id_Anime")
    private Integer idAnime;
    @Column(name = "NombreTemp")
    private String NombreTemporada;
    @Column(name = "NumTemp")
    private Integer NumeroDTemporada;
    @Column(name = "Fecha_lanza")
    private Date fechaLanz;
    @Column(name = "Fecha_Fin")
    private Date fechaFinal;
    @Column(name = "Poster")
    private byte[] img;
    @Column(name = "Estatus") 
    private String estatusT;
    @Column(name = "Clasificacion") 
    private String Clasifica;
    @Column(name = "Idioma") 
    private String IdiomaT;
    @Column(name = "Subtitulos") 
    private String SubtitulosT;
    @Column(name = "Cap_actual") 
    private Integer CapituloActual;
    @Column(name = " Cap_fin") 
    private Integer CapituloFinal;    
    @Column(name = "fecha")
    private Date FechaTemp;

    public Integer getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }

    public String getNombreTemporada() {
        return NombreTemporada;
    }

    public void setNombreTemporada(String NombreTemporada) {
        this.NombreTemporada = NombreTemporada;
    }

    public Integer getNumeroDTemporada() {
        return NumeroDTemporada;
    }

    public void setNumeroDTemporada(Integer NumeroDTemporada) {
        this.NumeroDTemporada = NumeroDTemporada;
    }

    public Integer getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(Integer idAnime) {
        this.idAnime = idAnime;
    }

    public Date getFechaTemp() {
        return FechaTemp;
    }

    public void setFechaTemp(Date FechaTemp) {
        this.FechaTemp = FechaTemp;
    }

    public Date getFechaLanz() {
        return fechaLanz;
    }

    public void setFechaLanz(Date fechaLanz) {
        this.fechaLanz = fechaLanz;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getEstatusT() {
        return estatusT;
    }

    public void setEstatusT(String estatusT) {
        this.estatusT = estatusT;
    }

    public String getClasifica() {
        return Clasifica;
    }

    public void setClasifica(String Clasifica) {
        this.Clasifica = Clasifica;
    }

    public String getIdiomaT() {
        return IdiomaT;
    }

    public void setIdiomaT(String IdiomaT) {
        this.IdiomaT = IdiomaT;
    }

    public String getSubtitulosT() {
        return SubtitulosT;
    }

    public void setSubtitulosT(String SubtitulosT) {
        this.SubtitulosT = SubtitulosT;
    }

    public Integer getCapituloActual() {
        return CapituloActual;
    }

    public void setCapituloActual(Integer CapituloActual) {
        this.CapituloActual = CapituloActual;
    }

    public Integer getCapituloFinal() {
        return CapituloFinal;
    }

    public void setCapituloFinal(Integer CapituloFinal) {
        this.CapituloFinal = CapituloFinal;
    }
    
    public int hashCode(){
        int hash = 0;
        hash += (idTemporada != null ? idTemporada.hashCode() : 0);
        return hash;
    }
    
    public boolean equals ( Object object){
        if( !(object instanceof TempoAnime)){
            return false;
       }
        TempoAnime other = (TempoAnime) object;
        if((this.idTemporada == null && other.idTemporada != null) || (this.idTemporada != null && !this.idTemporada.equals(other.idTemporada))){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "video.model.TempoAnime[ idTemporada=" + idTemporada +"]";
    }    
}
