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
public class AirplanesTest {
    
    public AirplanesTest() {
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
     * Test of getId method, of class Airplanes.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Airplanes instance = new Airplanes();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Airplanes.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Airplanes instance = new Airplanes();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAirlineId method, of class Airplanes.
     */
    @Test
    public void testGetAirlineId() {
        System.out.println("getAirlineId");
        Airplanes instance = new Airplanes();
        int expResult = 0;
        int result = instance.getAirlineId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAirlineId method, of class Airplanes.
     */
    @Test
    public void testSetAirlineId() {
        System.out.println("setAirlineId");
        int airlineId = 0;
        Airplanes instance = new Airplanes();
        instance.setAirlineId(airlineId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAirlines method, of class Airplanes.
     */
    @Test
    public void testGetAirlines() {
        System.out.println("getAirlines");
        Airplanes instance = new Airplanes();
        Airlines expResult = null;
        Airlines result = instance.getAirlines();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAirlines method, of class Airplanes.
     */
    @Test
    public void testSetAirlines() {
        System.out.println("setAirlines");
        Airlines airlines = null;
        Airplanes instance = new Airplanes();
        instance.setAirlines(airlines);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Airplanes.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Airplanes instance = new Airplanes();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Airplanes.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Airplanes instance = new Airplanes();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalSeats method, of class Airplanes.
     */
    @Test
    public void testGetTotalSeats() {
        System.out.println("getTotalSeats");
        Airplanes instance = new Airplanes();
        Integer expResult = null;
        Integer result = instance.getTotalSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalSeats method, of class Airplanes.
     */
    @Test
    public void testSetTotalSeats() {
        System.out.println("setTotalSeats");
        Integer totalSeats = null;
        Airplanes instance = new Airplanes();
        instance.setTotalSeats(totalSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEconomySeats method, of class Airplanes.
     */
    @Test
    public void testGetEconomySeats() {
        System.out.println("getEconomySeats");
        Airplanes instance = new Airplanes();
        int expResult = 0;
        int result = instance.getEconomySeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEconomySeats method, of class Airplanes.
     */
    @Test
    public void testSetEconomySeats() {
        System.out.println("setEconomySeats");
        int economySeats = 0;
        Airplanes instance = new Airplanes();
        instance.setEconomySeats(economySeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPremiumEconomySeats method, of class Airplanes.
     */
    @Test
    public void testGetPremiumEconomySeats() {
        System.out.println("getPremiumEconomySeats");
        Airplanes instance = new Airplanes();
        int expResult = 0;
        int result = instance.getPremiumEconomySeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPremiumEconomySeats method, of class Airplanes.
     */
    @Test
    public void testSetPremiumEconomySeats() {
        System.out.println("setPremiumEconomySeats");
        int premiumEconomySeats = 0;
        Airplanes instance = new Airplanes();
        instance.setPremiumEconomySeats(premiumEconomySeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBusinessSeats method, of class Airplanes.
     */
    @Test
    public void testGetBusinessSeats() {
        System.out.println("getBusinessSeats");
        Airplanes instance = new Airplanes();
        int expResult = 0;
        int result = instance.getBusinessSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBusinessSeats method, of class Airplanes.
     */
    @Test
    public void testSetBusinessSeats() {
        System.out.println("setBusinessSeats");
        int businessSeats = 0;
        Airplanes instance = new Airplanes();
        instance.setBusinessSeats(businessSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstClassSeats method, of class Airplanes.
     */
    @Test
    public void testGetFirstClassSeats() {
        System.out.println("getFirstClassSeats");
        Airplanes instance = new Airplanes();
        int expResult = 0;
        int result = instance.getFirstClassSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstClassSeats method, of class Airplanes.
     */
    @Test
    public void testSetFirstClassSeats() {
        System.out.println("setFirstClassSeats");
        int firstClassSeats = 0;
        Airplanes instance = new Airplanes();
        instance.setFirstClassSeats(firstClassSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBusinessSeatses method, of class Airplanes.
     */
    @Test
    public void testGetBusinessSeatses() {
        System.out.println("getBusinessSeatses");
        Airplanes instance = new Airplanes();
        Set expResult = null;
        Set result = instance.getBusinessSeatses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBusinessSeatses method, of class Airplanes.
     */
    @Test
    public void testSetBusinessSeatses() {
        System.out.println("setBusinessSeatses");
        Set businessSeatses = null;
        Airplanes instance = new Airplanes();
        instance.setBusinessSeatses(businessSeatses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstClassSeatses method, of class Airplanes.
     */
    @Test
    public void testGetFirstClassSeatses() {
        System.out.println("getFirstClassSeatses");
        Airplanes instance = new Airplanes();
        Set expResult = null;
        Set result = instance.getFirstClassSeatses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstClassSeatses method, of class Airplanes.
     */
    @Test
    public void testSetFirstClassSeatses() {
        System.out.println("setFirstClassSeatses");
        Set firstClassSeatses = null;
        Airplanes instance = new Airplanes();
        instance.setFirstClassSeatses(firstClassSeatses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlightses method, of class Airplanes.
     */
    @Test
    public void testGetFlightses() {
        System.out.println("getFlightses");
        Airplanes instance = new Airplanes();
        Set expResult = null;
        Set result = instance.getFlightses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlightses method, of class Airplanes.
     */
    @Test
    public void testSetFlightses() {
        System.out.println("setFlightses");
        Set flightses = null;
        Airplanes instance = new Airplanes();
        instance.setFlightses(flightses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEconomySeatses method, of class Airplanes.
     */
    @Test
    public void testGetEconomySeatses() {
        System.out.println("getEconomySeatses");
        Airplanes instance = new Airplanes();
        Set expResult = null;
        Set result = instance.getEconomySeatses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEconomySeatses method, of class Airplanes.
     */
    @Test
    public void testSetEconomySeatses() {
        System.out.println("setEconomySeatses");
        Set economySeatses = null;
        Airplanes instance = new Airplanes();
        instance.setEconomySeatses(economySeatses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPremiumEconomySeatses method, of class Airplanes.
     */
    @Test
    public void testGetPremiumEconomySeatses() {
        System.out.println("getPremiumEconomySeatses");
        Airplanes instance = new Airplanes();
        Set expResult = null;
        Set result = instance.getPremiumEconomySeatses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPremiumEconomySeatses method, of class Airplanes.
     */
    @Test
    public void testSetPremiumEconomySeatses() {
        System.out.println("setPremiumEconomySeatses");
        Set premiumEconomySeatses = null;
        Airplanes instance = new Airplanes();
        instance.setPremiumEconomySeatses(premiumEconomySeatses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Airplanes.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Airplanes instance = new Airplanes();
        List<Airplanes> expResult = null;
        List<Airplanes> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Airplanes.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Airplanes instance = new Airplanes();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Airplanes.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Airplanes instance = new Airplanes();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Airplanes.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Airplanes instance = new Airplanes();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Airplanes.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Airplanes instance = new Airplanes();
        String expResult = "";
        String result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
