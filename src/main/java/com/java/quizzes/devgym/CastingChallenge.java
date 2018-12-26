/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

/**
 *
 * @author Skywalker
 * what will be the output when the main program is executed
 */

public class CastingChallenge {
    public static void main(String ... doYourBest){
        int number1 = (int)(long)1.0D;
        short number2 = 1;
        Short number3 = (Short)(short)(float)1.0D;
        Object number4 = (int)(Number)(Double)(Object)(double)2.0D;
        Double number5 = (double)(int)(char)2.0D;
        Short number6 = getNumber(Short.valueOf("2"));
        
        // n1=1, n2=1, n3= 1, n4 = ?, n5 = ?, n6= 2        
        System.out.println(number1 +
                number2 +
                number3.doubleValue() +
                Integer.valueOf(number4.toString()) + number5.doubleValue() +
                number6.doubleValue()
        );
    }
    
    static<T> T getNumber(T number){
        return number;
    }
}
