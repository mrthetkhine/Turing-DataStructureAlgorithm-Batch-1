/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.dsa.adt.linkedlist;

/**
 *
 * @author macbook
 */
public interface LinkedList {
    void insertLast(Node node);
    void insertFirst(Node node);
    void deleteFirst();
    void delete(Node node);
    boolean isEmpty();
    void showAll();
}
