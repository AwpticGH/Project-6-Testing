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
        updateTrue.setReservations(updateRsvId);
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
     * Test of getId method, of class ReservationsInfo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ReservationsInfo instance = new ReservationsInfo();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ReservationsInfo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        ReservationsInfo instance = new ReservationsInfo();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservations method, of class ReservationsInfo.
     */
    @Test
    public void testGetReservations() {
        System.out.println("getReservations");
        ReservationsInfo instance = new ReservationsInfo();
        Reservations expResult = null;
        Reservations result = instance.getReservations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservations method, of class ReservationsInfo.
     */
    @Test
    public void testSetReservations() {
        System.out.println("setReservations");
        Reservations reservations = null;
        ReservationsInfo instance = new ReservationsInfo();
        instance.setReservations(reservations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeatClass method, of class ReservationsInfo.
     */
    @Test
    public void testGetSeatClass() {
        System.out.println("getSeatClass");
        ReservationsInfo instance = new ReservationsInfo();
        String expResult = "";
        String result = instance.getSeatClass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeatClass method, of class ReservationsInfo.
     */
    @Test
    public void testSetSeatClass() {
        System.out.println("setSeatClass");
        String seatClass = "";
        ReservationsInfo instance = new ReservationsInfo();
        instance.setSeatClass(seatClass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ReservationsInfo.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ReservationsInfo instance = new ReservationsInfo();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class ReservationsInfo.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ReservationsInfo instance = new ReservationsInfo();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class ReservationsInfo.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        ReservationsInfo instance = new ReservationsInfo();
        byte expResult = 0;
        byte result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class ReservationsInfo.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        byte age = 0;
        ReservationsInfo instance = new ReservationsInfo();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class ReservationsInfo.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        ReservationsInfo instance = new ReservationsInfo();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class ReservationsInfo.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        ReservationsInfo instance = new ReservationsInfo();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class ReservationsInfo.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        ReservationsInfo instance = new ReservationsInfo();
        Long expResult = null;
        Long result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class ReservationsInfo.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        Long phoneNumber = null;
        ReservationsInfo instance = new ReservationsInfo();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class ReservationsInfo.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ReservationsInfo instance = new ReservationsInfo();
        List<ReservationsInfo> expResult = null;
        List<ReservationsInfo> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class ReservationsInfo.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        ReservationsInfo instance = new ReservationsInfo();
        String expResult = "";
        String result = instance.getById();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ReservationsInfo.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ReservationsInfo instance = new ReservationsInfo();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ReservationsInfo.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ReservationsInfo instance = new ReservationsInfo();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ReservationsInfo.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        ReservationsInfo instance = new ReservationsInfo();
        String expResult = "";
        String result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
