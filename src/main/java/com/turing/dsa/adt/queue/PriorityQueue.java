/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.queue;

/**
 *
 * @author macbook
 */
public class PriorityQueue extends CircularQueue{
    public PriorityQueue(int maxSize)
    {
        super(maxSize);
    }
    @Override
    public void enque(int item) {
        if(!this.isFull())//
        {
            super.enque(item);
            //sort
            System.out.println("Item "+item);
            if(this.noOfItem>1)
            {
                System.out.println("Sort rear "+rear + " ==>"+this);
                int index = rear;
                while( index >=1 && (this.items[index]> this.items[index-1]))
                {
                    System.out.println("Swap");
                    int temp = this.items[index-1];
                    this.items[index-1] =this.items[index];
                    this.items[index] = temp;
                    index--;
                }
            }
        }
        System.out.println("Queue-> "+this);
    }            
}
