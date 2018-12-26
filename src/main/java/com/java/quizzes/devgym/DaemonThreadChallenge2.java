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
 * What will be displayed on the screen after the main method gets executed ?
 * 
 * Option 1) It will throw StackOverFlowException
 * Option 2) It will print forever infinitely
 * Option 3) It will print forever an indeterminate time and the program will terminate normally
 */
public class DaemonThreadChallenge2 implements Runnable{
    
    public static void main(String ... args){
        Thread t = new Thread(new DaemonThreadChallenge2());
        t.setDaemon(true);
        t.start();
    }

    @Override
    public void run() {
        for(;;){
            System.out.println("Forever");
        }
    }
    
}
