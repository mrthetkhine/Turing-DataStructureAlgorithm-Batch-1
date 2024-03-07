/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.linkedlist;

import com.turing.dsa.adt.linkedlist.StackWithLinkedList;
import com.turing.dsa.adt.stack.Stack;
import com.turing.dsa.adt.stack.Stackable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class StackWithLinkedListTest {
    StackWithLinkedList stack = new StackWithLinkedList();
    
    @Test
    void testPushSingle()
    {
        
          //Act
        stack.push(100);
        
      
        assertEquals(100,stack.pop());
    }
    
    @Test
    void testPushMultiple()
    {
        //act
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
       
        
        //assert
        for (int i = 9; i >= 0; i--) {
            int element = stack.pop();
            System.out.println("Element "+element);
            assertEquals(i,element);
        }
    }
    
}
