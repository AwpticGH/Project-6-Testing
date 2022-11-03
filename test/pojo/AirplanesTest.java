/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import dao.AirlinesDao;
import dao.AirplanesDao;
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
    
    AirplanesDao dao = new AirplanesDao();
    Airplanes createAirplane;
    Airplanes updateTrue;
    Airplanes updateFalse;
    Airplanes deleteTrue;
    Airplanes deleteFalse;
    
    String type = "White-Box";
    int totalSeats = 300;
    int economy = 150;
    int preEconomy = 70;
    int business = 80;
    int firstClass = 50;
    
    AirlinesDao airlineDao = new AirlinesDao();
    Airlines airline = airlineDao.getById(1);
    
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
        createAirplane = new Airplanes(airline, type, economy, preEconomy, business, firstClass);
        createAirplane.setTotalSeats(totalSeats);
        
        updateTrue = dao.getById(42);
        updateTrue.setType("update");
        
        updateFalse = dao.getById(43);
        updateFalse.setId(0);
        
        deleteTrue = dao.getById(44);
        
        deleteFalse = dao.getById(45);
        deleteFalse.setId(0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class Airplanes.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Airplanes instance = new Airplanes();
        List<Airplanes> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class Airplanes.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Airplanes instance = new Airplanes();
        instance.setId(1);
        String expResult = "./edit_airplanes.xhtml";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Airplanes.
     */
    @Test
    public void testUpdateTrue() {
        System.out.println("update");
        String expResult = "../airplanes.xhtml";
        String result = updateTrue.update();
        assertEquals(expResult, result);   
    }
    
    /**
     * Test of update method, of class Airplanes.
     */
    @Test
    public void testUpdateFalse() {
        System.out.println("update");
        String expResult = "./edit_airplanes.xhtml";
        String result = updateFalse.update();
        assertEquals(expResult, result);   
    }

    /**
     * Test of create method, of class Airplanes.
     */
    @Test
    public void testCreateTrue() {
        System.out.println("create");
        String expResult = "../airplanes.xhtml";
        String result = createAirplane.create();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of create method, of class Airplanes.
     */
    @Test
    public void testCreateFalse() {
        System.out.println("create");
        Airplanes instance = new Airplanes();
        String expResult = "./create_airplanes.xhtml";
        String result = instance.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Airplanes.
     */
    @Test
    public void testDeleteTrue() {
        System.out.println("delete");
        String expResult = "../airplanes.xhtml";
        String result = deleteTrue.delete();
        assertEquals(expResult, result);
    }  
    
    /**
     * Test of delete method, of class Airplanes.
     */
    @Test
    public void testDeleteFalse() {
        System.out.println("delete");
        String expResult = "./edit_airplanes.xhtml";
        String result = deleteFalse.delete();
        assertEquals(expResult, result);
    }    

}
