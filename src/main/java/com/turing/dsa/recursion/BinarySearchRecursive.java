/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion;

import com.turing.dsa.array.*;

/**
 *
 * @author macbook
 */
public class BinarySearchRecursive extends Array implements Searchable
{

    public BinarySearchRecursive(int[]items)
    {
        super(items);
    }
    @Override
    public int findItem(int value)
    {
        return this.findItem(value, 0, items.length-1);
    }
    public int findItem(int value, int first , int last ) {
      
       int middle = (first+last)/2;
       if(first<=last)
       {
           if(this.items[middle] == value)
           {
               return middle;
           }
           else if( this.items[middle]< value)
           {
               return findItem(value,middle+1,last);
           }
           else
           {
               return findItem(value,first,middle-1);
           }
       }
       else
       {
           return -1;
       }
      
    }
    
}
