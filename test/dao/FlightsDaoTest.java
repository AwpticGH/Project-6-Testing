/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Airplanes;
import pojo.Flights;
import pojo.Routes;

/**
 *
 * @author Sukhs
 */
public class FlightsDaoTest {
    
    public FlightsDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class FlightsDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        FlightsDao instance = new FlightsDao();
        String expResult = "1";
        List<Flights> result = null;
        result = instance.getAll();
        assertEquals(expResult, String.valueOf(result.get(0).getId()));
    }

    /**
     * Test of getById method, of class FlightsDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 1;
        FlightsDao instance = new FlightsDao();
        String expResult = "118";
        Flights result = instance.getById(id);
        assertEquals(expResult, String.valueOf(result.getRoutes().getId()));
    }

    /**
     * Test of create method, of class FlightsDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        FlightsDao instance = new FlightsDao();
        Flights pojo = new Flights();
        
        AirplanesDao airplaneDao = new AirplanesDao();
        Airplanes airplane = airplaneDao.getById(33);
        pojo.setAirplanes(airplane);
        
        RoutesDao routeDao = new RoutesDao();
        Routes route = routeDao.getById(7130);
        pojo.setRoutes(route);
        
        Date date = new Date();
        pojo.setTimeOfDeparture(date);
        
        boolean result = instance.create(pojo);
        assertTrue(result);
    }

    /**
     * Test of update method, of class FlightsDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        FlightsDao instance = new FlightsDao();
        Flights pojo = instance.getById(5);
        
        AirplanesDao airplaneDao = new AirplanesDao();
        Airplanes airplane = airplaneDao.getById(33);
        pojo.setAirplanes(airplane);
        
        RoutesDao routeDao = new RoutesDao();
        Routes route = routeDao.getById(7130);
        pojo.setRoutes(route);
        
        Date date = new Date();
        pojo.setTimeOfDeparture(date);
        
        boolean result = instance.update(pojo);
        assertTrue(result);
    }
    
}
