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
import pojo.Reservations;

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
        List<Reservations> expResult = null;
        List<Reservations> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class ReservationsDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        ReservationsDao instance = new ReservationsDao();
        Reservations expResult = null;
        Reservations result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ReservationsDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object pojo = null;
        ReservationsDao instance = new ReservationsDao();
        boolean expResult = false;
        boolean result = instance.create(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ReservationsDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object pojo = null;
        ReservationsDao instance = new ReservationsDao();
        boolean expResult = false;
        boolean result = instance.update(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
