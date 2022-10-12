/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.Admins;
import pojo.Airlines;
import pojo.Flights;

/**
 *
 * @author rafifajarrr
 */
public class AirlinesDao extends BaseDao {
    
    public List<Airlines> getAll() {
        List<Object> results = super.getAll(Airlines.class);
        List<Airlines> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Airlines.class.cast(result));
        });
        
        return list;
    }
    
    public Admins getById() {
        return Admins.class.cast(super.getById(Airlines.class, 1));
    }
}
