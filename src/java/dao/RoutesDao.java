/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.Admins;
import pojo.Routes;
import query.RoutesQuery;

/**
 *
 * @author rafifajarrr
 */
public class RoutesDao extends BaseDao {
    
    public List<Routes> getAll() {
        String sql = RoutesQuery.query;
        
        List<Object> results = super.getWithSql(Routes.class, sql);
        List<Routes> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Routes.class.cast(result));
        });
        
        return list;
    }
    
    public Admins getById() {
        return Admins.class.cast(super.getById(Routes.class, 1));
    }
    
    public static void main(String[] args) {
        
        RoutesDao dao = new RoutesDao();
        List<Routes> routes = dao.getAll();
        
        routes.forEach((route) -> {
            System.out.println(route);
        });
    }
}
