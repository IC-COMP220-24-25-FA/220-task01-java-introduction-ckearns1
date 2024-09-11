package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5)); //these test switch the numbers around to make sure the result is correct reguardless of where the biggest number is 

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){ 
        //Tests whole numbers 
        assertEquals(11, FunctionPractice.calcSalePrice(20, 50, 10));
        //Tests decimals
        assertEquals(10.945, FunctionPractice.calcSalePrice(20, 50.25, 10));
        //Tests 0 in discountPercent
        assertEquals(22, FunctionPractice.calcSalePrice(20, 0, 10));
        //Tests 0 in salesTax
        assertEquals(10, FunctionPractice.calcSalePrice(20, 50, 0));
        //Tests negative number inputs
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-20, 50, 10));
       
    }

    @Test
    public void isGoodDogTest(){
        //Tests to get a true value
        assertEquals(true, FunctionPractice.isGoodDog(1, 1, true));
        //Tests to get a false value
        assertEquals(false, FunctionPractice.isGoodDog(1, 0, true));

    }

    @Test
    public void findFirstLargest(){ 
        //Tests a list witth two largest numbers next to eachother 
        List<Integer> numbers1 = Arrays.asList(0,1,2,3,3,2);
        assertEquals(3, FunctionPractice.findFirstLargest(numbers1));
        //Tests two of the same largest number not next to eachother 
        List<Integer> numbers2 = Arrays.asList(3,1,2,0,3,2);
        assertEquals(0, FunctionPractice.findFirstLargest(numbers2));
        //Tests all of the same number 
        List<Integer> numbers3 = Arrays.asList(4,4,4,4,4,4);
        assertEquals(0, FunctionPractice.findFirstLargest(numbers3));
        //Tests empty list 
        List<Integer> numbers4 = Arrays.asList();
        assertEquals(-1, FunctionPractice.findFirstLargest(numbers4));
        //Tests negative numbers
        List<Integer> numbers5 = Arrays.asList(-5,2,0,8,-1);
        assertEquals(3, FunctionPractice.findFirstLargest(numbers5));
    }
    @Test
    public void findLastLargest(){ 
        //Tests a list witth two largest numbers next to eachother 
        List<Integer> numbers1 = Arrays.asList(0,1,2,3,3,2);
        assertEquals(4, FunctionPractice.findLastLargest(numbers1));
        //Tests two of the same largest number not next to eachother 
        List<Integer> numbers2 = Arrays.asList(3,1,2,0,3,2);
        assertEquals(4, FunctionPractice.findLastLargest(numbers2));
        //Tests all of the same number 
        List<Integer> numbers3 = Arrays.asList(4,4,4,4,4,4);
        assertEquals(5, FunctionPractice.findLastLargest(numbers3));
        //Tests empty list 
        List<Integer> numbers4 = Arrays.asList();
        assertEquals(-1, FunctionPractice.findLastLargest(numbers4));
        //Tests negative numbers
        List<Integer> numbers5 = Arrays.asList(-5,-3,-10,-2,1);
        assertEquals(4, FunctionPractice.findLastLargest(numbers5));
    }
}
