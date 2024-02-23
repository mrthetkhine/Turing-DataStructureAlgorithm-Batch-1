/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.queue;

import com.turing.dsa.adt.queue.ArrayBasedQueue;
import com.turing.dsa.adt.queue.CircularQueue;
import com.turing.dsa.adt.queue.Queue;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class QueueTest {
    //Queue queue = new ArrayBasedQueue(5);
    Queue queue = new CircularQueue(5);
    
    @Test
    public void testEnque()
    {
      
        int orgSize = queue.getSize();    
        queue.enque(10);
        
        assertEquals(1,queue.getSize());
        assertEquals(false,queue.isEmpty());
        
        int element = queue.deque();
        assertEquals(10,element);
        
    }
    @Test
    public void testEnqueMany()
    {
      
        int orgSize = queue.getSize();    
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        
        assertEquals(4,queue.getSize());
        assertEquals(false,queue.isEmpty());
        
        assertEquals(10,queue.deque());
        assertEquals(20,queue.deque());
        assertEquals(30,queue.deque());
        assertEquals(40,queue.deque());
        
    }
    @Test
    public void testEnqueFull()
    {
      
        int orgSize = queue.getSize();    
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        queue.enque(50);
        
        assertEquals(5,queue.getSize());
        assertEquals(false,queue.isEmpty());
        
        assertEquals(10,queue.deque());
        assertEquals(20,queue.deque());
        assertEquals(30,queue.deque());
        assertEquals(40,queue.deque());
        assertEquals(50,queue.deque());
    }
    @Test
    public void testEnqueOverflow()
    {
      
        int orgSize = queue.getSize();    
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        queue.enque(50);

        
        assertEquals(5,queue.getSize());
        assertEquals(false,queue.isEmpty());
        assertEquals(true,queue.isFull());
        
        assertEquals(10,queue.deque());
        assertEquals(20,queue.deque());
        assertEquals(30,queue.deque());
        assertEquals(40,queue.deque());
        assertEquals(50,queue.deque());
        
        queue.enque(10);
        //assertEquals(5,queue.getSize());
        //assertEquals(10,queue.deque());
    }
     @Test
    public void testDequeUnderflow()
    {
      
        int orgSize = queue.getSize();    
        for (int i = 0; i < 5; i++) {
            queue.enque(i);//0
        }
        
        assertEquals(5,queue.getSize());
        assertEquals(false,queue.isEmpty());
        
        for (int i = 0; i < 5; i++) {
            assertEquals(i,queue.deque());
        }
        RuntimeException excep = Assertions.assertThrows(RuntimeException.class,()->{
            int element = queue.deque();
        });
       
    }
     @Test
    public void testPeek()
    {   
        queue.enque(10);
        
        int element = queue.peek();
        
        assertEquals(1,queue.getSize());
        assertEquals(element,10);
        
        
        assertEquals(false,queue.isEmpty());
        
    }
}
