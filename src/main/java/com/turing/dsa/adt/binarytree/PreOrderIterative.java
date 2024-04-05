/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.binarytree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author macbook
 */
public class PreOrderIterative 
{
    Tree tree;
    public PreOrderIterative(Tree tree)
    {
        this.tree = tree;
    }
    void traverse()
    {
        Node current = this.tree.root;
        if(current ==null)
        {
            return;
        }
        else
        {
            Stack<Node> stack = new Stack<>();
            while( stack.empty()==false || current != null)
            {
                //Root
                if(current != null)
                {
                    System.out.println("Node "+current.getValue());
                    stack.push(current);
                    current = current.left;
                }
                else
                {
                    //root
                    Node node = stack.pop();
                    current = node.right;
                }
            }
        }
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        tree.insert(10);
     
        tree.insert(8);
        tree.insert(5);
        tree.insert(9);
        tree.insert(25);
        tree.insert(20);
        tree.insert(30);
        
        PreOrderIterative traversal = new PreOrderIterative(tree);
        traversal.traverse();
        
    }
}
