/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.two34tree;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class Node<T extends Number> {
    Node<T> parent;
    public Number[] keys ;
    public ArrayList<Node<T>> children;
    
    static int ORDER = 4;
    int noOfNode;//2,3 or 4
    public Node(int noOfNode)
    {
        this.noOfNode = noOfNode;
        this.keys =(T[]) new Number[ORDER-1];
        this.children = new ArrayList<>();
    }
    public void insertKey(T value)
    {
        int posToInsert  = 0;
        for (int i = 0; i < keys.length; i++) {
            if(keys[i]==null || keys[i].doubleValue()>value.doubleValue())
            {
                posToInsert = i;
                break;
            }
        }
        for (int i = keys.length-1; i > posToInsert; i--) {
            keys[i] = keys[i-1];
        }
        keys[posToInsert] = value;
    }
    public int getN_Node()
    {
        return this.noOfNode;
    }
    public boolean isFourNode()
    {
        return this.getN_Node()==4;
    }
    public boolean isLeaf()
    {
        return this.children.size()==0;
    }
    public static void main(String[] args) {
        Node<Integer> node= new Node<Integer>(2);
        node.keys[0] = 5;
        
        node.insertKey(10);
    }
    
}
