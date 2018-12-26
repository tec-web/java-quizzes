/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

/**
 *
 * @author Skywalker
 * Which option produces the output "MnNeH"
 */
public class SwitchCaseChallenge {
    public static void main(String ... doYourBest){
        int formulaNumber = 50;
        
        String heisenbergFormula = "";
        
        //#REPLACE
        //Option 1        
//        switch(formulaNumber){
//            case 30: heisenbergFormula += "Zn";
//                     break;
//            case 50: heisenbergFormula += "Mn";
//            case 10: heisenbergFormula += "Ne";
//            case 5: heisenbergFormula += "H";
//                    break;
//            default: 
//                    heisenbergFormula += "He";
//        }

        //Option 2
//        switch(formulaNumber){
//            case 30: heisenbergFormula += "Zn";
//                     break;
//            case 10: heisenbergFormula += "O";            
//            case 50: heisenbergFormula += "Mn";            
//            case 5: heisenbergFormula += "Ne";
//            default: 
//                    heisenbergFormula += "H";
//        }
        
        //Option 3
//        switch(formulaNumber){
//            case 50: heisenbergFormula += "Mn";
//            case 10: heisenbergFormula += "Ne";
//                     break;            
//            case 30: heisenbergFormula += "Zn";
//            case 5: heisenbergFormula += "O";                        
//            default: 
//                    heisenbergFormula += "H";
//        }
        //Option 4
//        switch(formulaNumber){
//            case 20: heisenbergFormula += "Mn";
//            case 60: heisenbergFormula += "Ne";
//                     break;
//            case 50: case 10: heisenbergFormula += "Mn";         
//            case 5:  case 90: heisenbergFormula += "Ne";                     
//            default: 
//                     heisenbergFormula += "H";
//        }

        //Test my self
        switch(formulaNumber){
            case 20: heisenbergFormula += "Mn";
            default: 
                     heisenbergFormula += "H";            
            case 60: heisenbergFormula += "Ne";
                     break;
            case 50: case 10: heisenbergFormula += "Mn";         
            case 5:  case 90: heisenbergFormula += "Ne";                     
        }        
        
        System.out.println(heisenbergFormula);
    }
}
