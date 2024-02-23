/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.queue;

/**
 *
 * @author macbook
 */
public class ArrayBasedQueue implements Queue{

    protected int maxSize;
    protected int[]items;
    protected int front; 
    protected int rear;
    protected int noOfItem;
    
    public ArrayBasedQueue(int maxSize)
    {
        this.maxSize =maxSize;
        this.items = new int[maxSize];
        this.front = -1;
        this.rear = -1;
        this.noOfItem =0;
    }
    //insert
    @Override
    public void enque(int item) {
       if(this.rear <this.maxSize-1)
       {
            this.items[++this.rear] = item;
            this.noOfItem++;
       }
       
    }

    //take
    @Override
    public int deque() {
        if(this.front<this.maxSize-1)
        {
            this.noOfItem--;
            return this.items[++this.front];
        }
        else 
        {
            throw new RuntimeException("Queue underflow");
        }
       
    }

    @Override
    public int peek() {
        if(!this.isEmpty())
        {
            return this.items[this.front+1];
        }
        else 
        {
            throw new RuntimeException("Queue underflow");
        }
    }

    @Override
    public boolean isFull() {
        return this.noOfItem == this.maxSize;
    }

    @Override
    public boolean isEmpty() {
        return this.noOfItem==0;
    }

    @Override
    public int getSize() {
        return this.noOfItem;
    }
    
    @Override
    public String toString()
    {
        String data ="";
        for(int item:this.items )
        {
            data+= item + " , ";
        }
        return data;
    }
}
