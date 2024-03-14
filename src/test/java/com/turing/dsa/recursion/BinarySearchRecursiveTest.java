/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion;

import com.turing.dsa.array.*;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class BinarySearchRecursiveTest {
    @Test 
    public void testBinarySearchSearch()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new BinarySearchRecursive(items);
        
        int index = arr.findItem(1);
        assertEquals(0,index);
    }
    @Test 
    public void testBinarySearchAverage()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new BinarySearchRecursive(items);
        
        int index = arr.findItem(4);
        assertEquals(3,index);
    }
    @Test 
    public void testBinarySearchWorstCase()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new BinarySearchRecursive(items);
        
        int index = arr.findItem(7);
        assertEquals(-1,index);
    }
    @Test 
    public void testBinarySearchWorstCaseLeftSide()
    {
        int items[]= new int[]{1,2,3,4,5,6};   
        Searchable arr = new BinarySearchRecursive(items);
        
        int index = arr.findItem(-7);
        assertEquals(-1,index);
    }
}
