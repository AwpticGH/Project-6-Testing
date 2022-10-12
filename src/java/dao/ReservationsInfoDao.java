/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.Admins;
import pojo.ReservationsInfo;

/**
 *
 * @author rafifajarrr
 */
public class ReservationsInfoDao extends BaseDao {
    
    String fetch = "reservations";
    
    public List<ReservationsInfo> getAll() {
        List<Object> results = super.getAllWithFetch(ReservationsInfo.class, fetch);
        List<ReservationsInfo> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(ReservationsInfo.class.cast(result));
        });
        
        return list;
    }
    
    public ReservationsInfo getById(int id) {
        return ReservationsInfo.class.cast(super.getByIdWithFetch(ReservationsInfo.class, id, fetch));
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
