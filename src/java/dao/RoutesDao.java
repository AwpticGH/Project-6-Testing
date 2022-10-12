/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import pojo.Routes;

/**
 *
 * @author rafifajarrr
 */
public class RoutesDao extends BaseDao {
        
    String fetch1 = "airportsByDepartureId";
    String fetch2 = "airportsByDestinationId";
    
    public List<Routes> getAll() {
        List<Object> results = super.getAllWithFetch(Routes.class, fetch1, fetch2);
        List<Routes> list = new ArrayList<>();
        
        results.forEach((result) -> {
            list.add(Routes.class.cast(result));
        });
        
        return list;
    }
    
    public Routes getById(int id) {
        return Routes.class.cast(super.getByIdWithFetch(Routes.class, id, fetch1, fetch2));
    }
    
    @Override
    public boolean create(Object pojo) {
        return super.create(pojo);
    }
    
    @Override
    public boolean update(Object pojo) {
        return super.update(pojo);
    }
    
    public static void main(String[] args) {
        
//        RoutesDao dao = new RoutesDao();
//        List<Routes> routes = dao.getAll();
//        Routes rout = dao.getById(118);
        
        
        
//        routes.forEach((route) -> {
//            System.out.println(route.getId());
//            System.out.println(route.getAirportsByDepartureId().getName());
//            System.out.println(route.getAirportsByDestinationId().getName());
//            System.out.println(route.getTimeOfFlight());
//            System.out.println("\n\n");
//        });

//        System.out.println(rout.getId());
//        System.out.println(rout.getAirportsByDepartureId().getName());
//        System.out.println(rout.getAirportsByDestinationId().getName());
//        System.out.println(rout.getTimeOfFlight());
    }
    
    
}
