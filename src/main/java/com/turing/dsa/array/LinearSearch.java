/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.array;

/**
 *
 * @author macbook
 */
public class LinearSearch extends Array implements Searchable
{

    public LinearSearch(int[]items)
    {
        super(items);
    }
    @Override
    public int findItem(int item) {
        //int index = -1;
        int length = this.items.length;
        for (int i = 0; i < length; i++) {
            if(this.items[i]== item)
            {
                return i;
            }
        }
        return -1;
    }
    
}
