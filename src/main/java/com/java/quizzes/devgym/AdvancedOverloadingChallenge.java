/*
I define a class follows (the ##REPLACE## tag will be replaced with the code found in each choice):

public class AdvancedOverloadingChallenge {
   static String x = "";
   public static void main(String... doYourBest) {
      ##REPLACE##
      
      System.out.println(x);
   }
   static void executeAction(int ... var) {x += "a"; }
   static void executeAction(Integer var) {x += "b"; }
   static void executeAction(Object var)  {x += "c"; }
   static void executeAction(short var)   {x += "d"; }
   static void executeAction(float var)   {x += "e"; }
   static void executeAction(double var)  {x += "f"; }
}
Mark a choice as correct if after executing these statements....

javac AdvancedOverloadingChallenge.java
java AdvancedOverloadingChallenge
The following text is displayed:

efce 

*/
package com.java.quizzes.devgym;

/**
 *
 * @author Skywalker
 */
public class AdvancedOverloadingChallenge {
      static String x = "";
      
      public static void main(String[] args){
           //Option 1 
           executeAction(1);
           executeAction(1.0);
           executeAction(Double.valueOf("5"));
           executeAction(1L);
           
           //Option 2
           //executeAction(Float.valueOf(1));
           //executeAction(Double.valueOf(1));
           //executeAction(new Object());
           //executeAction(Float.valueOf(1));
           
           //Option 3
           //executeAction(1f);
           //executeAction(1.0d);
           //executeAction();
           //executeAction(1d);
           
           //Option 4
           //executeAction(1F);
           //executeAction(1.0);
           //executeAction(new StackOverflowError());
           //executeAction(1);
           
           System.out.println(x);
      }
      
      static void executeAction(int ... var){ x +=  "a";}
      static void executeAction(Integer var){ x +=  "b";}
      static void executeAction(Object var) { x +=  "c";}
      static void executeAction(short var)  { x +=  "d";}
      static void executeAction(float var)  { x +=  "e";}
      static void executeAction(double var) { x +=  "f";}
}
