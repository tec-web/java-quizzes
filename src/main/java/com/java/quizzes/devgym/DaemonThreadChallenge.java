package com.java.quizzes.devgym;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Which option will execute the loop from the run method forever ?
 * 
 * @author Skywalker
 */
public class DaemonThreadChallenge implements Runnable{
    public static void main(String ... doYourBest){
        Thread t = new Thread(new DaemonThreadChallenge());
        
        //Option 1
        //t.setDaemon(true);
        //t.start();
        
        //Option 2
        //t.setDaemon(false);
        //t.start();
        
        //Option 3
        //t.setDaemon(true);
        //t.run();
        
        //Option 4
        t.setDaemon(true);
        t.start();
        t.start();
        
    }
    
    @Override
    public void run(){
        for(;;){
            System.out.println("For ever");
        }
    }
}
