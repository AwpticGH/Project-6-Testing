/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.Admins;
import pojo.Airplanes;
import pojo.Flights;

/**
 *
 * @author rafifajarrr
 */
public class AirplanesDao extends BaseDao {
    
    public List<Airplanes> getAll() {
        List<Object> results = super.getAll(Airplanes.class);
        List<Airplanes> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Airplanes.class.cast(result));
        });
        
        return list;
    }
    
    public Admins getById() {
        return Admins.class.cast(super.getById(Airplanes.class, 1));
    }
}
