package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative numbers.");
        }
        return Math.max(first, Math.max(second, third));
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        if (originalPrice < 0 || discountPercent < 0 || salesTax < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative numbers.");
        }
        double discountedPrice = originalPrice * (1 - discountPercent / 100);
        double taxAmount = discountedPrice * (salesTax / 100);
        return discountedPrice + taxAmount;

        //throw new RuntimeException("Not Implemented");
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (daysSinceShoesChewed > 0 && fetchedThePaperToday){
            return true;
        }
        if (daysSinceShoesChewed < 0 || fetchedThePaperToday){
            return false;
        }
        return false;

        
    
        //throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.isEmpty()) {
            return -1; // Handle empty list case
        }
        int largestIndex = 0; // Start by assuming the first element is the largest
        int largestValue = numbers.get(0);

        for (int i = 1; i < numbers.size();i++) {
            
            if (numbers.get(i) > largestValue) {
                largestValue = numbers.get(i); // Update largest value
                largestIndex = i; // Update largest index
                }
            }
        return largestIndex;


    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        int smallestIndex = 0;
        int smallestValue = 0;

        for (int i = 1; i < numbers.size();) {
            if (numbers.get(i) < smallestValue) {
                smallestValue = numbers.get(i); // Update largest value
                smallestIndex = i; // Update largest index
                }
            }
        return smallestIndex;
        }
        //throw new RuntimeException("Not Implemented");
    

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}

