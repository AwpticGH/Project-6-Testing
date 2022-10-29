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
        List<Flights> expResult = null;
        List<Flights> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class FlightsDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        FlightsDao instance = new FlightsDao();
        Flights expResult = null;
        Flights result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class FlightsDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object pojo = null;
        FlightsDao instance = new FlightsDao();
        boolean expResult = false;
        boolean result = instance.create(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class FlightsDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object pojo = null;
        FlightsDao instance = new FlightsDao();
        boolean expResult = false;
        boolean result = instance.update(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FlightsDao.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FlightsDao.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
