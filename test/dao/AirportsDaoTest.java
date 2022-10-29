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
        String expResult = "Bandara Wamena";
        List<Airports> result = instance.getAll();
        assertEquals(expResult, result.get(51).getName());
    }

    /**
     * Test of getById method, of class AirportsDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 51;
        AirportsDao instance = new AirportsDao();
        String expResult = "UPG";
        Airports result = instance.getById(id);
        assertEquals(expResult, result.getCode());
    }

    /**
     * Test of create method, of class AirportsDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        AirportsDao instance = new AirportsDao();
        Airports pojo = new Airports();
        pojo.setCode("WBC");
        pojo.setName("White Box Create");
        pojo.setProvince("Jawa Barat");
        pojo.setCity("Depok");
        boolean result = instance.create(pojo);
        assertTrue(result);
    }

    /**
     * Test of update method, of class AirportsDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        AirportsDao instance = new AirportsDao();
        Airports pojo = instance.getById(53);
        pojo.setCode("WBU");
        pojo.setName("White Box Update");
        pojo.setProvince("Jawa Barat");
        pojo.setCity("Depok");
        boolean result = instance.update(pojo);
        assertTrue(result);
    }
    
}
