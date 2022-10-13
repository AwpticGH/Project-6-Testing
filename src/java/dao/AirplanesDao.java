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
    
    String fetch = "airlines";
    
    public List<Airplanes> getAll() {
        List<Object> results = super.getAllWithFetch(Airplanes.class, fetch);
        List<Airplanes> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Airplanes.class.cast(result));
        });
        
        return list;
    }
    
    public Airplanes getById(int id) {
        return Airplanes.class.cast(super.getByIdWithFetch(Airplanes.class, id, fetch));
    }
    
    @Override
    public boolean create(Object pojo) {
        return super.create(pojo);
    }
    
    @Override
    public boolean update(Object pojo) {
        return super.update(pojo);
    }
}
