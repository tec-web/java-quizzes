/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

/**
 *
 * @author Skywalker
 * what will be displayed on the screen after the main method is executed ?
 * 
 * Option 1) Error in thread main java.lang.ArithmeticException : / by zero
 * Option 2) 0
 * Option 3) Infinity
 */
public class DevGymJavaBasic {
    public static void main(String ... args){
        double d = 10.0/0.0;
        System.out.println(d);
    }
}
