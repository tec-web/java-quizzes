/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

import java.math.BigDecimal;

/**
 * Choose option to get out below output
 * Zeus Kratos Athena
 * 
 * @author Skywalker
 */
public class GodOfWarConstructorChallenge {
    String name;
    
    GodOfWarConstructorChallenge(String name){
        this.name = name;
    }
    
    GodOfWarConstructorChallenge(){
        this(getName(1));
    }
    
    
    GodOfWarConstructorChallenge(int i){
        this(getName(2));
    }
    
    GodOfWarConstructorChallenge(Object i){
        this(getName((Integer)i));
    }
    
    static String getName(int index){
        String name = new String[]{"Kratos","Zeus","Poseidon","Hades","Athena"}[index];
        
        return name;
    }
    
    public static void main(String ... doYourBest){        
        //option 1
//        GodOfWarConstructorChallenge firstGod = 
//                new GodOfWarConstructorChallenge();
//        GodOfWarConstructorChallenge secondGod =
//                new GodOfWarConstructorChallenge("Kratos");
//        GodOfWarConstructorChallenge thirdGod = 
//                new GodOfWarConstructorChallenge(Integer.valueOf(4));
        
        //option 2
//        GodOfWarConstructorChallenge firstGod = 
//                new GodOfWarConstructorChallenge();
//        GodOfWarConstructorChallenge secondGod =
//                new GodOfWarConstructorChallenge(BigDecimal.valueOf(0));
//        GodOfWarConstructorChallenge thirdGod = 
//                new GodOfWarConstructorChallenge(Long.valueOf(4));

        //option 3
//        GodOfWarConstructorChallenge firstGod = 
//                new GodOfWarConstructorChallenge(1);
//        GodOfWarConstructorChallenge secondGod =
//                new GodOfWarConstructorChallenge(0);
//        GodOfWarConstructorChallenge thirdGod = 
//                new GodOfWarConstructorChallenge(Integer.valueOf(4));
        
        //option 4
        GodOfWarConstructorChallenge firstGod = 
                new GodOfWarConstructorChallenge(Integer.valueOf(1));
        GodOfWarConstructorChallenge secondGod =
                new GodOfWarConstructorChallenge(Integer.valueOf(0));
        GodOfWarConstructorChallenge thirdGod = 
                new GodOfWarConstructorChallenge(Integer.valueOf(4));
                
        
        System.out.print(firstGod.name + " " );
        System.out.print(secondGod.name + " " );
        System.out.print(thirdGod.name);
    }
}
