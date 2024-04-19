/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.hashtable.linkedlist;

import com.turing.dsa.adt.linkedlist.*;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 * @author macbook
 */
public class LinkedListImpl<T> implements LinkedList<T>, Iterable<Node<T>>{
    Node<T> first;
    Node<T> last;
    
    
    //insert last
    @Override
    public void insertLast(Node<T> node) {
       
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
    public void insertFirst(Node<T> node)
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
        Node<T> currentNode = first;
        while(currentNode != null)
        {
            System.out.println("Item "+currentNode.value);
            currentNode = currentNode.next;
        }
    }

    @Override
    public Iterator<Node<T>> iterator() {
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
    public void delete(Node<T> node) {
        
        if(!this.isEmpty())
        {
            if(first == node)//found at first node
            {
                first = first.next;
                node.next = null;
            }
            else
            {
                Node<T> previous = first;
                Node<T> current = previous.next;
                
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
    public Node<T> getLast()
    {
        return last;
    }
    public Node<T> getFirst()
    {
        return first;
    }

    @Override
    public void insertLast(T item) {
        Node<T> node = new Node<>(item);
        this.insertLast(node);
    }

    @Override
    public void insertFirst(T item) {
        Node<T> node = new Node<>(item);
        this.insertFirst(node);
    }

    @Override
    public boolean isItemExist(T item) {
        Node<T> currentNode = first;
        while(currentNode != null)
        {
            //System.out.println("Item "+currentNode.value);
            if(currentNode.value.equals(item))
            {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    
    class LinkedListIterator<T> implements Iterator<Node<T>>
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
        public Node<T> next() {
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

    
}
