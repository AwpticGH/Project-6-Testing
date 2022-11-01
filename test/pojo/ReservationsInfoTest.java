/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import dao.ReservationsDao;
import dao.ReservationsInfoDao;
import java.util.List;
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
public class ReservationsInfoTest {
    
    ReservationsDao reservationDao = new ReservationsDao();
    
    ReservationsInfoDao dao = new ReservationsInfoDao();
    ReservationsInfo createRsvInfo;
    ReservationsInfo updateTrue;
    ReservationsInfo updateFalse;
    ReservationsInfo deleteTrue;
    ReservationsInfo deleteFalse;
    
    Reservations createRsvId = reservationDao.getById(1);
    String createSeatClass = "White Box Create";
    String createName = "White Box Create";
    byte createAge = 31;
    String createGender = "Male";
    long createPhoneNumber = 822131232;
    
    Reservations updateRsvId = reservationDao.getById(23);
    String updateSeatClass = "White Box Update";
    String updateName = "White Box Update";
    byte updateAge = 23;
    String updateGender = "Female";
    long updatePhoneNumber = 822131321;
    
    public ReservationsInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        createRsvInfo = new ReservationsInfo(createRsvId, createSeatClass, createName, createAge, createGender, createPhoneNumber);
        
        updateTrue = dao.getById(7);
        updateTrue.setReservationId(23);
        updateTrue.setSeatClass(updateSeatClass);
        updateTrue.setName(updateName);
        updateTrue.setAge(updateAge);
        updateTrue.setGender(updateGender);
        updateTrue.setPhoneNumber(updatePhoneNumber);
        
        updateFalse = dao.getById(8);
        deleteTrue = dao.getById(9);
        deleteFalse = dao.getById(10);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class ReservationsInfo.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ReservationsInfo instance = new ReservationsInfo();
        List<ReservationsInfo> result = instance.getAll();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getById method, of class ReservationsInfo.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        ReservationsInfo instance = new ReservationsInfo();
        instance.setId(5);
        String expResult = "./edit_reservations_info.xhtml";
        String result = instance.getById();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class ReservationsInfo.
     */
    @Test
    public void testCreateTrue() {
        System.out.println("createTrue");
        String expResult = "../reservations_info.xhtml";
        String result = createRsvInfo.create();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of create method, of class ReservationsInfo.
     */
    @Test
    public void testCreateFalse() {
        System.out.println("createFalse");
        String expResult = "./create_reservations_info.xhtml";
        
        createRsvInfo.setName(null);
        createRsvInfo.setPhoneNumber(null);
        createRsvInfo.setGender(null);
        String result = createRsvInfo.create();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class ReservationsInfo.
     */
    @Test
    public void testUpdateTrue() {
        System.out.println("updateTrue");
        String expResult = "../reservations_info.xhtml";
        String result = updateTrue.update();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of update method, of class ReservationsInfo.
     */
    @Test
    public void testUpdateFalse() {
        System.out.println("updateFalse");
        String expResult = "./edit_reservations_info.xhtml";
        updateFalse.setId(null);
        String result = updateFalse.update();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class ReservationsInfo.
     */
    @Test
    public void testDeleteTrue() {
        System.out.println("deleteTrue");
        String expResult = "../reservations_info.xhtml";
        String result = deleteTrue.delete();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of delete method, of class ReservationsInfo.
     */
    @Test
    public void testDeleteFalse() {
        System.out.println("deleteFalse");
        String expResult = "./edit_reservations_info.xhtml";
        deleteFalse.setId(0);
        String result = deleteFalse.delete();
        assertEquals(expResult, result);
    }
    
}
