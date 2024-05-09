/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.heap;

import com.turing.dsa.adt.binarytree.Node;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class CompleteBinaryTree {
    ArrayList<Integer> items = new ArrayList<Integer>();
    Node root ; 

    public CompleteBinaryTree(Integer[] items) {
        
        this.items = new ArrayList<>(Arrays.asList(items));
        this.buildTree();
    }
    boolean isLeft(int number)
    {
        return number %2!=0;
    }
    void buildTree()
    {
        //node i;
        //left =2i+1;
        //right = 2i+2;
        ArrayList<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            Integer value = items.get(i);
            Node node = new Node(value); 
            nodeList.add(node);
            if( i==0)
            {
                this.root = node;
            }
            else
            {
                if(isLeft(i))
                {
                    //find parent
                    //2*i+1= 
                    //parent index-1/2;
                    int parentIndex = (i-1)/2;
                    Node parent= nodeList.get(parentIndex);
                    parent.setLeft(node);
                }
                else
                {
                    int parentIndex = (i-2)/2;
                    Node parent= nodeList.get(parentIndex);
                    parent.setRight(node);
                }
            }
            
        }
    }
    public Node getRoot()
    {
        return this.root;
    }
    
    
}
