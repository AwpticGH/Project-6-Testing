/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import dao.AirportsDao;
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
    
    AirportsDao dao = new AirportsDao();
    Airports createAirport;
    Airports updateTrue;
    Airports updateFalse;
    Airports deleteTrue;
    Airports deleteFalse;
    
    String code = "WBT";
    String name = "White Box Test";
    String province = "Jawa Barat";
    String city = "Depok";
    
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
        createAirport = new Airports(code, name, province, city);
        
        updateTrue = dao.getById(53);
        updateTrue.setCode(code);
        updateTrue.setName(name);
        
        updateFalse = dao.getById(54);
        updateFalse.setId(0);
        
        deleteTrue = dao.getById(54);
        
        deleteFalse = dao.getById(55);
        deleteFalse.setId(0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class Airports.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Airports instance = new Airports();
        List<Airports> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class Airports.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Airports instance = new Airports();
        instance.setId(1);
        String expResult = "./edit_airports.xhtml";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class Airports.
     */
    @Test
    public void testUpdateTrue() {
        System.out.println("update");
        String expResult = "../airports.xhtml";
        String result = updateTrue.update();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of update method, of class Airports.
     */
    @Test
    public void testUpdateFalse() {
        System.out.println("update");
        String expResult = "./edit_airports.xhtml";
        String result = updateFalse.update();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class Airports.
     */
    @Test
    public void testCreateTrue() {
        System.out.println("create");
        String expResult = "../airports.xhtml";
        String result = createAirport.create();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of create method, of class Airports.
     */
    @Test
    public void testCreateFalse() {
        System.out.println("create");
        Airports instance = new Airports();
        String expResult = "./create_airports.xhtml";
        String result = instance.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Airports.
     */
    @Test
    public void testDeleteTrue() {
        System.out.println("delete");
        String expResult = "../airports.xhtml";
        String result = deleteTrue.delete();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of delete method, of class Airports.
     */
    @Test
    public void testDeleteFalse() {
        System.out.println("delete");
        String expResult = "./edit_airports.xhtml";
        String result = deleteFalse.delete();
        assertEquals(expResult, result);
    }
    
}
