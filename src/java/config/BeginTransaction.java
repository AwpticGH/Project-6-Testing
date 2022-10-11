/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author rafifajarrr
 */
public class BeginTransaction {
    
    Configuration cfg;
    
    public void create(Class annotatedClass) {
        cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(annotatedClass);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings();
    }
    
    
    
}
