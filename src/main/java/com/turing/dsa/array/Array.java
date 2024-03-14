/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.array;

/**
 *
 * @author macbook
 */
public class Array {
    int size;
    protected int[] items;
    
    public Array(int arr[])
    {
        this.items = arr;
    }
    Array(int size)
    {
        this.items = new int[size];
    }
    void put(int index,int value)
    {
        this.items[index] = value;
    }
    int get(int index)
    {
        return this.items[index];
    }
    public static void main(String[] args) {
        Array arr = new Array(5);
        arr.items[4] = 30;
        arr.items[5] = 10;
    }
}
