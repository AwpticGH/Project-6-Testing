/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.Admins;
import pojo.Reservations;

/**
 *
 * @author rafifajarrr
 */
public class ReservationsDao extends BaseDao {
    
    String fetch1 = "flights";
    String fetch2 = "users";
    
    public List<Reservations> getAll() {
        List<Object> results = super.getAllWithFetch(Reservations.class, fetch1, fetch2);
        List<Reservations> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Reservations.class.cast(result));
        });
        
        return list;
    }
    
    public Reservations getById(int id) {
        return Reservations.class.cast(super.getByIdWithFetch(Reservations.class, id, fetch1, fetch2));
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
