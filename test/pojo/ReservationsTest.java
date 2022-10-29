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
public class ReservationsTest {
    
    public ReservationsTest() {
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
     * Test of getId method, of class Reservations.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Reservations instance = new Reservations();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Reservations.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Reservations instance = new Reservations();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlights method, of class Reservations.
     */
    @Test
    public void testGetFlights() {
        System.out.println("getFlights");
        Reservations instance = new Reservations();
        Flights expResult = null;
        Flights result = instance.getFlights();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlights method, of class Reservations.
     */
    @Test
    public void testSetFlights() {
        System.out.println("setFlights");
        Flights flights = null;
        Reservations instance = new Reservations();
        instance.setFlights(flights);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class Reservations.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        Reservations instance = new Reservations();
        Users expResult = null;
        Users result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsers method, of class Reservations.
     */
    @Test
    public void testSetUsers() {
        System.out.println("setUsers");
        Users users = null;
        Reservations instance = new Reservations();
        instance.setUsers(users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPaid method, of class Reservations.
     */
    @Test
    public void testIsPaid() {
        System.out.println("isPaid");
        Reservations instance = new Reservations();
        boolean expResult = false;
        boolean result = instance.isPaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaid method, of class Reservations.
     */
    @Test
    public void testSetPaid() {
        System.out.println("setPaid");
        boolean paid = false;
        Reservations instance = new Reservations();
        instance.setPaid(paid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isActive method, of class Reservations.
     */
    @Test
    public void testIsActive() {
        System.out.println("isActive");
        Reservations instance = new Reservations();
        boolean expResult = false;
        boolean result = instance.isActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActive method, of class Reservations.
     */
    @Test
    public void testSetActive() {
        System.out.println("setActive");
        boolean active = false;
        Reservations instance = new Reservations();
        instance.setActive(active);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservationsInfos method, of class Reservations.
     */
    @Test
    public void testGetReservationsInfos() {
        System.out.println("getReservationsInfos");
        Reservations instance = new Reservations();
        Set expResult = null;
        Set result = instance.getReservationsInfos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservationsInfos method, of class Reservations.
     */
    @Test
    public void testSetReservationsInfos() {
        System.out.println("setReservationsInfos");
        Set reservationsInfos = null;
        Reservations instance = new Reservations();
        instance.setReservationsInfos(reservationsInfos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Reservations.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Reservations instance = new Reservations();
        List<Reservations> expResult = null;
        List<Reservations> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Reservations.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Reservations instance = new Reservations();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class Reservations.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Reservations instance = new Reservations();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Reservations.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Reservations instance = new Reservations();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Reservations.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Reservations instance = new Reservations();
        String expResult = "";
        String result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
