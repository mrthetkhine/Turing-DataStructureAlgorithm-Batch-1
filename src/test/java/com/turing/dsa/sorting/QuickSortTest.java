/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class QuickSortTest {
    //Sortable algo = new QuickSortV1();
    Sortable algo = new QuickSorInPlaceSwap();
    @Test 
    public void testQuickSoftBaseCase()
    {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{8,3};
       Util.print("Arr ",arr);
      
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
    }
    @Test
    public void testQuickSoftBaseCaseAnotherOrder()
    {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{3,8,1};
       Util.print("Arr ",arr);
      
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
    }
    @Test
    public void testQuickSoftManyCase()
    {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{3,8,11,2,10};
       Util.print("Arr ",arr);
      
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
    }
}
