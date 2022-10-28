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
import pojo.Admins;

/**
 *
 * @author Dea Fitria
 */
public class AdminsDaoTest {
    
    public AdminsDaoTest() {
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
     * Test of getAll method, of class AdminsDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AdminsDao instance = new AdminsDao();
        List<Admins> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class AdminsDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 1;
        AdminsDao instance = new AdminsDao();
        Admins result = instance.getById(id);
        assertEquals("superadmin", result.getUsername());
    }

    /**
     * Test of getByUsernameAndPassword method, of class AdminsDao.
     */
    @Test
    public void testGetByUsernameAndPasswordThatAreExact() {
        System.out.println("getByUsernameAndPasswordThatAreExact");
        String username = "superadmin";
        String password = "superadmin123";
        AdminsDao instance = new AdminsDao();
        Admins result = instance.getByUsernameAndPassword(username, password);
        assertEquals("Super Admin", result.getName());
    }
    
    /**
     * Test of getByUsernameAndPassword method, of class AdminsDao.
     */
    @Test
    public void testGetByUsernameThatIsNotExactAndPassword() {
        System.out.println("getByUsernameThatIsNotExactAndPassword");
        String username = "SupErAdmIn";
        String password = "superadmin123";
        AdminsDao instance = new AdminsDao();
        Admins result = instance.getByUsernameAndPassword(username, password);
        assertNotEquals("Super Admin", result.getName());
    }
    
    /**
     * Test of getByUsernameAndPassword method, of class AdminsDao.
     */
    @Test
    public void testGetByUsernameAndPasswordThatIsNotExact() {
        System.out.println("getByUsernameAndPasswordThatIsNotExact");
        String username = "superadmin";
        String password = "sUpErAdMiN123";
        AdminsDao instance = new AdminsDao();
        Admins result = instance.getByUsernameAndPassword(username, password);
        assertNotEquals("Super Admin", result.getName());
    }
    
    /**
     * Test of getByUsernameAndPassword method, of class AdminsDao.
     */
    @Test
    public void testGetByUsernameAndPasswordThatAreNotExact() {
        System.out.println("getByUsernameAndPasswordThatAreNotExact");
        String username = "SuPeraDmin";
        String password = "sUpErAdMiN123";
        AdminsDao instance = new AdminsDao();
        Admins result = instance.getByUsernameAndPassword(username, password);
        assertNull(result);
    }
    
    /**
     * Test of getByUsernameAndPassword method, of class AdminsDao.
     */
    @Test
    public void testGetByUsernameAndEmptyPassword() {
        System.out.println("getByUsernameAndEmptyPassword");
        String username = "superadmin";
        String password = "";
        AdminsDao instance = new AdminsDao();
        Admins result = instance.getByUsernameAndPassword(username, password);
        assertNull(result);
    }
}
