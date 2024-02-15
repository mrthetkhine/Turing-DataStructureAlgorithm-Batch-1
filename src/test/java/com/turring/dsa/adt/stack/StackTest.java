/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.stack;

import com.turing.dsa.adt.stack.Stack;
import com.turing.dsa.adt.stack.StackOverflowException;
import com.turing.dsa.adt.stack.StackUnderflowException;
import com.turing.dsa.adt.stack.Stackable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class StackTest {
    //Arrange
    Stackable stack = new Stack(10);
    
    @Test
    void testPushSingle()
    {
        
          //Act
        stack.push(100);
        
        //Assert
        assertEquals(1,stack.getSize());
        assertEquals(100,stack.peek());
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
            assertEquals(i,element);
        }
    }
    @Test
    void testPushMultipleNegative()
    {
        //act
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        StackOverflowException exception = assertThrows(StackOverflowException.class, () -> {
            stack.push(11);
        });
        assertEquals(true,stack.isFull());
        
    }
    @Test
    void testPopSingle()
    {
          //Act
        stack.push(100);
        
        //Assert
        int original = stack.getSize();
        assertEquals(100,stack.pop());
        assertEquals(original-1,stack.getSize());
    }
     @Test
    void testPopNegativeCase()
    {
        StackUnderflowException exception = assertThrows(StackUnderflowException.class, () -> {
            stack.pop();
        });
        assertEquals(true,stack.isEmpty());
    }
}
