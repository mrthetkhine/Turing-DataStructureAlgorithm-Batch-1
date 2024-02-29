/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.linkedlist;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 * @author macbook
 */
public class LinkedListImpl implements LinkedList, Iterable<Node>{
    Node first;
    Node last;
    
    
    @Override
    public void insert(Node node) {
       
        if(first ==null)
        {
            first = node;
        }
        //not first element
        if(last != null)
        {
            last.next= node;
        }
        last = node;
    }

    @Override
    public void showAll() {
        Node currentNode = first;
        while(currentNode != null)
        {
            System.out.println("Item "+currentNode.value);
            currentNode = currentNode.next;
        }
    }

    @Override
    public Iterator<Node> iterator() {
        return new LinkedListIterator();
    }
    class LinkedListIterator implements Iterator<Node>
    {

        Node current;
        public LinkedListIterator() {
            current = first;
        }
        

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Node next() {
            if(current!=null)
            {
                Node temp =current;
                current = temp.next;
                return temp;
            }
            else
            {
                return null;
            }
           
        }
        
    }

    @Override
    public void forEach(Consumer<? super Node> action) {
        Iterable.super.forEach(action); 
    }

    @Override
    public Spliterator<Node> spliterator() {
        return Iterable.super.spliterator(); 
    }
    
}
