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
@Table(name = "animes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Animes.FindAll", query = "SELECT an FROM Animes an" ),
    @NamedQuery(name = "Animes.FindByidAnime", query = "SELECT an FROM Animes an WHERE an.idAnime = :idAnime" ),
    @NamedQuery(name = "Animes.FindBytitOriginal", query = "SELECT an FROM Animes an WHERE an.titOriginal = :titOriginal" ),
    @NamedQuery(name = "Animes.FindBytitSecund", query = "SELECT an FROM Animes an WHERE an.titSecund = :titSecund" ),
    @NamedQuery(name = "Animes.FindByDescripcionA", query = "SELECT an FROM Animes an WHERE an.DescripcionA = :DescripcionA" ),
    @NamedQuery(name = "Animes.FindByGen1", query = "SELECT an FROM Animes an WHERE an.Gen1 = :Gen1" ),
    @NamedQuery(name = "Animes.FindByGen2", query = "SELECT an FROM Animes an WHERE an.Gen2 = :Gen2" ),
    @NamedQuery(name = "Animes.FindByGen3", query = "SELECT an FROM Animes an WHERE an.Gen3 = :Gen3" ),
    @NamedQuery(name = "Animes.FindByfechalanza", query = "SELECT an FROM Animes an WHERE an.fechalanza = :fechalanza" ),
    @NamedQuery(name = "Animes.FindBypost", query = "SELECT an FROM Animes an WHERE an.post = :post" ),
    @NamedQuery(name = "Animes.FindByEstad", query = "SELECT an FROM Animes an WHERE an.Estad = :Estad" ),
})
public class Animes implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_anime")
    private Integer idAnime;
    @Column(name = "titulo_ori")
    private String titOriginal;
    @Column(name = "titulo_secu")
    private String titSecund;
    @Column(name = "descripcion")
    private String DescripcionA;
    @Column(name = "Genero_one")
    private Integer Gen1;
    @Column(name = "Genero_two")
    private Integer Gen2;
    @Column(name = "Genero_three")
    private Integer Gen3;
    @Column(name = "fecha")
    private Date fechalanza;
    @Column(name = "ImgGeneral")
    private byte[] post;
    @Column(name = "Estado")
    private Integer Estad;

    public Integer getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(Integer idAnime) {
        this.idAnime = idAnime;
    }

    public String getTitOriginal() {
        return titOriginal;
    }

    public void setTitOriginal(String titOriginal) {
        this.titOriginal = titOriginal;
    }

    public String getTitSecund() {
        return titSecund;
    }

    public void setTitSecund(String titSecund) {
        this.titSecund = titSecund;
    }

    public String getDescripcionA() {
        return DescripcionA;
    }

    public void setDescripcionA(String DescripcionA) {
        this.DescripcionA = DescripcionA;
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

    public Date getFechalanza() {
        return fechalanza;
    }

    public void setFechalanza(Date fechalanza) {
        this.fechalanza = fechalanza;
    }

    public Integer getEstad() {
        return Estad;
    }

    public void setEstad(Integer Estad) {
        this.Estad = Estad;
    }

    public byte[] getPost() {
        return post;
    }

    public void setPost(byte[] post) {
        this.post = post;
    }
    
    public int hashCode(){
        int hash = 0;
        hash += (idAnime != null ? idAnime.hashCode() : 0);
        return hash;
    }
    
    public boolean equals ( Object object){
        if( !(object instanceof Animes)){
            return false;
       }
        Animes other = (Animes) object;
        if((this.idAnime == null && other.idAnime != null) || (this.idAnime != null && !this.idAnime.equals(other.idAnime))){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "video.model.Animes[ idAnime=" + idAnime +"]";
    }
}
