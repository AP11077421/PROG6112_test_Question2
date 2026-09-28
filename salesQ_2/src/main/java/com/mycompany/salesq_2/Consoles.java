/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesq_2;

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsoles{
    String consoleType;
    String storeName;
    int totalAmount;

    public Consoles(String consoleType, String storeName, int totalAmount) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalAmount = totalAmount;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
        
    }

    @Override
    public String getStore() {
        return storeName;
        
    }

    @Override
    public int getTotalSales() {
        return totalAmount;
        
    }
    
    public abstract void displayReport();
    
 
}
