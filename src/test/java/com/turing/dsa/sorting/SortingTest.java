/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class SortingTest {
   
   
    /*
   @Test
   public void selectionSortTest()
   {
       //assertEquals(true,isArraySorted(new int[]{1,1,2,3}));
       //assertEquals(false,isArraySorted(new int[]{1,11,2,3}));
       //assertEquals(true,isArraySorted(new int[]{}));
       int arr[]= Util.getRandomArray(10,100);
       Util.print("Arr ",arr);
       SelectionSort algo = new SelectionSort();
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
*/
    /*
    @Test
   public void bubbleSortTest()
   {
       //assertEquals(true,isArraySorted(new int[]{1,1,2,3}));
       //assertEquals(false,isArraySorted(new int[]{1,11,2,3}));
       //assertEquals(true,isArraySorted(new int[]{}));
       int arr[]= Util.getRandomArray(5,100);
       Util.print("Arr ",arr);
       Sortable algo = new BubbleSort();
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
*/
    @Test
   public void insertionSortTest()
   {
     
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{8,3,5,7,1};
       Util.print("Arr ",arr);
       Sortable algo = new InsertionSort();
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
   }
}
