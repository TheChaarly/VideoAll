/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.dao.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import video.dao.AnimeDAO;
import video.dto.AnimeDTO;
import video.dto.CapAnimeDTO;
import video.util.HibernateUtil;

/**
 *
 * @author TheChaarly
 */
public class AnimeDAOImp implements AnimeDAO{

    public List<AnimeDTO> getlisttitanimes() {
        List<AnimeDTO> list = null;
        ResultSet rs;
        Connection connexion;
        Session session = HibernateUtil.getSessionFactory().openSession();
        connexion = session.connection();
        try {
            String query = "Select * from animes";
            Statement s = connexion.createStatement();
            rs = s.executeQuery(query);
            AnimeDTO cap = null;
            list = new ArrayList();
            while(rs.next()){
                cap = new AnimeDTO();
                cap.setIdanime(rs.getInt(1));
                cap.setTitOrig(rs.getString(2));
                list.add(cap);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }finally{
            session.close();
        }        
        return list;
    }
    
}
