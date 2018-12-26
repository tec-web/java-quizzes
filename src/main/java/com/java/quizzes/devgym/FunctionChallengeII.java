/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

import java.util.function.Function;

/**
 *
 * what will be the output of following program
 * 
 * Option 1 -> 0
 * Option 2 -> java.lang.ArtithmeticException
 * Option 3 -> 1
 * 
 */
public class FunctionChallengeII {
    public static void main(String ... args){
        Function<Integer, Integer> add = x -> x + 2;
        Function<Integer, Integer> sub = x -> x - 2;
        Function<Integer, Integer> div = x -> x / 2;
        
        Function<Integer, Integer> func = add.andThen(sub).andThen(div);
        
        System.out.println(func.apply(2));        
    }
}
