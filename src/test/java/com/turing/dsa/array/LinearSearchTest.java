/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.array;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class LinearSearchTest {
    @Test 
    public void testLinearSearch()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new LinearSearch(items);
        
        int index = arr.findItem(1);
        assertEquals(0,index);
    }
    @Test 
    public void testLinearSearchAverage()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new LinearSearch(items);
        
        int index = arr.findItem(4);
        assertEquals(3,index);
    }
    @Test 
    public void testLinearSearchWorstCase()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new LinearSearch(items);
        
        int index = arr.findItem(-4);
        assertEquals(-1,index);
    }
    @Test 
    public void testSortedLinearSearch()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new SortedLinearSearch(items);
        
        int index = arr.findItem(1);
        assertEquals(0,index);
    }
    @Test 
    public void testSortedLinearSearchAverage()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new SortedLinearSearch(items);
        
        int index = arr.findItem(4);
        assertEquals(3,index);
    }
    @Test 
    public void testSortedLinearWorstCase()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new LinearSearch(items);
        
        int index = arr.findItem(-4);
        assertEquals(-1,index);
    }
    @Test
    public void test()
    {
        Array arr = new Array(5);
        arr.put(1, 100);
        assertEquals(100,arr.get(1));
    }
}
