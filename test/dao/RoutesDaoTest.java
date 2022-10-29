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
        List<Routes> expResult = null;
        List<Routes> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class RoutesDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        RoutesDao instance = new RoutesDao();
        Routes expResult = null;
        Routes result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class RoutesDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object pojo = null;
        RoutesDao instance = new RoutesDao();
        boolean expResult = false;
        boolean result = instance.create(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class RoutesDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Object pojo = null;
        RoutesDao instance = new RoutesDao();
        boolean expResult = false;
        boolean result = instance.update(pojo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RoutesDao.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RoutesDao.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
