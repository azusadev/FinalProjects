/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.finalprojects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reden
 */
public class SaveSystem {
    
    public static void Save(String fileName, ArrayList<Account> account)
    {
        if(!fileName.isEmpty())
        {
            try {
                
                File file = new File(fileName + ".txt");
                if(!file.exists()){
                    if(file.createNewFile())
                    {
                        System.out.println("User accounts created!");
                    }
                }else
                {
                }
                FileWriter fw = new FileWriter(file);
                for (int i = 0; i < account.toArray().length; i++) {
                    fw.write(account.toArray()[i].toString() + "\n");
                }
                fw.close();
            } catch (IOException e) {
                
            }
        }
    }
    
  
    public static void Save(String fileName, Account account)
    {
        if(!fileName.isEmpty())
        {
            try {
                
                File file = new File(fileName + ".txt");
                if(!file.exists()){
                    if(file.createNewFile())
                    {
                        System.out.println("User accounts created!");
                    }
                }else
                {
                }
                FileWriter fw = new FileWriter(file);
                fw.write(account.toString() + "\n");
                fw.close();
            } catch (IOException e) {
                
            }
        }
    }
    
    public static ArrayList<Account> Load(String fileName)
    {
        ArrayList<Account> list = new ArrayList<>();
        if(!fileName.isEmpty())
        {
            try {
                File file = new File(fileName + ".txt");
                if(!file.exists())
                {
                    file.createNewFile();
                }
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine())
                {
                    String[] s = sc.nextLine().split(":");
                    AccountLevel level = AccountLevel.Manager;
                    switch(s[0])
                    {
                        case "Manager":
                            level = AccountLevel.Manager;
                            break;
                        case "Cashier":
                            level = AccountLevel.Cashier;
                            break;
                    }
                    list.add(new Account(level,s[1],s[2],s[3],s[4]));
                }
                
            } catch (IOException e) {
                
            }
        }
        return list;
    }
}
