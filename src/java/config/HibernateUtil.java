/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author rafifajarrr
 */
public class HibernateUtil {
    
    Configuration cfg;
    
    public Session openSession(Class annotatedClass) {
        cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(annotatedClass);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        
        SessionFactory sf = cfg.buildSessionFactory(reg);
        Session session = sf.openSession();
        
        return session;
    }
    
    
    
}
