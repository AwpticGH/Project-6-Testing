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
import pojo.Users;

/**
 *
 * @author Sukhs
 */
public class UsersDaoTest {
    
    public UsersDaoTest() {
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
     * Test of getAll method, of class UsersDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        UsersDao instance = new UsersDao();
        List<Users> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class UsersDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 1;
        UsersDao instance = new UsersDao();
        String expResult = "Awptic";
        Users result = instance.getById(id);
        assertEquals(expResult, result.getUsername());
    }
    
}
