/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.hastable.linkedlist;

import com.turing.dsa.adt.hashtable.linkedlist.LinkedListImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class LinkedListTest {
    @Test
    public void testItemExist()
    {
        LinkedListImpl<Integer> linkedList = new LinkedListImpl<>();
        
        linkedList.insertFirst(100);
        linkedList.insertFirst(200);
        
        assertEquals(true, linkedList.isItemExist(100));
        assertEquals(true, linkedList.isItemExist(200));
        assertEquals(false, linkedList.isItemExist(300));
       
    }
}
