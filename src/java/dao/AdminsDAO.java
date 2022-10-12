/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.SessionConfig;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Admins;

/**
 *
 * @author WahyuAu
 */
public class AdminsDAO {
    
    
    SessionConfig sessionConfig = new SessionConfig();
    
    public List<Admins> getAll() {
        Session session = sessionConfig.openSession(Admins.class);
        Transaction trans = session.beginTransaction();
        
        String hql = "FROM Admins";
        System.out.println("dao 1");
        Query query = session.createQuery(hql);
        System.out.println("dao 2");
        List<Admins> adminsList = query.list();
        System.out.println(adminsList);
        System.out.println("dao 3");
        
        trans.commit();
        session.close();
        return adminsList;
    }
    
    public boolean get(String username, String password) {
        Admins admin = null;
        
        Session session = sessionConfig.openSession(Admins.class);
        Transaction trans = session.beginTransaction();
        
        String hql = "FROM Admins WHERE username = :username AND password = :password";
        Query query = session.createQuery(hql);
        query.setString("username", username);
        query.setString("password", password);
        System.out.println(username + " : " + password);
        admin = (Admins)query.uniqueResult();
        session.get(Admins.class, admin.getId());
        
        trans.commit();
        session.close();
        
        return admin != null;
    }
    
    public static void main(String[] args) {
        AdminsDAO adminsDao = new AdminsDAO();
        
        List<Admins> admins = adminsDao.getAll();
        
        System.out.println(admins.toString());
        System.out.println(adminsDao.get("superadmin", "superadmin123"));
    }
    
}
