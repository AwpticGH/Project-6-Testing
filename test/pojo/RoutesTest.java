/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import dao.AirportsDao;
import dao.RoutesDao;
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
    
    RoutesDao dao = new RoutesDao();
    Routes createRoute;
    Routes updateTrue;
    Routes updateFalse;
    Routes deleteTrue;
    Routes deleteFalse;
    
    AirportsDao airportDao = new AirportsDao();
    Airports departure = airportDao.getById(23);
    Airports destination = airportDao.getById(33);
    
    int createId = 8111;
    int timeOfFlight = 120;
    
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
        createRoute = new Routes(createId, departure, destination, timeOfFlight);
        
        updateTrue = dao.getById(8112);
        updateTrue.setAirportsByDepartureId(departure);
        updateTrue.setAirportsByDestinationId(destination);
        updateTrue.setTimeOfFlight(timeOfFlight);
        
        updateFalse = dao.getById(8113);
        updateFalse.setId(null);
        
        deleteTrue = dao.getById(8114);
        
        deleteFalse = dao.getById(8115);
        deleteFalse.setId(null);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class Routes.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Routes instance = new Routes();
        List<Routes> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class Routes.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Routes instance = new Routes();
        instance.setId(7120);
        String expResult = "./edit/edit_routes.xhtml";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class Routes.
     */
    @Test
    public void testCreateTrue() {
        System.out.println("createTrue");
        String expResult = "../routes.xhtml";
        String result = createRoute.create();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of create method, of class Routes.
     */
    @Test
    public void testCreateFalse() {
        System.out.println("createFalse");
        Routes instance = new Routes();
        String expResult = "./create/create_routes.xhtml";
        String result = instance.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Routes.
     */
    @Test
    public void testUpdateTrue() {
        System.out.println("updateTrue");
        String expResult = "../routes.xhtml";
        String result = updateTrue.update();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of update method, of class Routes.
     */
    @Test
    public void testUpdateFalse() {
        System.out.println("updateFalse");
        String expResult = "./edit/edit_routes.xhtml";
        String result = updateFalse.update();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Routes.
     */
    @Test
    public void testDeleteTrue() {
        System.out.println("deleteTrue");
        String expResult = "../routes.xhtml";
        String result = deleteTrue.delete();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of delete method, of class Routes.
     */
    @Test
    public void testDeleteFalse() {
        System.out.println("deleteFalse");
        String expResult = "./edit/edit_routes.xhtml";
        String result = deleteFalse.delete();
        assertEquals(expResult, result);
    }
    
}
