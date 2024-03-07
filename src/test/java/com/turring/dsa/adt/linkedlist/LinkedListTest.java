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
import static org.junit.jupiter.api.Assertions.assertTrue;
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
        list.insertLast(first);
        list.insertLast(second);
        list.insertLast(third);
        
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
    @Test
    void testInsertFirstEmptyCase()
    {
        Node first = new Node(10);
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);

        Iterator<Node> iterator = list.iterator();
        assertEquals(first,iterator.next());

    }
    @Test
    void testInsertFirstManyCase()
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);
        list.insertFirst(second);
        list.insertFirst(third);

        Iterator<Node> iterator = list.iterator();
        assertEquals(third,iterator.next());
        assertEquals(second,iterator.next());
        assertEquals(first,iterator.next());

    }
    @Test
    void testInsertFirstandLastManyCase()
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);
        list.insertFirst(second);
        list.insertLast(third);
        list.insertLast(fourth);

        Iterator<Node> iterator = list.iterator();
        assertEquals(second,iterator.next());
        assertEquals(first,iterator.next());
        assertEquals(third,iterator.next());
        assertEquals(fourth,iterator.next());

    }
    @Test
    void testDeletetFirst()
    {
        Node first = new Node(10);
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);
        
        list.deleteFirst();
        assertTrue(list.isEmpty());
    }
    @Test
    void testDeleteFirstMany()
    {
        Node first = new Node(10);
        Node second = new Node(20);
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);
        list.insertFirst(second);
        
        list.deleteFirst();//delete second
        Iterator<Node> iterator = list.iterator();
        assertEquals(first,iterator.next());
        assertEquals(false,iterator.hasNext());
    }
   @Test
    void testDeleteNodeFirst()
    {
        Node first = new Node(10);
        Node second = new Node(20);
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);
        list.insertLast(second);
        
        list.delete(first);
        Iterator<Node> iterator = list.iterator();
        assertEquals(second,iterator.next());
        assertEquals(false,iterator.hasNext());
    }
    @Test
    void testDeleteNodeMiddle()
    {
        Node first = new Node(10);
        Node second = new Node(20);
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);
        list.insertLast(second);
        
        list.delete(second);
        Iterator<Node> iterator = list.iterator();
        assertEquals(first,iterator.next());
        assertEquals(false,iterator.hasNext());
    }
    @Test
    void testDeleteNodeMiddleMany()
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);
        list.insertLast(second);
        list.insertLast(third);
        
        list.delete(third);
        Iterator<Node> iterator = list.iterator();
        assertEquals(first,iterator.next());
        assertEquals(second,iterator.next());
        assertEquals(false,iterator.hasNext());
    }
    @Test
    void testDeleteNodeMiddleItem()
    {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        LinkedListImpl list = new LinkedListImpl();
        list.insertFirst(first);
        list.insertLast(second);
        list.insertLast(third);
        
        list.delete(second);
        Iterator<Node> iterator = list.iterator();
        assertEquals(first,iterator.next());
        assertEquals(third,iterator.next());
        assertEquals(false,iterator.hasNext());
    }
}
