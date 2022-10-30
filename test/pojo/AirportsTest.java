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
public class AirportsTest {
    
    public AirportsTest() {
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
     * Test of getId method, of class Airports.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Airports instance = new Airports();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Airports.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Airports instance = new Airports();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCode method, of class Airports.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Airports instance = new Airports();
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode method, of class Airports.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        Airports instance = new Airports();
        instance.setCode(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Airports.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Airports instance = new Airports();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Airports.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Airports instance = new Airports();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProvince method, of class Airports.
     */
    @Test
    public void testGetProvince() {
        System.out.println("getProvince");
        Airports instance = new Airports();
        String expResult = "";
        String result = instance.getProvince();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProvince method, of class Airports.
     */
    @Test
    public void testSetProvince() {
        System.out.println("setProvince");
        String province = "";
        Airports instance = new Airports();
        instance.setProvince(province);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class Airports.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Airports instance = new Airports();
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class Airports.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Airports instance = new Airports();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoutesesForDestinationId method, of class Airports.
     */
    @Test
    public void testGetRoutesesForDestinationId() {
        System.out.println("getRoutesesForDestinationId");
        Airports instance = new Airports();
        Set expResult = null;
        Set result = instance.getRoutesesForDestinationId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoutesesForDestinationId method, of class Airports.
     */
    @Test
    public void testSetRoutesesForDestinationId() {
        System.out.println("setRoutesesForDestinationId");
        Set routesesForDestinationId = null;
        Airports instance = new Airports();
        instance.setRoutesesForDestinationId(routesesForDestinationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoutesesForDepartureId method, of class Airports.
     */
    @Test
    public void testGetRoutesesForDepartureId() {
        System.out.println("getRoutesesForDepartureId");
        Airports instance = new Airports();
        Set expResult = null;
        Set result = instance.getRoutesesForDepartureId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoutesesForDepartureId method, of class Airports.
     */
    @Test
    public void testSetRoutesesForDepartureId() {
        System.out.println("setRoutesesForDepartureId");
        Set routesesForDepartureId = null;
        Airports instance = new Airports();
        instance.setRoutesesForDepartureId(routesesForDepartureId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Airports.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Airports instance = new Airports();
        List<Airports> expResult = null;
        List<Airports> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Airports.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Airports instance = new Airports();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Airports.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Airports instance = new Airports();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Airports.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Airports instance = new Airports();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Airports.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Airports instance = new Airports();
        String expResult = "";
        String result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
