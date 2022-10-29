/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Airports;
import pojo.Routes;

/**
 *
 * @author Sukhs
 */
public class RoutesDaoTest {
    
    public RoutesDaoTest() {
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
     * Test of getAll method, of class RoutesDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        RoutesDao instance = new RoutesDao();
        List<Routes> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class RoutesDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 118;
        RoutesDao instance = new RoutesDao();
        String expResult = "CGK";
        Routes result = instance.getById(id);
        assertEquals(expResult, result.getAirportsByDepartureId().getCode());
    }

    /**
     * Test of create method, of class RoutesDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        RoutesDao instance = new RoutesDao();
        Routes pojo = new Routes();
        pojo.setId(9998);
        
        AirportsDao airportDao = new AirportsDao();
        Airports departure = airportDao.getById(5);
        pojo.setAirportsByDepartureId(departure);
        
        Airports destination = airportDao.getById(10);
        pojo.setAirportsByDestinationId(destination);
        
        pojo.setTimeOfFlight(300);
        
        boolean result = instance.create(pojo);
        assertTrue(result);
    }

    /**
     * Test of update method, of class RoutesDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        RoutesDao instance = new RoutesDao();
        Routes pojo = instance.getById(9999);
        pojo.setId(9999);
        
        AirportsDao airportDao = new AirportsDao();
        Airports departure = airportDao.getById(10);
        pojo.setAirportsByDepartureId(departure);
        
        Airports destination = airportDao.getById(5);
        pojo.setAirportsByDestinationId(destination);
        
        pojo.setTimeOfFlight(399);
        
        boolean result = instance.update(pojo);
        assertTrue(result);
    }
}
