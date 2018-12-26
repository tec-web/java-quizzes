/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

/**
 *
 * @author Skywalker
 * what is the ouput of below program
 * 
 * option 1) [Tyrion, Arya, Joon]
 * option 2) [Tyrion, Arya, John, Bran]
 * option 3) java.lang.UnsoportedOperationException will be thrown
 */
import java.util.Arrays;
import java.util.List;

public class ListChallenge {
    public static void main(final String ... doYourBest){
        final List<String> soldiers = Arrays.asList("Tyrion","Arya","John");
        
        if(soldiers.size() > 3){
            soldiers.add("Cersei");
        }else{
            soldiers.add("Bran");
        }
        
        System.out.println(soldiers);
    }  
}
