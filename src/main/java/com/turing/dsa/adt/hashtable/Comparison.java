/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.hashtable;

import java.util.ArrayList;

import java.util.Hashtable;

/**
 *
 * @author macbook
 */
public class Comparison {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        double start = System.currentTimeMillis();
        boolean contains = list.contains(1000000);
        double end = System.currentTimeMillis();
        System.out.println("Time "+ (end-start)+ " ms");
    */
        Hashtable<Integer,Integer> hashTable= new Hashtable<Integer,Integer>();
         for (int i = 0; i < 1000000; i++) {
            hashTable.put(i,i);
        }
        double start = System.currentTimeMillis();
        boolean contains = hashTable.containsKey(1000000);
        double end = System.currentTimeMillis();
        System.out.println("Time "+ (end-start)+ " ms");
    }
}
