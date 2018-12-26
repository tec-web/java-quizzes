/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

/**
 *
 * @author Skywalker
 * 
 * which option is correct to show 6
 */
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
        
public class FunctionChallenge {
    
    public static void main(String ... doYourBest){
        BiFunction<Integer, Integer, Integer> add = (a, b)-> a + b;
        Function<Integer, Integer> sub = (a) -> a - 2;
        Function<Integer, Integer> mult = (a) -> a * 3;
        
        BiConsumer<Integer, Integer> consumer = (a, b) 
                -> System.out.println(a + 2 + b +2 );
        
        //##REPLACE##
        
        //Option 1
//        BiFunction<Integer, Integer, Integer> func = 
//                add.andThen(sub).andThen(sub).andThen(sub);
//        
//        int firstResult = func.apply(2, 2);
//        
//        add.andThen(sub).andThen(mult);
//        
//        int secondResult = add.apply(2, 2);
        
        //Option 2
//        BiFunction<Integer, Integer, Integer> func =
//                add.andThen(sub).andThen(sub).andThen(sub);
//        
//        int firstResult = func.apply(2, 2);
//        
//        int secondResult = mult.apply(2);
        
        //Option 3
//        BiFunction<Integer, Integer, Integer> func =
//                add.andThen(sub).andThen(sub).andThen(sub);
//        
//        int firstResult = func.apply(2, 2);
//        
//        BiFunction<Integer, Integer, Integer> func2 =
//                add.andThen(sub).andThen(mult).andThen(sub);
//        
//        int secondResult = func2.apply(2, 2);
        
        //Option 4
        Function<Integer, Integer> func =
                sub.andThen(sub).andThen(sub);
        
        int firstResult = func.apply(2);
        
        int secondResult = mult.apply(2);
        
        consumer.accept(firstResult, secondResult);
    }
}
