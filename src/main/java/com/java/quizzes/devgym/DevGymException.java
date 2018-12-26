/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

/**
 *
 * @author Skywalker
 * what will be displayed after executing 
 * 
 * 1) 
 * ArithmeticException will be thrown
 * Exception
 * Finally
 * 
 * 2) 
 * exceptionNumber
 * NullPointerException will be thrown
 * NullPointer
 * Finally
 * 
 * 3)
 * IllegalArgumentException will be thrown
 * IllegalArgument
 * Finally
 * 
 * 4)
 * IllegalArgumentException
 * IllegalArgument
 * 
 */
public class DevGymException {
    private static IllegalArgumentException illegalArgument;
    
    public static void main(String ... doYourBest){
        try{
        double exceptionNumber = 2 / 0.0;
        System.out.println("exceptionNumber");
        
        throw illegalArgument;
        }catch(NullPointerException nullPointer){
            System.out.println("NullPointer");
        }catch(IllegalArgumentException illegalArgument){
            System.out.println("IllegalArgument");
        }catch(Exception e){
            System.out.println("Exception");
        }finally{
            System.out.println("Finally");
        }
    }
}
