/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.graph;

/**
 *
 * @author macbook
 */
public class Vertex {
    String label;
    boolean visited= false;
    int index;
    
    Vertex(String label)
    {
        this.label = label;
    }
}
