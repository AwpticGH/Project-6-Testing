/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import dao.AdminsDao;
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
    
    AdminsDao dao = new AdminsDao();
    Admins createAdmin;
    Admins updateTrue;
    Admins updateFalse;
    Admins deleteTrue;
    Admins deleteFalse;
    
    String createName = "White Box Create";
    String createUsername = "White Box Create";
    String createPassword = "White Box Create";
    
    String updateName = "White Box Update";
    String updateUsername = "White Box Update";
    String updatePassword = "White Box Update";
    
    boolean insertPriv = false;
    boolean selectPriv = false;
    boolean updatePriv = false;
    boolean deletePriv = false;
    
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
        createAdmin = new Admins(createName, createUsername, createPassword, insertPriv, selectPriv, updatePriv, deletePriv);
        
        updateTrue = dao.getById(6);
        updateTrue.setName(updateName);
        updateTrue.setUsername(updateUsername);
        updateTrue.setPassword(updatePassword);
        updateTrue.setInsertPriv(insertPriv);
        updateTrue.setSelectPriv(insertPriv);
        updateTrue.setUpdatePriv(insertPriv);
        updateTrue.setDeletePriv(insertPriv);
        
        updateFalse = dao.getById(8);
        deleteTrue = dao.getById(7);
        deleteFalse = dao.getById(9);
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
        instance.setId(1);
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
        instance.setUsername("superadmin");
        instance.setPassword("superadmin123");
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
        Admins instance = this.createAdmin;
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
        Admins instance = this.createAdmin;
        instance.setName(null);
        instance.setUsername(null);
        instance.setPassword(null);
        
        String expResult = "./create_admins.xhtml";
        String result = instance.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Admins.
     */
    @Test
    public void testUpdateTrue() {
        System.out.println("updateTrue");
        Admins instance = this.updateTrue;
        String expResult = "../admins.xhtml";
        String result = instance.update();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of update method, of class Admins.
     */
    @Test
    public void testUpdateFalse() {
        System.out.println("updateFalse");
        Admins instance = this.updateFalse;
        instance.setId(null);
        String expResult = "./edit_admins.xhtml";
        String result = instance.update();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Admins.
     */
    @Test
    public void testDeleteTrue() {
        System.out.println("deleteTrue");
        Admins instance = this.deleteTrue;
        String expResult = "../admins.xhtml";
        String result = instance.delete();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of delete method, of class Admins.
     */
    @Test
    public void testDeleteFalse() {
        System.out.println("deleteFalse");
        Admins instance = this.deleteFalse;
        instance.setId(null);
        String expResult = "./edit_admins.xhtml";
        String result = instance.delete();
        assertEquals(expResult, result);
    }
    
}
