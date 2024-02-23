/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.queue;

import com.turing.dsa.adt.queue.CircularQueue;
import com.turing.dsa.adt.queue.Queue;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class CircularQueueTest{
    
    Queue queue = new CircularQueue(5);
    @Test
    public void testCircularQueue()
    {
      
        for (int i = 0; i < 5; i++) {
            queue.enque(i);//0
        }
        
        assertEquals(5,queue.getSize());
        assertEquals(false,queue.isEmpty());
        
        for (int i = 0; i < 5; i++) {
            assertEquals(i,queue.deque());
        }
        
        queue.enque(10);
        assertEquals(1,queue.getSize());
        assertEquals(10,queue.deque());
    }
    
}
