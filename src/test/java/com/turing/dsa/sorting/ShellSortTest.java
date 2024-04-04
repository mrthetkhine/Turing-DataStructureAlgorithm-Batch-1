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
public class ShellSortTest {
    Sortable algo = new ShellSort();
    
     @Test
    public void testShellSortManyCase()
    {
       //int arr[]= Util.getRandomArray(5,100);
       int arr[] = new int[]{3,8,11,2,10};
       Util.print("Arr ",arr);
     
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
    }
    
    @Test
    public void testShellSortRandom()
    {
       int arr[]= Util.getRandomArray(8,100);
       
       Util.print("Arr ",arr);
       
       algo.sort(arr);
       
       Util.print("Sorted ",arr);
       assertTrue(Util.isArraySorted(arr));
    }
}
