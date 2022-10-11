/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.SessionConfig;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Admins;

/**
 *
 * @author User
 */
public class AdminsDAO {
    
    SessionConfig sessionConfig = new SessionConfig();
    
    public List<Admins> getAll() {
        Admins admins = null;
        
        Session session = sessionConfig.openSession(Admins.class);
        Transaction trans = session.beginTransaction();
        
        String hql = "FROM Admins";
        Query query = session.createQuery(hql);
        List<Admins> result = query.list();
        
        trans.commit();
        session.close();
        return result;
    }
    
    public static void main(String[] args) {
        AdminsDAO adminsDao = new AdminsDAO();
        
        List<Admins> admins = adminsDao.getAll();
        System.out.println(admins.toString());
    }
    
}
