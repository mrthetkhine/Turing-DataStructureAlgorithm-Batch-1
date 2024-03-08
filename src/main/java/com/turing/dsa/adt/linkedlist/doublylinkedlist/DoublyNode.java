/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.linkedlist.doublylinkedlist;

/**
 *
 * @author macbook
 */
public class DoublyNode {
    int value;
    DoublyNode next;
    DoublyNode previous;
    public DoublyNode(int value)
    {
        this.value = value;
    }
    public String toString()
    {
        return "[Node - "+this.value+"]";
    }
    
    public DoublyNode getNext()
    {
        return this.next;
    }
    public DoublyNode getPrevious()
    {
        return this.previous;
    }
    
}
