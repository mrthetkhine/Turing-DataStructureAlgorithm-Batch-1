/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.linkedlist.doublylinkedlist;

import com.turing.dsa.adt.linkedlist.doublylinkedlist.DoublyLinkedList;
import com.turing.dsa.adt.linkedlist.doublylinkedlist.DoublyNode;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class DoublyLinkedListTest {
    @Test
    public void testInsertFirstEmpty()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode node = new DoublyNode(10);
        
        list.insertFirst(node);
        
        assertEquals(false, list.isEmpty());
        assertEquals(node, list.getFirst());
        assertEquals(node, list.getLast());
        
    }
    @Test
    public void testInsertFirstNonEmptyCase()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode first = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        
        list.insertFirst(first);
        list.insertFirst(second);
        
        //[second,first]
        Iterator<DoublyNode> iterator = list.iterator();
        
        DoublyNode element1 = iterator.next();
        assertEquals(second,element1);
        
        DoublyNode element2 = iterator.next();
        assertEquals(first,element2);
        
        assertTrue(element1.getNext() == element2);
        assertTrue(element2.getPrevious() == element1);
        
        assertTrue(list.getFirst() == second);
        assertTrue(list.getLast() == first);
        
        assertEquals(false, iterator.hasNext());
       
        
    }
    @Test
    public void testInsertFirstNonEmptyCaseThreeNode()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode first = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode third = new DoublyNode(30);
        
        list.insertFirst(first);
        list.insertFirst(second);
        list.insertFirst(third);
        
        //[third,second,first]
        Iterator<DoublyNode> iterator = list.iterator();
        
        DoublyNode element1 = iterator.next();
        assertEquals(third,element1);
        
        DoublyNode element2 = iterator.next();
        assertEquals(second,element2);
        
        DoublyNode element3 = iterator.next();
        assertEquals(first,element3);
        
        assertTrue(third.getNext() == second);
        assertTrue(second.getNext() == first);
        assertTrue(first.getPrevious() == second);
        assertTrue(second.getPrevious() == third);
        
        assertTrue(list.getFirst() == third);
        assertTrue(list.getLast() == first);
        assertEquals(false, iterator.hasNext());
       
        
    }
    @Test
    public void testReverseOrder()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode first = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode third = new DoublyNode(30);
        
        list.insertFirst(first);
        list.insertFirst(second);
        list.insertFirst(third);
        
        //[third,second,first]
        Iterator<DoublyNode> iterator = list.reverseIterator();
        
        DoublyNode element1 = iterator.next();
        assertEquals(first,element1);
        
        DoublyNode element2 = iterator.next();
        assertEquals(second,element2);
        
        DoublyNode element3 = iterator.next();
        assertEquals(third,element3);
        
        assertEquals(false, iterator.hasNext());
        
       
        
    }
    @Test
    public void testInsertLastEmpty()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode node = new DoublyNode(10);
        
        list.insertLast(node);
        
        assertEquals(false, list.isEmpty());
        assertEquals(node, list.getFirst());
        assertEquals(node, list.getLast());
        
    }
    @Test
    public void testInsertLastNonEmptyCaseThreeNode()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode first = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode third = new DoublyNode(30);
        
        list.insertLast(first);
        list.insertLast(second);
        list.insertLast(third);
        
        //[first,second,third]
        Iterator<DoublyNode> iterator = list.iterator();
        
        DoublyNode element1 = iterator.next();
        assertEquals(first,element1);
        
        DoublyNode element2 = iterator.next();
        assertEquals(second,element2);
        
        DoublyNode element3 = iterator.next();
        assertEquals(third,element3);
        
        assertTrue(first.getNext() == second);
        assertTrue(second.getNext() == third);
        assertTrue(third.getPrevious() == second);
        assertTrue(second.getPrevious() == first);
        
        assertTrue(list.getFirst() == first);
        assertTrue(list.getLast() == third);
        assertEquals(false, iterator.hasNext());
       
        
    }
    @Test
    public void testInsertLastNonEmptyCaseManyNode()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode[] nodes = new DoublyNode[10];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new DoublyNode(i);
            list.insertLast(nodes[i]);
        }
        Iterator<DoublyNode> iterator = list.iterator();
        for (int i = 0; i < nodes.length; i++) {
            DoublyNode node = nodes[i];
            assertEquals(node,iterator.next());
        }
        //Check previous & next
        for (int i = 1; i < nodes.length; i++) {
            DoublyNode previousNode = nodes[i-1];
            DoublyNode nextNode = nodes[i];
            assertEquals(previousNode.getNext(),nextNode);
            assertEquals(nextNode.getPrevious(),previousNode);
        }
        assertEquals(list.getFirst(),nodes[0]);
        assertEquals(list.getLast(),nodes[9]);
    }
    @Test
    public void testInsertAfterSingleItem()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode first = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        
        list.insertFirst(first);
        list.insertAfter(first, second);
        //[first,second]
        Iterator<DoublyNode> iterator = list.iterator();
        assertEquals(first,iterator.next());
        assertEquals(second,iterator.next());
        
        assertEquals(list.getFirst(),first);
        assertEquals(list.getLast(),second);
    }
     @Test
    public void testInsertAfterManyItem()
    {
        DoublyLinkedList list= new DoublyLinkedList();
        DoublyNode first = new DoublyNode(10);
        DoublyNode second = new DoublyNode(20);
        DoublyNode third = new DoublyNode(30);
        DoublyNode fourth = new DoublyNode(30);
        
        list.insertFirst(first);
        list.insertLast( second);
        list.insertAfter(first, third);
        list.insertAfter(third, fourth);
        //[first,third,fourth,second]
        Iterator<DoublyNode> iterator = list.iterator();
        assertEquals(first,iterator.next());
        assertEquals(third,iterator.next());
        assertEquals(fourth,iterator.next());
        assertEquals(second,iterator.next());
        
        assertEquals(first.getNext(),third);
        assertEquals(third.getNext(),fourth);
        assertEquals(fourth.getNext(),second);
        
        assertEquals(second.getPrevious(),fourth);
        assertEquals(fourth.getPrevious(),third);
        assertEquals(third.getPrevious(),first);
        
        assertEquals(list.getFirst(),first);
        assertEquals(list.getLast(),second);
    }
}
