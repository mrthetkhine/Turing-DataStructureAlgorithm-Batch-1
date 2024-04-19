/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.hashtable;

import com.turing.dsa.adt.hashtable.linkedlist.LinkedListImpl;
import com.turing.dsa.adt.linkedlist.LinkedList;

/**
 *
 * @author macbook
 */
public class HashTable{
    LinkedListImpl<Integer> table[];
    
    public HashTable()
    {
        this.table = new LinkedListImpl[10];
        for (int i = 0; i < 10; i++) {
            table[i] = new LinkedListImpl<>();
        }
    }
    public void insert(int number)
    {
        int index = this.hash(number);
        this.table[index].insertFirst(number);
    }
    public boolean isItemExist(int number)
    {
        int index = this.hash(number);
        return this.table[index].isItemExist(number);
    }
    int hash(int number)
    {
        return number%10;
    }
}
