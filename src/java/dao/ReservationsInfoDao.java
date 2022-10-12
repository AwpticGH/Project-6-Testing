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
    
    public List<ReservationsInfo> getAll() {
        List<Object> results = super.getAll(ReservationsInfo.class);
        List<ReservationsInfo> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(ReservationsInfo.class.cast(result));
        });
        
        return list;
    }
    
    public Admins getById() {
        return Admins.class.cast(super.getById(ReservationsInfo.class, 1));
    }
    
}
