/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.queue;

/**
 *
 * @author macbook
 */
public class CircularQueue extends ArrayBasedQueue{
    public CircularQueue(int maxSize)
    {
        super(maxSize);
    }
    //insert
    @Override
    public void enque(int item) {
       if(!this.isFull())//
       {
            this.rear = ( this.rear+1 )%this.maxSize;
            this.items[this.rear] = item;
            this.noOfItem++;
       }
       
    }

    //take
    @Override
    public int deque() {
        if(!this.isEmpty())
        {
            this.front = ( this.front+1 )%this.maxSize;
            this.noOfItem--;
            return this.items[this.front];
        }
        else 
        {
            throw new RuntimeException("Queue underflow");
        }
       
    }
}
