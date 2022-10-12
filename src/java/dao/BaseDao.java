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
        try {
            Transaction trans = session.beginTransaction();

            Criteria criteria = session.createCriteria(pojo);
            this.entityList = criteria.list();

            trans.commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return entityList;
    }
    
    public List<Object> getAllWithFetch(Class pojo, String fetch) {
        Transaction trans = null;
        Session session = hibernateUtil.openSession(pojo);
        
        try {
            trans = session.beginTransaction();
            Criteria criteria = session.createCriteria(pojo);
            criteria.setFetchMode(fetch, FetchMode.EAGER);
            
            this.entityList = criteria.list();
            trans.commit();
        }
        catch (Exception e) {
            e.getMessage();
        }
        finally {
            session.close();
        }
        return entityList;
    }
    
    public List<Object> getAllWithFetch(Class pojo, String fetch1, String fetch2) {
        Transaction trans = null;
        Session session = hibernateUtil.openSession(pojo);
        
        try {
            trans = session.beginTransaction();
            Criteria criteria = session.createCriteria(pojo);
            criteria.setFetchMode(fetch1, FetchMode.EAGER);
            criteria.setFetchMode(fetch2, FetchMode.EAGER);
            
            this.entityList = criteria.list();
            System.out.println("Base");
            System.out.println(entityList);
            trans.commit();
        }
        catch (Exception e) {
            e.getMessage();
        }
        finally {
            session.close();
        }
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
    
    public Object getByIdWithFetch(Class pojo, int id, String fetch) {
        Transaction trans = null;
        Session session = hibernateUtil.openSession(pojo);
        
        try {
            trans = session.beginTransaction();
            Criteria criteria = session.createCriteria(pojo);
            criteria.setFetchMode(fetch, FetchMode.EAGER).add(Restrictions.eq("id", id));
            
            this.entity = criteria.uniqueResult();
            trans.commit();
        }
        catch (Exception e) {
            e.getMessage();
        }
        finally {
            session.close();
        }
        return entity;
    }
    
    public Object getByIdWithFetch(Class pojo, int id, String fetch1, String fetch2) {
        Transaction trans = null;
        Session session = hibernateUtil.openSession(pojo);
        
        try {
            trans = session.beginTransaction();
            Criteria criteria = session.createCriteria(pojo);
            criteria.setFetchMode(fetch1, FetchMode.EAGER);
            criteria.setFetchMode(fetch2, FetchMode.EAGER).add(Restrictions.eq("id", id));
            
            this.entity = criteria.uniqueResult();
            trans.commit();
        }
        catch (Exception e) {
            e.getMessage();
        }
        finally {
            session.close();
        }
        return entity;
    }
    public boolean update(Object pojo){
        Transaction trans = null;
        Session session = hibernateUtil.openSession(pojo.getClass());
        boolean success = false;
        try {
            trans = session.beginTransaction();
            session.update(pojo);
            trans.commit();
            success = true;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            session.close();
        }
        
        return success;
    }
    
    public boolean create(Object pojo) {
        Transaction trans = null;
        Session session = hibernateUtil.openSession(pojo.getClass());
        boolean success = false;
        try {
            trans = session.beginTransaction();
            session.save(pojo);
            trans.commit();
            success = true;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            session.close();
        }
        return success;
    }
}
