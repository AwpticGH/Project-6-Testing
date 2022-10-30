/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Reservations;
import pojo.ReservationsInfo;

/**
 *
 * @author Sukhs
 */
public class ReservationsInfoDaoTest {
    
    public ReservationsInfoDaoTest() {
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
     * Test of getAll method, of class ReservationsInfoDao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ReservationsInfoDao instance = new ReservationsInfoDao();
        List<ReservationsInfo> result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getById method, of class ReservationsInfoDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 5;
        ReservationsInfoDao instance = new ReservationsInfoDao();
        String expResult = "Rafi Fajar Sulaiman";
        ReservationsInfo result = instance.getById(id);
        assertEquals(expResult, result.getName());
    }

    /**
     * Test of create method, of class ReservationsInfoDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ReservationsInfoDao instance = new ReservationsInfoDao();
        ReservationsInfo pojo = new ReservationsInfo();
        
        ReservationsDao reservationDao = new ReservationsDao();
        Reservations reservation = reservationDao.getById(1);
        pojo.setReservations(reservation);
        
        pojo.setSeatClass("White Box Create");
        pojo.setName("White Box Create");
        
        byte age = 100;
        pojo.setAge(age);
        
        pojo.setGender("Other");
        
        long phoneNumber = 821987654;
        pojo.setPhoneNumber(phoneNumber);
        
        boolean result = instance.create(pojo);
        assertTrue(result);
    }

    /**
     * Test of update method, of class ReservationsInfoDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ReservationsInfoDao instance = new ReservationsInfoDao();
        ReservationsInfo pojo = instance.getById(6);
        
        ReservationsDao reservationDao = new ReservationsDao();
        Reservations reservation = reservationDao.getById(1);
        pojo.setReservations(reservation);
        
        pojo.setSeatClass("White Box Update");
        pojo.setName("White Box Update");
        
        byte age = 100;
        pojo.setAge(age);
        
        pojo.setGender("Other");
        
        long phoneNumber = 821988888;
        pojo.setPhoneNumber(phoneNumber);
        
        boolean result = instance.update(pojo);
        assertTrue(result);
    }
    
}
