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
import pojo.Airlines;
import pojo.Airplanes;

/**
 *
 * @author Sukhs
 */
public class AirplanesDaoTest {
    
    public AirplanesDaoTest() {
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
     * Test of getAll method, of class AirplanesDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AirplanesDao instance = new AirplanesDao();
        List<Airplanes> result = instance.getAll();
        assertTrue(result.get(0).getId() == 1);
    }

    /**
     * Test of getById method, of class AirplanesDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 1;
        AirplanesDao instance = new AirplanesDao();
        String expResult = "GA";
        Airplanes result = instance.getById(id);
        assertEquals(expResult, result.getAirlines().getCode());
    }

    /**
     * Test of create method, of class AirplanesDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        AirplanesDao instance = new AirplanesDao();
        Airplanes pojo = new Airplanes();
        pojo.setType("Black Box Test Create");
        pojo.setTotalSeats(300);
        pojo.setEconomySeats(300);
        pojo.setPremiumEconomySeats(300);
        pojo.setBusinessSeats(300);
        pojo.setFirstClassSeats(300);
        AirlinesDao airlineDao = new AirlinesDao();
        Airlines airline = airlineDao.getById(1);
        pojo.setAirlines(airline);
        boolean result = instance.create(pojo);
        assertTrue(result);
    }

    /**
     * Test of update method, of class AirplanesDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        AirplanesDao instance = new AirplanesDao();
        Airplanes pojo = instance.getById(42);
        pojo.setType("Black Box Test Update");
        pojo.setTotalSeats(360);
        pojo.setEconomySeats(240);
        pojo.setPremiumEconomySeats(120);
        pojo.setBusinessSeats(0);
        pojo.setFirstClassSeats(0);
        AirlinesDao airlineDao = new AirlinesDao();
        Airlines airline = airlineDao.getById(2);
        pojo.setAirlines(airline);
        boolean result = instance.update(pojo);
        assertTrue(result);
    }
    
}
