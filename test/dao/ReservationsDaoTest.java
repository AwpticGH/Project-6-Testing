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
import pojo.Flights;
import pojo.Reservations;
import pojo.Users;

/**
 *
 * @author Sukhs
 */
public class ReservationsDaoTest {
    
    public ReservationsDaoTest() {
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
     * Test of getAll method, of class ReservationsDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ReservationsDao instance = new ReservationsDao();
        String expResult = "1";
        List<Reservations> result = instance.getAll();
        assertEquals(expResult, String.valueOf(result.get(0).getFlights().getId()));
    }

    /**
     * Test of getById method with NotEquals, of class ReservationsDao.
     */
    @Test
    public void testGetByIdNotEquals() {
        System.out.println("getById");
        int id = 1;
        ReservationsDao instance = new ReservationsDao();
        Reservations result = instance.getById(id);
        assertNotEquals("2", String.valueOf(result.getFlights().getId()));
    }
    
    /**
     * Test of getById method with Equals, of class ReservationsDao.
     */
    @Test
    public void testGetByIdEquals() {
        System.out.println("getById");
        int id = 1;
        ReservationsDao instance = new ReservationsDao();
        Reservations result = instance.getById(id);
        assertEquals("1", String.valueOf(result.getFlights().getId()));
    }

    /**
     * Test of create method, of class ReservationsDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ReservationsDao instance = new ReservationsDao();
        Reservations pojo = new Reservations();
        
        FlightsDao flightDao = new FlightsDao();
        Flights flight = flightDao.getById(2);
        pojo.setFlights(flight);
        
        UsersDao userDao = new UsersDao();
        Users user = userDao.getById(2);
        pojo.setUsers(user);
        
        pojo.setPaid(false);
        pojo.setActive(true);
        
        boolean result = instance.create(pojo);
        assertTrue(result);
    }

    /**
     * Test of update method, of class ReservationsDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ReservationsDao instance = new ReservationsDao();
        Reservations pojo = instance.getById(23);
        
        FlightsDao flightDao = new FlightsDao();
        Flights flight = flightDao.getById(2);
        pojo.setFlights(flight);
        
        UsersDao userDao = new UsersDao();
        Users user = userDao.getById(1);
        pojo.setUsers(user);
        
        pojo.setPaid(false);
        pojo.setActive(true);
        
        boolean result = instance.update(pojo);
        assertTrue(result);
    }
    
}
