/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.linkedlist;

import com.turing.dsa.adt.linkedlist.QueueWithLinkedList;
import com.turing.dsa.adt.queue.CircularQueue;
import com.turing.dsa.adt.queue.Queue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class QueueWithLinkedListTest {
    QueueWithLinkedList queue = new QueueWithLinkedList();
    
    @Test
    public void testEnque()
    { 
          
        queue.enque(10);   
     
        assertEquals(false,queue.isEmpty());
        
        int element = queue.deque();
        assertEquals(10,element);
        
    }
   
    @Test
    public void testEnqueMany()
    {
      
       
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        
      
        assertEquals(false,queue.isEmpty());
        
        assertEquals(10,queue.deque());
        assertEquals(20,queue.deque());
        assertEquals(30,queue.deque());
        assertEquals(40,queue.deque());
        
    }
}
