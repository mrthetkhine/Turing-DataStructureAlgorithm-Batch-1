/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.hastable;

import com.turing.dsa.adt.hashtable.HashTable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class HastableTest {
    @Test
    public void testHashTable()
    {
        HashTable hashTable = new HashTable();
        hashTable.insert(100);
        hashTable.insert(200);
        hashTable.insert(13);
        hashTable.insert(23);
        
        assertEquals(true,hashTable.isItemExist(100));
        assertEquals(true,hashTable.isItemExist(200));
        //assertEquals(true,hashTable.isItemExist(23));
        //assertEquals(true,hashTable.isItemExist(13));
        //assertEquals(false,hashTable.isItemExist(150));
    }
}
