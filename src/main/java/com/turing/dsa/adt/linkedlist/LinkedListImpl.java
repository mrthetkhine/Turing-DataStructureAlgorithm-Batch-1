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
    
    
    //insert last
    @Override
    public void insertLast(Node node) {
       
        if(first ==null)
        {
            first = node;
            last = node;
        }
        //not first element
        else if(last != null)
        {
            last.next= node;
        }
        last = node;
    }
    
    @Override
    public void insertFirst(Node node)
    {
        if(first == null)
        {
            first = node;
            last = node;
        }
        else
        {
            node.next = first;
            first = node;
        }
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

    @Override
    public boolean isEmpty()
    {
        return this.first ==null;
    }
    @Override
    public void deleteFirst() {
        if(first!=null)
        {
            first = first.next;
            if(first ==null)
            {
                last = null;
            }
        }
    }
    @Override
    public void delete(Node node) {
        
        if(!this.isEmpty())
        {
            if(first == node)//found at first node
            {
                first = first.next;
                node.next = null;
            }
            else
            {
                Node previous = first;
                Node current = previous.next;
                
                while(current != null)
                {
                    if(current ==node)
                    {
                        if(node.next ==null)//last
                        {
                            last = previous;
                        }
                        //delete
                        previous.next = current.next;
                        node.next = null;
                        
                        //update last pointer
                       
                        break;
                    }
                
                    previous = current;
                    current = current.next;
                }
            }
        }
    }
    public Node getLast()
    {
        return last;
    }
    public Node getFirst()
    {
        return first;
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
