/*
 * The Farm Problem
 * 
 * In this challenge, a farmer is asking you to tell him how many legs can be counted among all his animals. The farmer breeds three species:

 * chickens = 2 legs
 * cows = 4 legs
 * pigs = 4 legs
 * 
 * The farmer has counted his animals and he gives you a subtotal for each species. You have to implement a function that returns the total number of legs of all the animals.
 * 
 *  Examples: 
 * 
 * animals(2, 3, 5) ➞ 36
 */


public class TheFarmProblem {
    public static void main(String[] args) {
        int animals = countAnimals(2, 3, 5);
        System.out.println(animals);
    }

    static int countAnimals(int stepsChickens, int stepsCows, int stepsPigs) {
        int legsChickens = 2;
        int legsCows = 4;
        int legsPigs = 4;
        int animalsLogic = (legsChickens * stepsChickens) + (legsCows * stepsCows) + (legsPigs * stepsPigs);
        return animalsLogic;
    }
}
