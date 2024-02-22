/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.dsa.adt.queue;

/**
 *
 * @author macbook
 */
public interface Queue {
    void enque(int item);
    int deque();
    int peek();
    boolean isFull();
    boolean isEmpty();
    int getSize();
}
