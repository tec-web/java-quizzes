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
 * What will happen after the main method is executed as follows
 * 
 * 1) It won't compile at //Line 23
 * 2) It won´t compile at //Line 7
 * 3) It won't compile at //Line 29
 * 4) BAMM!!POHHH!!!
 * 
 */
public class LambdaChallenge {
    public static void main(String ... doYourBest){
        String vitoCorleoneShoot = useRevolver(() -> "BAMM!!");
        
        String michaelCorleoneShoot = useShotGun(() -> {
            return "POHHH!!!"; //line 7
        });
        
        System.out.println(vitoCorleoneShoot + michaelCorleoneShoot);
    }

    private static String useRevolver(Revolver revolver){
        return revolver.shoot();
    }
    
    static String useShotGun(Shotgun shotgun){
        return shotgun.shoot();
    }
    
    private interface Revolver{
        String shoot(); //line 23
    }
    
    public interface Shotgun{
        String shoot();
        
        default String reload(){ //line 29
            return "Reloading ...";
        } 
    }
}
