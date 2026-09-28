/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesq_2;

/**
 *
 * @author Student
 */

import java.util.*;
public class SalesQ_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSales;
        
        System.out.println("Select console type: ");
        System.out.println("1. PSS");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("ENTER CHOICE (1-3): ");
        int choice = input.nextInt();
        
        String consoleType;
        switch(choice){
            case 1: consoleType = "PSS"; break;
            case 2: consoleType = "XBOX"; break;
            case 3: consoleType = "SWITCH"; break;
            default: consoleType = "Unknown Console"; break;
        }
        
        System.out.print("Enter store name: ");
        String storeName = input.nextLine();
        
        System.out.print("Enter total amount: ");
        totalSales = input.nextInt();
        
        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);
        sale.displayReport();
    }
}
