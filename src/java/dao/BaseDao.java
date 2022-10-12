/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.HibernateUtil;
import java.util.List;
import javax.persistence.Entity;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Admins;

/**
 *
 * @author rafifajarrr
 */
public class BaseDao {
    
    HibernateUtil hibernateUtil = new HibernateUtil();
    List<Object> entityList = null;
    Object entity = null;
    
    
    public List<Object> getAll(Class pojo) {
        Session session = hibernateUtil.openSession(pojo);
        Transaction trans = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(pojo);
        this.entityList = criteria.list();
        
        trans.commit();
        session.close();
        return entityList;
    }
    
    
    public Object getById(Class pojo, int id) {
        Session session = hibernateUtil.openSession(pojo);
        Transaction trans = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(pojo).add(Restrictions.eq("id", id));
        this.entity = criteria.uniqueResult();
        
        trans.commit();
        session.close();
        return entity;
    }
    
    
}
