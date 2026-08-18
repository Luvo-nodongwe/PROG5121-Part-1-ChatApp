/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapppart1;

/**
 *
 * @author Student
 */
public class Login {
String username;
String password;
String phoneNumber;
String enteredUsername;
String enteredPassword;
String firstName;
String lastName;

    public Login (String firstName, String lastName, String username, String password, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
               
    }

    public boolean checkUserName(){
        if (username.contains("_") && username.length()<=5){
            return true;
        }else{
            return false;
        } 
    }
      public boolean checkPasswordComplexity(){
       boolean hasUppercase = false;
       boolean hasNumber = false;
       boolean hasSpecialCharacter = false;
       if (password.length()< 8){
           return false;
      }
       for (int i = 0; i < password.length(); i++){
           char character = password.charAt(i);
           if (Character.isUpperCase(character)){
               hasUppercase = true;
           } 
           if (Character.isDigit(character)){
               hasNumber = true;
           }
           if (!Character.isLetterOrDigit(character)){
               hasSpecialCharacter = true;
           }
           }
       if (hasUppercase && hasNumber && hasSpecialCharacter){
           return true;
       } else{
           return false;
       }
    }
      public boolean checkCellPhoneNumber(){
          if (phoneNumber.startsWith("+27")
                  && 
                  phoneNumber.length() == 12){
              
              for (int i = 3; i< phoneNumber.length(); i++){
                  if (!Character.isDigit(phoneNumber.charAt(i))){
                      return false;
                  }
              }
              return true;
          } else {
                  return false;
          }
      }
          public String registerUser(){
              String message = "";
              if (checkUserName()){
                  message += "Username successfully captured.\n";
              } else {
                  message += "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.\n";
              }
              if (checkPasswordComplexity()){
                  message += "Password successfully captured.\n";
              } else {
                  message += "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.\n";
              }
              if (checkCellPhoneNumber()){
                  message += "Cell phone number successfully added.\n";
              }else { 
                  message += "Cell phone number incorrectly formatted or does not contain international code.\n";
              }
              return message;
          }
              
          public boolean loginUser(){
    if (enteredUsername.equals(username) 
            &&
            enteredPassword.equals(password)){
        return true;
          } else {
        return false;
}
          }
          public String returnLoginStatus(){
              if (loginUser()) {
                  return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
              } else { 
                  return "Username or password incorrect, please try again.";
              }
          }
}