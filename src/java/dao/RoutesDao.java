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

/**
 *
 * @author rafifajarrr
 */
public class RoutesDao extends BaseDao {
    
    public List<Routes> getAll() {
        List<Object> results = super.getAll(Routes.class);
        List<Routes> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Routes.class.cast(result));
        });
        
        return list;
    }
    
    public Admins getById() {
        return Admins.class.cast(super.getById(Routes.class, 1));
    }
}
