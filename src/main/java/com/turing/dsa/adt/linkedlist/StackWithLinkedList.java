/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.linkedlist;

import com.turing.dsa.adt.stack.StackUnderflowException;

/**
 *
 * @author macbook
 */
public class StackWithLinkedList extends LinkedListImpl{
    
    public void push(int value)
    {
        Node node = new Node(value);
        super.insertLast(node);
    }
    public int pop()
    {
        Node last = super.getLast();
        if(last ==null)
        {
             throw new StackUnderflowException("Stack is empty");
        }
        else
        {
            super.delete(last);//O(n)
            return last.value;
        }
        
    }
    
}
