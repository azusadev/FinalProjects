/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.finalprojects;

/**
 *
 * @author 
 */
public class Account {

    private AccountLevel level;
    private String username;
    private String password;
    private String fullName;
    private String dateRegistered;
    
    public Account(AccountLevel lvl,String user, String pass, String name, String date)
    {
        level = lvl;
        username= user;
        password = pass;
        fullName = name;
        dateRegistered = date;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getDate()
    {
        return dateRegistered;
    }
    
    
    @Override
    public String toString()
    {
        return level + ":" + username  +":" + password +":" + fullName +":" + dateRegistered;
    }
}





