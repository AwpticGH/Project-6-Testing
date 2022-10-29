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

/**
 *
 * @author Dea Fitria
 */
public class AirlinesDaoTest {
    
    public AirlinesDaoTest() {
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
     * Test of getAll method, of class AirlinesDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AirlinesDao instance = new AirlinesDao();
        List<Airlines> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class AirlinesDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 1;
        AirlinesDao instance = new AirlinesDao();
        String expAirlineCode = "GA";
        Airlines result = instance.getById(id);
        assertEquals(expAirlineCode, result.getCode());
    }

    /**
     * Test of create method, of class AirlinesDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        AirlinesDao instance = new AirlinesDao();
        Airlines pojo = new Airlines();
        pojo.setCode("TC");
        pojo.setName("Black Box Test Create");
        instance.create(pojo);
        Airlines created = instance.getById(pojo.getId());
        assertEquals(pojo.getName(), created.getName());
    }

    /**
     * Test of update method, of class AirlinesDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        AirlinesDao instance = new AirlinesDao();
        Airlines pojo = instance.getById(42);
        pojo.setCode("TU");
        pojo.setName("Black Box Test Update");
        instance.update(pojo);
        Airlines updated = instance.getById(42);
        assertEquals(pojo.getName(), updated.getName());
    }
    
}
