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
    
    public Node<T> getRoot()
    {
        return root;
    }
    public void insert(T value)
    {
        if(root == null)
        {
            Node<T> node = new Node<T>();
            node.insertKey(value);
            this.root = node;
        }
        else
        {
            Node current = this.root;
            //Search 
            if(current.isLeaf() && (! current.isFourNode()))
            {
                current.insertKey(value);
            }
        }
    }
}
