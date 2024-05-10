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
//MaxHeap
public class MaxHeap {
    ArrayList<Integer> items = new ArrayList<Integer>();
    Node root ; 

    public MaxHeap(Integer[] items) {
        
        this.items = new ArrayList<>(Arrays.asList(items));
        this.buildTree();
    }
    boolean isLeft(int number)
    {
        return number %2!=0;
    }
    public ArrayList<Integer> getItems()
    {
        return this.items;
    }
    public void buildTree()
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
    public void insert(int value)
    {
        this.items.add(value);
        this.heapify();
        this.buildTree();
    }
    public void delete(int value)
    {
        this.items.remove(Integer.valueOf(value));
        this.heapify();
        this.buildTree();
    }
    void heapfiy(int index)
    {
        System.out.println("Heapify index "+index);
        //n -array size
        //array
        int largest = index;
        int left = 2*index+1;
        int right = 2*index+2;
        
        if( left < this.items.size() && this.items.get(index)< this.items.get(left))
        {
            //System.out.println("Left is bigger");
            largest = left;
        }
        if(right <this.items.size() && this.items.get(largest) < this.items.get(right))
        {
            //System.out.println("Right is bigger");
            largest = right;
        }
        System.out.println("Heapify largest "+largest);
        if(largest !=index)
        {
            
            //swap
            Integer temp = this.items.get(index);
            this.items.set(index, this.items.get(largest));
            this.items.set(largest, temp);
            this.heapfiy(largest);
        }
    }
    public void heapify()
    {
        int n = this.items.size();
        for (int i = n/2-1; i >=0; i--) {
            this.heapfiy(i);
        }
    }
    public int deque()
    {
        int root = this.items.get(0);
        this.delete(root);
        return root;
    }
}
