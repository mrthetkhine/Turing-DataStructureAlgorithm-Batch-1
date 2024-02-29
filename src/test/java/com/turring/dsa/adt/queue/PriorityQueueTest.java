/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.queue;

import com.turing.dsa.adt.queue.PriorityQueue;
import com.turing.dsa.adt.queue.Queue;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class PriorityQueueTest {
    Queue queue = new PriorityQueue(5);
    Random random = new Random();
    /*
    @Test
    public void testBaseCase()
    {
        queue.enque(10);
        
        assertEquals(1,queue.getSize());
        assertEquals(false,queue.isEmpty());
        
        int element = queue.deque();
        assertEquals(10,element);
        
    }
    */
    /*
    @Test
    public void testPriorityQueue()
    {
        for (int i = 0; i < 5; i++) {
            int ran = random.nextInt(10);
            System.out.println("Push "+ran);
            queue.enque(ran);
        }
        int first = queue.deque();
        
        for (int i = 1; i < 5; i++) {
            int second = queue.deque();
            System.out.println("First "+first+ " second "+second);
            assertEquals(true, first >= second);
            first = second;
        }
    }*/
    /*
    @Test
    public void testPriorityMany()
    {
        queue.enque(5);
        queue.enque(10);
        queue.enque(3);
        queue.enque(8);
        queue.enque(25);
        
        int first = queue.deque();
        
        for (int i = 1; i < 5; i++) {
            int second = queue.deque();
            System.out.println("First "+first+ " second "+second);
            assertEquals(true, first >= second);
            first = second;
        }
    }
*/
    @Test
    public void testPriorityCircularMany()
    {
        queue.enque(5);
        queue.enque(10);
        queue.enque(3);
        queue.enque(8);
        queue.enque(25);
        
        int first = queue.deque();
        
        for (int i = 1; i <4; i++) {
            int second = queue.deque();
            System.out.println("First "+first+ " second "+second);
            assertEquals(true, first >= second);
            first = second;
        }
        //3
        queue.enque(100);
        queue.enque(115);
        queue.enque(5);
        queue.enque(200);
        
        
        assertEquals(200,queue.deque());
        assertEquals(115,queue.deque());
        assertEquals(100,queue.deque());
        assertEquals(5,queue.deque());
        assertEquals(3,queue.deque());
    }
}
