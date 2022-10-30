/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sukhs
 */
public class AdminsTest {
    
    public AdminsTest() {
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
     * Test of getById method, of class Admins.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Admins instance = new Admins();
        String expResult = "./edit_admins.xhtml";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of login method, of class Admins.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Admins instance = new Admins();
        boolean result = instance.login();
        assertTrue(result);
    }

    /**
     * Test of logout method, of class Admins.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        Admins instance = new Admins();
        String expResult = "/G2AirlineHibernate/faces/view/users.xhtml";
        String result = instance.logout();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class Admins.
     */
    @Test
    public void testCreateTrue() {
        System.out.println("createTrue");
        Admins instance = new Admins();
        String expResult = "../admins.xhtml";
        String result = instance.create();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of create method, of class Admins.
     */
    @Test
    public void testCreateFalse() {
        System.out.println("createFalse");
        Admins instance = new Admins();
        String expResult = "./create_admins.xhtml";
        String result = instance.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Admins.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Admins instance = new Admins();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Admins.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Admins instance = new Admins();
        String expResult = "";
        String result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
