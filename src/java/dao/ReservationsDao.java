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
    
    public List<Reservations> getAll() {
        List<Object> results = super.getAll(Reservations.class);
        List<Reservations> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Reservations.class.cast(result));
        });
        
        return list;
    }
    
    public Admins getById() {
        return Admins.class.cast(super.getById(Reservations.class, 1));
    }
}
