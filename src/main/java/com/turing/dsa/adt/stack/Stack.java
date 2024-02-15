/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.stack;

/**
 *
 * @author macbook
 */

public class Stack implements Stackable{
    private int size;
    private int[] items;
    private int top = -1;
    public Stack(int size)
    {
        this.size = size;
        this.items = new int[size];
    }
    public boolean isFull()
    {
        return top== size -1;
    }
    @Override
    public void push(int element)
    {
        if(!this.isFull())
        {
            this.items[++this.top] = element;
        }
        else
        {
            throw new StackOverflowException("Stack is full");
        }
       
    }
    public int pop()
    {
        if( !isEmpty())
        {
            return this.items[this.top--];
        }
        else
        {
            throw new StackUnderflowException("Stack is empty");
        }
        
    }

    public boolean isEmpty() {
        return top==-1;
    }
    public int peek()
    {
        return this.items[this.top];
    }

    @Override
    public int getSize() {
        return this.top+1;
    }
}
