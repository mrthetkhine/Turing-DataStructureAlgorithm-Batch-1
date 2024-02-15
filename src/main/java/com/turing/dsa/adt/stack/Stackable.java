/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.dsa.adt.stack;

/**
 *
 * @author macbook
 */
public interface Stackable {
    void push(int a);
    int pop();
    int peek();
    int getSize();
    boolean isFull();
    boolean isEmpty();
}
