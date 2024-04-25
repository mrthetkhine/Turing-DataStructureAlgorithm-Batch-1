/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.two34tree;

/**
 *
 * @author macbook
 */
public class TwoThreeFourTree<T extends Number> {
    Node<T> root;
    
    void insert(T value)
    {
        if(root == null)
        {
            Node<T> node = new Node<T>(2);
            node.keys[0] = value;
            this.root = node;
        }
        else
        {
            Node current = this.root;
            //Search 
            if(current.isLeaf() && (! current.isFourNode()))
            {
            }
        }
    }
}
