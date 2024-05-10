/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.heap;

import com.turing.dsa.adt.heap.PriorityQueueWithHeap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class PriorityQueueTest {
    @Test
    public void testEnqueue()
    {
        PriorityQueueWithHeap queue = new PriorityQueueWithHeap();
        queue.enque(100);
        queue.enque(200);
        queue.enque(50);
        
        assertEquals(200,queue.deque());
    }
}
