/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import dao.FlightsDao;
import dao.ReservationsDao;
import dao.UsersDao;
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
    
    ReservationsDao dao = new ReservationsDao();
    Reservations createReservation;
    Reservations updateTrue;
    Reservations updateFalse;
    Reservations deleteTrue;
    Reservations deleteFalse;
    
    FlightsDao flightDao = new FlightsDao();
    Flights flight = flightDao.getById(1);
    
    UsersDao userDao = new UsersDao();
    Users user = userDao.getById(1);
    
    boolean paid = true;
    boolean active = false;
    
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
        createReservation = new Reservations(flight, user, paid, active);
        
        updateTrue = dao.getById(24);
        updateTrue.setFlights(flight);
        updateTrue.setUsers(user);
        updateTrue.setPaid(paid);
        updateTrue.setActive(active);
        
        updateFalse = dao.getById(25);
        deleteTrue = dao.getById(26);
        deleteFalse = dao.getById(27);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class Reservations.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Reservations instance = new Reservations();
        List<Reservations> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class Reservations.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Reservations instance = new Reservations();
        instance.setId(1);
        String expResult = "./edit_reservations.xhtml";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class Reservations.
     */
    @Test
    public void testCreateTrue() {
        System.out.println("createTrue");
        String expResult = "../reservations.xhtml";
        String result = createReservation.create();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of create method, of class Reservations.
     */
    @Test
    public void testCreateFalse() {
        System.out.println("createFalse");
        Reservations instance = new Reservations();
        String expResult = "./create_reservations.xhtml";
        String result = instance.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Reservations.
     */
    @Test
    public void testUpdateTrue() {
        System.out.println("updateTrue");
        String expResult = "../reservations.xhtml";
        String result = updateTrue.update();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of update method, of class Reservations.
     */
    @Test
    public void testUpdateFalse() {
        System.out.println("updateFalse");
        updateFalse.setId(0);
        String expResult = "./edit_reservations.xhtml";
        String result = updateFalse.update();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Reservations.
     */
    @Test
    public void testDeleteTrue() {
        System.out.println("deleteTrue");
        String expResult = "../reservations.xhtml";
        String result = deleteTrue.delete();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of delete method, of class Reservations.
     */
    @Test
    public void testDeleteFalse() {
        System.out.println("deleteFalse");
        deleteFalse.setId(0);
        String expResult = "./edit_reservations.xhtml";
        String result = deleteFalse.delete();
        assertEquals(expResult, result);
    }
    
}
