/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.hashtable.linkedlist;

import java.util.Iterator;

/**
 *
 * @author macbook
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedListImpl<String> linkedList = new LinkedListImpl<>();
        
        linkedList.insertFirst("Hi");
        linkedList.insertFirst("Hello");
       
        Iterator<Node<String>> iterator = linkedList.iterator();
        
        while(iterator.hasNext())
        {
            System.out.println("Next "+iterator.next().value);
        }
        LinkedListImpl<Integer> linkedList2 = new LinkedListImpl<>();
        
        linkedList2.insertFirst(100);
        linkedList2.insertFirst(200);
       
        Iterator<Node<Integer>> iterator2= linkedList2.iterator();
        
        while(iterator2.hasNext())
        {
            System.out.println("Next "+iterator2.next().value);
        }
    }
}
