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
 * I defined a class follow (the #REPLACE# tag willl be replaced with the code
 * found in each choice)
 * 
 * Which option will display the following text as a result
 * 345truetrue
 * 
 */
public class FlowControlChange {
    public static void main(String ... doYourBest){
        boolean isBarneyAlcoholic = true;
        boolean isHomerFat = true;
        String result = "";
        
        //#REPLACE#
        
        //Choice One
        if(isHomerFat = false | (isBarneyAlcoholic = false)){
            result += "1";
        }
        if(isHomerFat || isBarneyAlcoholic){
            result += "2";
        }
        if(!isHomerFat && !isBarneyAlcoholic){
            result +="3";
        }
        if((isHomerFat = true) & (isBarneyAlcoholic = true)){
            result += "4";        
        }
        if(isHomerFat || (isBarneyAlcoholic = false)){
            result += 5;
        }
           
        
        //Choice two
//        if(!(isHomerFat = false) && !(isBarneyAlcoholic = false)){
//            result += "3";
//        }
//        if((isHomerFat = true) & (isBarneyAlcoholic = true)){
//            result += "4";
//        }
//        if(isHomerFat | (isBarneyAlcoholic = false)){
//            result += "5";
//        }
        
        //Choice Three
//        if(!(isHomerFat = true) || !(isBarneyAlcoholic = false)){
//            result += "3"; 
//        }
//        if((isHomerFat = true) & (isBarneyAlcoholic = true)){
//            result += "4";
//        }
//        if((isBarneyAlcoholic = !false) || isHomerFat){
//            result += "5";
//        }        
        
        //Choice Four
//        if(!(isHomerFat = true) || !(isBarneyAlcoholic = !false)){
//            result += "2";
//        }
//        if((isHomerFat = true) & !(isBarneyAlcoholic = !isBarneyAlcoholic)){
//            result += "3";
//        }
//        if((isBarneyAlcoholic = !isBarneyAlcoholic) && isHomerFat){
//            result += "4";
//        }
//        if((isBarneyAlcoholic = !false) | isHomerFat){
//            result += "5";
//        }
        
        System.out.println(result+isHomerFat+isBarneyAlcoholic);
        
        
//        System.out.println(isHomerFat & false);
//        System.out.println(isHomerFat);
//        System.out.println(isHomerFat & true);
//        System.out.println(isHomerFat);                
        //if(isHomerFat = true){
        //    System.out.println("print isHomerFat");
        //}        
    }
}
