/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapppart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
 
    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
       Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
       assertTrue(login.checkUserName());
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "luvo@123",
       "+27603888271");
        assertTrue(login.checkPasswordComplexity());
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
        assertTrue(login.checkCellPhoneNumber());
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
         Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
         String result = login.registerUser();
         
         assertEquals(
                 "Username successfully captured.\n"
                 + "Password successfully captured.\n"
                 + "Cell phone number successfully added.\n",
                 result);
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
       Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
       
       login.enteredUsername = "lu_vo";
       login.enteredPassword = "Luvo@123";
       
       assertTrue(login.loginUser());
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
        
        login.enteredUsername = "lu_vo";
        login.enteredPassword = "Luvo@123";
        
        assertEquals(
        "Welcome Luvo Nodongwe, it is great to see you again.", login.returnLoginStatus());
    }
    
}
