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
 * what will be displayed on the screen after the main method is executed
 * 
 * 1) 30 
 * The stronger Jedi is: Master Joda
 * 
 * 2) 20
 * The stronger Jedi is: Master Yoda
 * 
 * 3) 10
 * The stronger Jedi is: Master Yoda
 * 
 * 4) 30
 * The stronger Jedi is: Darth Vader
 */
public class AbstractChallenge {
    static final int FORCE = 10;
    
    public static void main(String ... doYourBest){
        DarthVader darthVader = new DarthVader(){
            public int getNumber(int number){
                return number;
            }
        };
        
        MasterYoda masterYoda = new AbstractChallenge().new MasterYoda(){
            public int getNumber(int number){
                return number;
            }
        };
        
        System.out.println(darthVader.getNumber(FORCE) +
                masterYoda.getNumber(Integer.valueOf(FORCE)));
        
        System.out.println( "The stronger Jedi is: " + (darthVader.getNumber(FORCE) >
                masterYoda.getNumber(FORCE) ? "Darth vadre" : "Master Yoda" 
                )
        );
            
    }    
    
    abstract class MasterYoda implements LukeSkywalker{
        int getNumber(Integer force){
            return force + 10;
        }
    }
    
    interface LukeSkywalker extends DarthVader{
        int getNumber(int number);
    }
    
    interface DarthVader {
        int getNumber(int number);
    }
}
