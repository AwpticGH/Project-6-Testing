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
import pojo.Airplanes;
import pojo.Airports;
import pojo.Flights;
import pojo.Routes;

/**
 *
 * @author rafifajarrr
 */
public class FlightsDao extends BaseDao {
    
    String fetch1 = "airplanes";
    String fetch2 = "routes";
    
    public List<Flights> getAll() {
        List<Object> flights = super.getAllWithFetch(Flights.class, fetch1, fetch2);
        List<Flights> list = new ArrayList<>();
        
        flights.forEach((result) -> {
            list.add(Flights.class.cast(result));
        });
        
        return list;
    }
    
    public Flights getById(int id) {
        return Flights.class.cast(super.getByIdWithFetch(Flights.class, id, fetch1, fetch2));
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
