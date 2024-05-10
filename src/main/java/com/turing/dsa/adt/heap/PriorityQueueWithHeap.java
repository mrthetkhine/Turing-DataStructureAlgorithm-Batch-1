/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.heap;

/**
 *
 * @author macbook
 */
public class PriorityQueueWithHeap {
    MaxHeap heap;
    
    public PriorityQueueWithHeap()
    {
        Integer[] empty ={};
        heap = new MaxHeap(empty);
    }
    public void enque(int value)
    {
        this.heap.insert(value);
    }
    public int deque()
    {
        return this.heap.deque();
    }
}
