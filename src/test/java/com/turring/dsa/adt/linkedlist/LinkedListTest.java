/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.linkedlist;

import com.turing.dsa.adt.linkedlist.LinkedList;
import com.turing.dsa.adt.linkedlist.LinkedListImpl;
import com.turing.dsa.adt.linkedlist.Node;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class LinkedListTest {
    @Test
    public void testLinkedList()
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        
        LinkedListImpl list = new LinkedListImpl();
        list.insert(first);
        list.insert(second);
        list.insert(third);
        
        //list.showAll();
        Iterator<Node> iterator = list.iterator();
        
        assertEquals(first,iterator.next());
        assertEquals(second,iterator.next());
        assertEquals(third,iterator.next());
        
        assertEquals(false,iterator.hasNext());
        
        //list.forEach(item->System.out.println(item));
        /*
        while(iterator.hasNext())
        {
            System.out.println("Item "+iterator.next());
        }
        */
    }
    
}
