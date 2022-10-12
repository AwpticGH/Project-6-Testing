/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.Admins;
import pojo.Airports;

/**
 *
 * @author rafifajarrr
 */
public class AirportsDao extends BaseDao {
    
    public List<Airports> getAll() {
        List<Object> results = super.getAll(Airports.class);
        List<Airports> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Airports.class.cast(result));
        });
        
        return list;
    }
    
    public Admins getById() {
        return Admins.class.cast(super.getById(Airports.class, 1));
    }
}
