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

/**
 *
 * @author Sukhs
 */
public class AirportsDaoTest {
    
    public AirportsDaoTest() {
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
     * Test of getAll method, of class AirportsDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AirportsDao instance = new AirportsDao();
        List<Airports> expResult = null;
        List<Airports> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class AirportsDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        AirportsDao instance = new AirportsDao();
        Airports expResult = null;
        Airports result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AirportsDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object pojo = null;
        AirportsDao instance = new AirportsDao();
        boolean expResult = false;
        boolean result = instance.create(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AirportsDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object pojo = null;
        AirportsDao instance = new AirportsDao();
        boolean expResult = false;
        boolean result = instance.update(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
