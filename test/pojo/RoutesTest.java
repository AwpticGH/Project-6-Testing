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
public class RoutesTest {
    
    public RoutesTest() {
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
     * Test of getFrom method, of class Routes.
     */
    @Test
    public void testGetFrom() {
        System.out.println("getFrom");
        Routes instance = new Routes();
        int expResult = 0;
        int result = instance.getFrom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrom method, of class Routes.
     */
    @Test
    public void testSetFrom() {
        System.out.println("setFrom");
        int from = 0;
        Routes instance = new Routes();
        instance.setFrom(from);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTo method, of class Routes.
     */
    @Test
    public void testGetTo() {
        System.out.println("getTo");
        Routes instance = new Routes();
        int expResult = 0;
        int result = instance.getTo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTo method, of class Routes.
     */
    @Test
    public void testSetTo() {
        System.out.println("setTo");
        int to = 0;
        Routes instance = new Routes();
        instance.setTo(to);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Routes.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Routes instance = new Routes();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Routes.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Routes instance = new Routes();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAirportsByDestinationId method, of class Routes.
     */
    @Test
    public void testGetAirportsByDestinationId() {
        System.out.println("getAirportsByDestinationId");
        Routes instance = new Routes();
        Airports expResult = null;
        Airports result = instance.getAirportsByDestinationId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAirportsByDestinationId method, of class Routes.
     */
    @Test
    public void testSetAirportsByDestinationId() {
        System.out.println("setAirportsByDestinationId");
        Airports airportsByDestinationId = null;
        Routes instance = new Routes();
        instance.setAirportsByDestinationId(airportsByDestinationId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAirportsByDepartureId method, of class Routes.
     */
    @Test
    public void testGetAirportsByDepartureId() {
        System.out.println("getAirportsByDepartureId");
        Routes instance = new Routes();
        Airports expResult = null;
        Airports result = instance.getAirportsByDepartureId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAirportsByDepartureId method, of class Routes.
     */
    @Test
    public void testSetAirportsByDepartureId() {
        System.out.println("setAirportsByDepartureId");
        Airports airportsByDepartureId = null;
        Routes instance = new Routes();
        instance.setAirportsByDepartureId(airportsByDepartureId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeOfFlight method, of class Routes.
     */
    @Test
    public void testGetTimeOfFlight() {
        System.out.println("getTimeOfFlight");
        Routes instance = new Routes();
        int expResult = 0;
        int result = instance.getTimeOfFlight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeOfFlight method, of class Routes.
     */
    @Test
    public void testSetTimeOfFlight() {
        System.out.println("setTimeOfFlight");
        int timeOfFlight = 0;
        Routes instance = new Routes();
        instance.setTimeOfFlight(timeOfFlight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlightses method, of class Routes.
     */
    @Test
    public void testGetFlightses() {
        System.out.println("getFlightses");
        Routes instance = new Routes();
        Set expResult = null;
        Set result = instance.getFlightses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlightses method, of class Routes.
     */
    @Test
    public void testSetFlightses() {
        System.out.println("setFlightses");
        Set flightses = null;
        Routes instance = new Routes();
        instance.setFlightses(flightses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Routes.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Routes instance = new Routes();
        List<Routes> expResult = null;
        List<Routes> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Routes.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Routes instance = new Routes();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Routes.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Routes instance = new Routes();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Routes.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Routes instance = new Routes();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Routes.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Routes instance = new Routes();
        String expResult = "";
        String result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
