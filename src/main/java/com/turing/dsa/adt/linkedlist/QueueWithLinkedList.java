/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.linkedlist;

/**
 *
 * @author macbook
 */
public class QueueWithLinkedList  extends LinkedListImpl{
    public void enque(int item)
    {
        Node node = new Node(item);
        super.insertLast(node);
    }
    public int deque()
    {
        Node node = super.getFirst();
        if(node !=null)
        {
            int value = node.value;
            super.deleteFirst();
            return value;
        }
        else
        {
            throw new RuntimeException("Queue underflow");
        }
    }
}
