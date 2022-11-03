/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dao.UsersDao;

/**
 *
 * @author Sukhs
 */
public class UsersTest {
    
    UsersDao dao = new UsersDao();
    Users createUser;
    Users updateTrue;
    Users updateFalse;
    Users deleteTrue;
    Users deleteFalse;
    
    String username = "whitebox";
    String name = "White Box";
    String password = "whitebox";
    String email = "whitebox@gmail.com";
    Date dob = new Date();
    String gender = "Male";
    String title = "Mr";
    long phoneNumber = 822313234;
    
    public UsersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        createUser = new Users(username, email, password, name, dob, gender, title, phoneNumber);
        
        updateTrue = dao.getById(4);
        updateTrue.setName(name);
        updateTrue.setDateOfBirth(new Date());
        
        updateFalse = dao.getById(5);
        updateFalse.setId(0);
        
        deleteTrue = dao.getById(6);
        
        deleteFalse = dao.getById(7);
        deleteFalse.setId(0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class Users.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Users instance = new Users();
        List<Users> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class Users.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Users instance = new Users();
        instance.setId(1);
        String expResult = "./edit_users.xhtml";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Users.
     */
    @Test
    public void testUpdateTrue() throws Exception {
        System.out.println("update");
        String expResult = "../users.xhtml";
        String result = updateTrue.update();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of update method, of class Users.
     */
    @Test
    public void testUpdateFalse() throws Exception {
        System.out.println("update");
        String expResult = "./edit_users.xhtml";
        String result = updateFalse.update();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class Users.
     */
    @Test
    public void testCreateTrue() throws Exception {
        System.out.println("create");
        String expResult = "../users.xhtml";
        String result = createUser.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of create method, of class Users.
     */
    @Test
    public void testCreateFalse() throws Exception {
        System.out.println("create");
        Users instance = new Users();
        String expResult = "./create_users.xhtml";
        String result = instance.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Users.
     */
    @Test
    public void testDeleteTrue() {
        System.out.println("delete");
        String expResult = "../users.xhtml";
        String result = deleteTrue.delete();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of delete method, of class Users.
     */
    @Test
    public void testDeleteFalse() {
        System.out.println("delete");
        String expResult = "./edit_users.xhtml";
        String result = deleteFalse.delete();
        assertEquals(expResult, result);
    }
    
}
