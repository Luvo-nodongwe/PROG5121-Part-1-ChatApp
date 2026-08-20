/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapppart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *The LoginTest class contains JUnit tests used to test
 * the methods in the Login class.
 * 
 * Each test checks whether a method produces the 
 * expected results.
 * @author Student
 */
public class LoginTest {
    
 
    /**
     * Test of checkUserName() method, of class Login.
     * 
     * This test uses a valid username, "lu_vo", which contains 
     * an underscore and is no more than five characters long.
     * 
     * assertTrue() checks that the method returns true.
     */
    @Test
    public void testCheckUserName() {
        
        //Create a Login object with valid registration information.
       Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
       
       //Check that the username validation returns true.
       assertTrue(login.checkUserName());
    }

    /**
     * Test of checkPasswordComplexity() method, of class Login.
     * 
     * This test checks whether a password containing the required
     * uppercase letter, number and special character  is accepted.
     */
    @Test
    public void testCheckPasswordComplexity() {
        
        //Create a Login object with a valid password.
        Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
        
        /*
        *Check that the password complexity method returns true.
        *
        *NOTE: The current password "Luvo@123" does not contain
        *an uppercase letter according to he validation rules.
        */
        assertTrue(login.checkPasswordComplexity());
    }

    /**
     * Test of checkCellPhoneNumber() method, of class Login.
     * 
     * The cellphone number starts with +27 and contains the 
     * required number of digits.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        
        //Creates a Login object with a valid cellphone number.
        Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
        
        //Check that the cellphone number validation returns true.
        assertTrue(login.checkCellPhoneNumber());
    }

    /**
     * Test of registerUser() method, of class Login.
     * 
     * This test checks whether the method returns the correct 
     * success messages when all registration information is valid.
     */
    @Test
    public void testRegisterUser() {
        
        //Creates a Login object using valid registration details.
         Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
         
         //Store the message returned by registerUser().
         String result = login.registerUser();
         
         /*
         *Compare the expected registration message with
         *the actual message returned by the method.
         */
         assertEquals(
                 "Username successfully captured.\n"
                 + "Password successfully captured.\n"
                 + "Cell phone number successfully added.\n",
                 result);
    }

    /**
     * Test of loginUser() method, of class Login.
     * 
     * This test enters the correct username and password and 
     * checks that logiUser() returns true.
     */
    @Test
    public void testLoginUser() {
        
        //Creates a Login object using registered credentials.
       Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
       
       //Store the username entered during login.      
       login.enteredUsername = "lu_vo";
       
       //Store the password entered during login
       login.enteredPassword = "Luvo@123";
       
       //Check that the login is successful.
       assertTrue(login.loginUser());
    }

    /**
     * Test of returnLoginStatus() method, of class Login.
     * 
     * This test checks whether the correct welcome message
     * is returned after a successful login.
     */
    @Test
    public void testReturnLoginStatus() {
        
        //Creates a Login object using valid registration details.
        Login login = new Login(
       "Luvo",
       "Nodongwe",
       "lu_vo",
       "Luvo@123",
       "+27603888271");
        
        //Enter the correct username for login.
        login.enteredUsername = "lu_vo";
        
        //Enter the correct password for login.
        login.enteredPassword = "Luvo@123";
        
        /*
        *Check that the expected welcome message is returned
        *when the login credentials are correct.
        */
        assertEquals(
        "Welcome Luvo Nodongwe, it is great to see you again.", login.returnLoginStatus());
    }
    
}
