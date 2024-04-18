/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.binarytree;

import java.util.Iterator;

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

    public void delete(int value) {
        Node current = this.root;
        Node parent = this.root;
        boolean isLeftChild = true;
        
        while(current.value != value)
        {
            parent = current;
            if(value < current.value)
            {
                current = current.left;
                isLeftChild = true;
            }
            else
            {
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current.isLeaf())
        {
            System.out.println("Leaf delete code");
            if(isLeftChild)
            {
                parent.left = null;
            }
            else
            {
                parent.right = null;
            }
        }
        //Left only child
        else if( current.haveOnlyLeftChild())
        {
            System.out.println("Leftchild only");
            if(isLeftChild)
            {
                parent.left = current.left;
            }
            else
            {
                parent.right = current.left;
            }
        }
        //right only child
        else if( current.haveOnlyRightChild())
        {
            System.out.println("RightChild only");
            if(isLeftChild)
            {
                parent.left = current.right;
            }
            else
            {
                parent.right = current.right;
            }
        }
        //have both child
        else if( current.haveBothChild())
        {
            System.out.println("Both child");
            Node inOrderSuccessor = this.getInOrderSuccessor(value);
            int temp = inOrderSuccessor.value;
            this.delete(inOrderSuccessor.value);
            current.value = temp;
        }
            
    }
    public Node getInOrderSuccessor(int value)
    {
        InOrderTraversal traversal = new InOrderTraversal(this);
        Iterator<Node> iterator = traversal.iterator();
        Node current = iterator.next();
        Node next;
        while( iterator.hasNext())
        {
            next = iterator.next();
            if(current.getValue() == value)
            {
                return next;
            }
            current = next;
        }
        return null;
    }
}
