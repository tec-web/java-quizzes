/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Skywalker
 * what will be displayed on the screen after the main method is executed ?
 * 
 * Option 1) 1 2 3 4 5
 * Option 2) 4 2 5
 * Option 3) 1 2 3
 */
public class MapEqualsChallenge {
    public static void main(String ... args){
        Map<Stark, String> map = new LinkedHashMap<>();
        
        map.put(new Stark("Arya"), "1");
        map.put(new Stark("Ned"), "2");
        map.put(new Stark("Sansa"), "3");
        map.put(new Stark("Bran"), "4");
        map.put(new Stark("Jaime"), "5");
        
        map.forEach((k, v) -> System.out.println(v));
    }
    
    static class Stark{
        String name;
        
        Stark(String name){
            this.name = name;
        }
        
        @Override
        public boolean equals(Object obj){
            return ((Stark)obj).name.length() == this.name.length();
        }
        
        @Override
        public int hashCode(){ 
            return 4000 << 2 * 2000 / 10000;
        }
    }
}
