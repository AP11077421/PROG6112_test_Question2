/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesq_2;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleType, String storeName, int totalAmount) {
        super(consoleType, storeName, totalAmount);
    }
    
    @Override
    public void displayReport(){
    System.out.println("\nCONSOLE SALE REPORT");
    System.out.println("Console Type: " + getConsoleType());
    System.out.println("Store name: "+ getStore());
    System.out.println("Total Sales: "+ getTotalSales());
    System.out.println("**************************");
}
}
