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
import video.dto.TempoAnimeDTO;
import video.model.TempoAnime;
import video.util.HibernateUtil;

/**
 *
 * @author TheChaarly
 */
public class TempoAnimevDAOImp {

    public List<TempoAnimeDTO> getlistTempoAnime(Integer idanime2) {
        List<TempoAnimeDTO> list = null;
        ResultSet rs;
        Connection conexion;
        Session session = HibernateUtil.getSessionFactory().openSession();
        conexion = session.connection();
        try {
            String query = " SELECT id_tem, NombreTemp FROM animes a INNER JOIN tempoanime t ON a.id_anime = t.id_anime WHERE a.id_anime = " + idanime2;
            System.out.println("query " + query.toString());
            Statement s = conexion.createStatement();
            rs = s.executeQuery(query);
            TempoAnimeDTO tempoanime = null;
            list = new ArrayList();
            while(rs.next()){
                tempoanime = new TempoAnimeDTO();
                tempoanime.setIdTemporada(rs.getInt(1));
                tempoanime.setNombreTemporada(rs.getString(2));
                list.add(tempoanime);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }finally{
            session.close();
        }
        return list;
    }


}
