/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.SessionConfig;
import org.hibernate.Transaction;

/**
 *
 * @author rafifajarrr
 */
public class BaseDAO {
    
    SessionConfig trConfigure = new SessionConfig();
    
    public void get(Class annotatedClass) {
        Transaction tr = trConfigure.beginTransaction(annotatedClass);
        
        
    }
    
}
