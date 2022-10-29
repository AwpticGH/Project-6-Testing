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

/**
 *
 * @author Sukhs
 */
public class FlightsTest {
    
    public FlightsTest() {
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
     * Test of getId method, of class Flights.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Flights instance = new Flights();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Flights.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Flights instance = new Flights();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAirplaneId method, of class Flights.
     */
    @Test
    public void testGetAirplaneId() {
        System.out.println("getAirplaneId");
        Flights instance = new Flights();
        int expResult = 0;
        int result = instance.getAirplaneId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAirplaneId method, of class Flights.
     */
    @Test
    public void testSetAirplaneId() {
        System.out.println("setAirplaneId");
        int airplaneId = 0;
        Flights instance = new Flights();
        instance.setAirplaneId(airplaneId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRouteId method, of class Flights.
     */
    @Test
    public void testGetRouteId() {
        System.out.println("getRouteId");
        Flights instance = new Flights();
        int expResult = 0;
        int result = instance.getRouteId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRouteId method, of class Flights.
     */
    @Test
    public void testSetRouteId() {
        System.out.println("setRouteId");
        int routeId = 0;
        Flights instance = new Flights();
        instance.setRouteId(routeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAirplanes method, of class Flights.
     */
    @Test
    public void testGetAirplanes() {
        System.out.println("getAirplanes");
        Flights instance = new Flights();
        Airplanes expResult = null;
        Airplanes result = instance.getAirplanes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAirplanes method, of class Flights.
     */
    @Test
    public void testSetAirplanes() {
        System.out.println("setAirplanes");
        Airplanes airplanes = null;
        Flights instance = new Flights();
        instance.setAirplanes(airplanes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoutes method, of class Flights.
     */
    @Test
    public void testGetRoutes() {
        System.out.println("getRoutes");
        Flights instance = new Flights();
        Routes expResult = null;
        Routes result = instance.getRoutes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoutes method, of class Flights.
     */
    @Test
    public void testSetRoutes() {
        System.out.println("setRoutes");
        Routes routes = null;
        Flights instance = new Flights();
        instance.setRoutes(routes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeOfDeparture method, of class Flights.
     */
    @Test
    public void testGetTimeOfDeparture() {
        System.out.println("getTimeOfDeparture");
        Flights instance = new Flights();
        Date expResult = null;
        Date result = instance.getTimeOfDeparture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeOfDeparture method, of class Flights.
     */
    @Test
    public void testSetTimeOfDeparture() {
        System.out.println("setTimeOfDeparture");
        Date timeOfDeparture = null;
        Flights instance = new Flights();
        instance.setTimeOfDeparture(timeOfDeparture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservationses method, of class Flights.
     */
    @Test
    public void testGetReservationses() {
        System.out.println("getReservationses");
        Flights instance = new Flights();
        Set expResult = null;
        Set result = instance.getReservationses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservationses method, of class Flights.
     */
    @Test
    public void testSetReservationses() {
        System.out.println("setReservationses");
        Set reservationses = null;
        Flights instance = new Flights();
        instance.setReservationses(reservationses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Flights.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Flights instance = new Flights();
        List<Flights> expResult = null;
        List<Flights> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Flights.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Flights instance = new Flights();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Flights.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Flights instance = new Flights();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Flights.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Flights instance = new Flights();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Flights.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Flights instance = new Flights();
        String expResult = "";
        String result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
