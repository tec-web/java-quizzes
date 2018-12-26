/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.quizzes.devgym;

/**
 *
 * @author Skywalker how many objects are ellegible for the garbage collector
 * after executeAction is performed ? option 1 -> 2 option 2 -> 1 option 3 ->
 * None oprion 4 -> 3
 */
public class GarbageCollectorTest {

    public static void main(String... args) {
        HowManyObjectsWillBeCleanedByTheGarbageCollector gc = new 
            GarbageCollectorTest().new HowManyObjectsWillBeCleanedByTheGarbageCollector();

        gc.executeAction();

        System.out.println("How many objects are eligible be collected by "
                + "the Garbage Collector after "
                + "the executeAction() method invokation?" + gc);
    }

    private class HowManyObjectsWillBeCleanedByTheGarbageCollector {

        private Character homer = new Character("Dooh");
        private Character misterBurns = new Character("you are fired");
        private Character bart = new Character("eat my shorts");
        private Character elBarto;

        public void executeAction() {
            homer.talk();
            misterBurns.talk();
            makeTwoCharactersToTalk(misterBurns, homer);
            misterBurns = null;
            elBarto = bart;
            bart = null;
            elBarto.talk();
        }

        private void makeTwoCharactersToTalk(Character misterBurns, Character homer) {
            misterBurns.talk();
            homer.talk();
            misterBurns = null;
            homer = null;
        }
    }

    class Character {

        String talk;

        public Character(String talk) {
            this.talk = talk;
        }

        public void talk() {
            System.out.println(this.talk);
        }
    }
}
