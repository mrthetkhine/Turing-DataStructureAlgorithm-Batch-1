/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.hashtable.linkedlist;

import com.turing.dsa.adt.linkedlist.*;

/**
 *
 * @author macbook
 */
public class Node<T> {
    T value;
    Node next;
    
    public Node(T value)
    {
        this.value = value;
    }
    public String toString()
    {
        return "[Node - "+this.value+"]";
    }
}
