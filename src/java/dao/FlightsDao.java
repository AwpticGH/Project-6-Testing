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
    
    public List<Flights> getAll() {
//        List<Object> airports = super.getAll(Airports.class);
//        List<Object> routes = super.getAll(Routes.class);
//        
//        List<Object> airlines = super.getAll(Airlines.class);
//        List<Object> airplanes = super.getAll(Airplanes.class);
        
        List<Object> flights = super.getAll(Flights.class);
        List<Flights> list = new ArrayList<>();
        
        flights.forEach((result) -> {
            list.add(Flights.class.cast(result));
        });
        
        return list;
    }
    
    public Admins getById() {
        return Admins.class.cast(super.getById(Flights.class, 1));
    }
    
    public static void main(String[] args) {
        FlightsDao dao = new FlightsDao();
        List<Flights> flights = dao.getAll();
        
        flights.forEach((flight) -> {
           System.out.println(flight); 
           System.out.println(flight.getId()); 
           System.out.println(flight.getAirplanes()); 
           System.out.println(flight.getRoutes()); 
           System.out.println(flight.getTimeOfDeparture());
           
           System.out.println("\n\n");
        });
    }
    
}
