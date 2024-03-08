/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.linkedlist.doublylinkedlist;

import com.turing.dsa.adt.linkedlist.LinkedListImpl;
import com.turing.dsa.adt.linkedlist.Node;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 * @author macbook
 */
public class DoublyLinkedList implements Iterable<DoublyNode>{
    DoublyNode first;
    DoublyNode last;
    
    public boolean isEmpty()
    {
        return first == null;
    }
    public void insertFirst(DoublyNode node)
    {
        if(this.isEmpty())
        {
            first = node;
            last = node;
        }
        else
        {
            node.next = first;
            first.previous = node;
            first = node;
        }
    }
    public void insertLast(DoublyNode node)
    {
        if(this.isEmpty())
        {
            first = node;
            last = node;
        }
        else
        {
           last.next = node;
           node.previous = last;
           last = node;
        }
    }
    public void insertAfter(DoublyNode existingNode, DoublyNode newNode)
    {
        if(existingNode == last)
        {
            this.insertLast(newNode);
        }
        else //other case
        {
            if(existingNode.next != null)
            {
                existingNode.next.previous = newNode;
            }
            
            newNode.previous = existingNode;
            newNode.next = existingNode.next;
            existingNode.next = newNode;
        }
    }
    public DoublyNode getFirst()
    {
        return this.first;
    }
    public DoublyNode getLast()
    {
        return this.last;
    }
    @Override
    public Iterator<DoublyNode> iterator() {
        return new DoublyLinkedList.LinkedListIterator();
    }
   
    public Iterator<DoublyNode> reverseIterator() {
        return new DoublyLinkedList.LinkedListReverseIterator();
    }
    class LinkedListIterator implements Iterator<DoublyNode>
    {

        DoublyNode current;
        public LinkedListIterator() {
            current = first;
        }
        

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public DoublyNode next() {
            if(current!=null)
            {
                DoublyNode temp =current;
                current = temp.next;
                return temp;
            }
            else
            {
                return null;
            }
           
        }
        
    }
    class LinkedListReverseIterator implements Iterator<DoublyNode>
    {

        DoublyNode current;
        public LinkedListReverseIterator() {
            current = last;
        }
        

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public DoublyNode next() {
            if(current!=null)
            {
                DoublyNode temp =current;
                current = temp.previous;
                return temp;
            }
            else
            {
                return null;
            }
           
        }
        
    }
    @Override
    public void forEach(Consumer<? super DoublyNode> action) {
        Iterable.super.forEach(action); 
    }

    @Override
    public Spliterator<DoublyNode> spliterator() {
        return Iterable.super.spliterator(); 
    }
    
}
