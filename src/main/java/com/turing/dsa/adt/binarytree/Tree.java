/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.binarytree;

/**
 *
 * @author macbook
 */
public class Tree {
    Node root;
    
    public Tree()
    {
    }
    public Tree(Node root)
    {
        this.root = root;
    }
    public void insert(int value)
    {
        Node newNode = new Node(value);
        this.insert(newNode);
    }
    public void insert(Node newNode)
    {
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            Node current = root;
            Node parent ;
            
            
            while(true)
            {
                parent = current;
                if( newNode.value < current.value)//Go left
                {
                    current = current.left;
                    if(current == null)
                    {
                        parent.left = newNode;
                        return;
                    }
                }
                else
                {
                    current = current.right;
                    if(current ==null)
                    {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public Node search(int value)
    {
        Node current = root;
        while(current !=null)
        {
            System.out.println("Step");
            if(current.value == value)
            {
                return current;
            }
            if(value < current.value)
            {
                current = current.left;
            }
            else
            {
                current = current.right;
            }
        }
        return null;
    }
}
