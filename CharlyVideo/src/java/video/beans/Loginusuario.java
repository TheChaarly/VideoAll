/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.beans;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.apache.commons.codec.binary.Base64;
import video.dao.imp.UsuarioDAOImp;
import video.dto.UsuarioDTO;
import video.model.Usuario;

/**
 *
 * @author TheChaarly
 */
@ManagedBean (name = "loginusuario")
@SessionScoped
public class Loginusuario {
    private Usuario usuario;
    private UsuarioDAOImp usuarioDAOImp; 
    private String Username;
    private String Contrase;
    private List<UsuarioDTO> listusudto;
    private byte[] foto;
    private String Alias;
    private String fotico;
    
    public Loginusuario(){
        
    }
    
    public void loguiIn(){
        System.out.println("User: " + Username + " - Password: " + Contrase);
        usuarioDAOImp = new UsuarioDAOImp();
        UsuarioDTO usu = new UsuarioDTO();
        listusudto = usuarioDAOImp.logueo(Username, Contrase);
        System.out.println("1.- " + usu.getAlias() );
        
        if(listusudto.size() != 0){
            for(UsuarioDTO usuario:listusudto){
                    System.out.println(" tipo usuario: " + usuario.getTip());
                    Alias = usuario.getAlias();
                    System.out.println("Alias " + Alias);
                    foto = usuario.getFot();
                    Base64 codec = new Base64();
                    fotico = codec.encodeBase64String(foto);
                    System.out.println("encode" + fotico);
                try {
                    ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
                    context.redirect(context.getRequestContextPath() + "/pages/inicioAdmin.xhtml");
                } catch (IOException ex) {
                    Logger.getLogger(Loginusuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getContrase() {
        return Contrase;
    }

    public void setContrase(String Contrase) {
        this.Contrase = Contrase;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioDAOImp getUsuarioDAOImp() {
        return usuarioDAOImp;
    }

    public void setUsuarioDAOImp(UsuarioDAOImp usuarioDAOImp) {
        this.usuarioDAOImp = usuarioDAOImp;
    }

    public List<UsuarioDTO> getListusudto() {
        return listusudto;
    }

    public void setListusudto(List<UsuarioDTO> listusudto) {
        this.listusudto = listusudto;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getFotico() {
        return fotico;
    }

    public void setFotico(String fotico) {
        this.fotico = fotico;
    }
    
    
}
