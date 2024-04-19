/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.dsa.adt.hashtable.linkedlist;

import com.turing.dsa.adt.linkedlist.*;

/**
 *
 * @author macbook
 */
public interface LinkedList<T> {
    void insertLast(Node<T> node);
    void insertFirst(Node<T> node);
    void insertLast(T item);
    void insertFirst(T item);
    void deleteFirst();
    void delete(Node<T> node);
    boolean isEmpty();
    void showAll();
    boolean isItemExist(T item);
}
