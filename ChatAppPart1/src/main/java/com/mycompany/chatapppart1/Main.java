/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart1;

import java.util.Scanner;
/**
 *The Main class runs the ChatApp application.
 * It accepts keyboard input from the user and controls
 * the registration and login process.
 * 
 * @author Student
 */
public class Main {
    
    /*
    *The main method is the starting point f the application.
    */
    public static void main (String[] args){
        
        //Create a Scanner object to accept keyboard input from the user.
        Scanner input = new Scanner(System.in);
        
        //Display the registration heading.
        System.out.println("=====REGISTRATION=====");
        
        //Ask the user to enter their first name.
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        //Ask the user to enter their last name.
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        //Ask the user to enter their username.
        System.out.print("Enter your username: ");
        String username = input.nextLine();
        
        //Ask the user to enter their password.
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        
        //Ask the user to enter their cellphone number.
        System.out.print("Enter your cellphone number: ");
        String phoneNumber = input.nextLine();
        
        /*
        *Create a login object and pass the registration information
        *entered by the user to the Login constructor.
        */
        Login login = new Login(
                firstName,
                lastName,
                username,
                password,
                phoneNumber
        );
        
        //Display a blank line to make the output easier to read.
        System.out.println();
        
        /*
        *Call registerUser() to validate the username, password
        *and cellphone number and display the results.
        */
        System.out.println(login.registerUser());
        
        /*
        *Check whether all three registartion requirements
        *have been successfully met.
        *
        *The && operator means that ALL three conditions 
        *must be true before the user can continue to login.
        */
        if (login.checkUserName()
                && login.checkPasswordComplexity()
                && login.checkCellPhoneNumber()){
            
        //Display a blank line before the login section.
        System.out.println();
        
        //Display the login heading
        System.out.println("=====LOGIN=====");
        
        //Ask the user to enter their username.
        System.out.print("Enter your username: ");
        String enteredUsername = input.nextLine();
        
        //Ask the user to enter their password
        System.out.print("Enter your password: ");
        String enteredPassword = input.nextLine();
        
        
        /*
        *Store the username and password entered during login
        *in the Login object so they can be compared with
        *the credentials captured during registration.
        */
        login.enteredUsername = enteredUsername;
        login.enteredPassword = enteredPassword;
        
        /*
        *Call returnLoginStatus() to determine whether 
        *the entered login credentials are correct.
        */
        System.out.println(login.returnLoginStatus());
        
    }else {
            
            /*
            *If one or more registration requirements failed,
            *the login section will not be displayed.
            */
        System.out.println();
        
        //Inform the user that registration was unsuccessful.
        System.out.println("Registration unsuccessful. Please try again.");
    }
            
}
}
