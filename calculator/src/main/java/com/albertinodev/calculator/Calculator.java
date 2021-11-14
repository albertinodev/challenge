package com.albertinodev.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Albertino Augusto */

public class Calculator {
    
    //Sum calculations method
    public BigDecimal sum(String a, String b) {
        BigDecimal valueToReturn = null;
        
        try {
            BigDecimal param1 = new BigDecimal(a);
            BigDecimal param2 = new BigDecimal(b);

            valueToReturn = param1.add(param2);
            System.out.println("Result is: " + valueToReturn);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return valueToReturn;
    } 
    
    //Subtract calculations method
    public BigDecimal subtract(String a, String b) {
        BigDecimal valueToReturn = null;
        
        try {
            BigDecimal param1 = new BigDecimal(a);
            BigDecimal param2 = new BigDecimal(b);

            valueToReturn = param1.subtract(param2);
            System.out.println("Result is: " + valueToReturn);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return valueToReturn;
    } 
    
    //Multply calculations method
    public BigDecimal multiply(String a, String b) {
        BigDecimal valueToReturn = null;
        
        try {
            BigDecimal param1 = new BigDecimal(a);
            BigDecimal param2 = new BigDecimal(b);

            valueToReturn = param1.multiply(param2);
            System.out.println("Result is: " + valueToReturn);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return valueToReturn;
    } 
        
    //Divide calculations method
    public BigDecimal divide(String a, String b) {
        BigDecimal valueToReturn = null;
        
        try {
            BigDecimal param1 = new BigDecimal(a);
            BigDecimal param2 = new BigDecimal(b);

            valueToReturn = param1.divide(param2, 15, RoundingMode.HALF_UP);
            System.out.println("Result is: " + valueToReturn);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return valueToReturn;
    } 
}
