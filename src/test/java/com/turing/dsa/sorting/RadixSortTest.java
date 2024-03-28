/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

import com.turing.dsa.recursion.MergeSort;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class RadixSortTest {
   
   
  
    @Test
   public void mergeSortTestWithRandom()
   {
     
       //int arr[]= Util.getRandomArray(15,100);
       int arr[] = new int[]{8,3,5,217,11,-229};
       Util.print("Arr ",arr);
       RadixSort algo = new RadixSort();
       //algo.sort(arr);       
       int length = algo.maxDigit(arr);
       assertEquals(3,length);
   }
    @Test
    public void testRadixSortManyCase()
    {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{3,8,11,2,10};
       Util.print("Arr ",arr);
       RadixSort algo = new RadixSort();
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
    }
     @Test
    public void testRadixSortManyCaseRandom()
    {
       int arr[]= Util.getRandomArray(5,100);
       
       Util.print("Arr ",arr);
       RadixSort algo = new RadixSort();
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
    }
   
}
