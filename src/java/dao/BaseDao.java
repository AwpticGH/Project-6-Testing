/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Entity;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
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
    
    public List<Object> getWithSql(Class pojo, String sql) {
        Session session = hibernateUtil.openSession(pojo);
        Transaction trans = null;
        List<Object> resultList = null;
        
        try {
            trans = session.beginTransaction();
            SQLQuery query = session.createSQLQuery(sql);
            resultList = query.list();

            trans.commit();
        } 
        catch (HibernateException e) {
            if (trans!=null) trans.rollback();
            e.printStackTrace(); 
        } 
        finally {
            session.close(); 
        }
        
        return resultList;
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
