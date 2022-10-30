/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import java.util.Set;
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
public class AirlinesTest {
    
    public AirlinesTest() {
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
     * Test of getId method, of class Airlines.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Airlines instance = new Airlines();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Airlines.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Airlines instance = new Airlines();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCode method, of class Airlines.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Airlines instance = new Airlines();
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode method, of class Airlines.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        Airlines instance = new Airlines();
        instance.setCode(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Airlines.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Airlines instance = new Airlines();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Airlines.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Airlines instance = new Airlines();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAirplaneses method, of class Airlines.
     */
    @Test
    public void testGetAirplaneses() {
        System.out.println("getAirplaneses");
        Airlines instance = new Airlines();
        Set expResult = null;
        Set result = instance.getAirplaneses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAirplaneses method, of class Airlines.
     */
    @Test
    public void testSetAirplaneses() {
        System.out.println("setAirplaneses");
        Set airplaneses = null;
        Airlines instance = new Airlines();
        instance.setAirplaneses(airplaneses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Airlines.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Airlines instance = new Airlines();
        List<Airlines> expResult = null;
        List<Airlines> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Airlines.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Airlines instance = new Airlines();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Airlines.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Airlines instance = new Airlines();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Airlines.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Airlines instance = new Airlines();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Airlines.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Airlines instance = new Airlines();
        String expResult = "";
        String result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
