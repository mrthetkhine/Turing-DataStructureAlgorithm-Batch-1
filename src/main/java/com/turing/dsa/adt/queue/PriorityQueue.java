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
    int getNextLowerIndex(int index)
    {
        int nextIndex = index -1;
        if(nextIndex < 0)
        {
            nextIndex += this.items.length;
        }
        return nextIndex;
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
                int comparison = 0;
                while(comparison < (this.noOfItem-1) && (this.items[index]> this.items[this.getNextLowerIndex(index)])){
                    System.out.println("Swap");
                    int nextIndex = this.getNextLowerIndex(index);
                    
                    int temp = this.items[nextIndex];
                    this.items[nextIndex] =this.items[index];
                    this.items[index] = temp;
                    
                    index = nextIndex;
                    comparison ++;
                }
               
            }
        }
        System.out.println("Queue-> "+this);
    }            
}
