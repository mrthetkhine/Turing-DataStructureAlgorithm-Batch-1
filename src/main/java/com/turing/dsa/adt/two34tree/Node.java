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
    int noOfNode = 1;//2,3 or 4
    
    public Node()
    {
        this.keys =(T[]) new Number[ORDER-1];
        this.children = new ArrayList<>();
    }
    public Node<T> getParent()
    {
        return this.parent;
    }
    public ArrayList<Node<T>> getChildren()
    {
        return this.children;
    }
    public int insertKey(T value)
    {
        this.noOfNode ++;
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
        return posToInsert;
    }
    public void setParent(Node<T> parent)
    {
        this.parent= parent;
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
    public Node<T> split(Node<T> node)
    {
        System.out.println("Split->>> "+node);
        if(! node.isFourNode())
        {
            return node;
        }
        else
        {
            if(node.getParent()==null)
            {
                System.out.println("No parent case");
                //Split 4 node->(3 key)
                return this.splitWhenNoParent(node);
            }
            else
            {
                return splitNodeWithParent(node);
            }
            
        }
    }

    Node<T> splitNodeWithParent(Node<T> node) {
        System.out.println("case with parent node "+node);
        
        Node<T> parent = node.getParent();//parent with 2,3 node ok but not 4 node
        if(parent.isFourNode())
        {
            //split parent
            System.out.println("SPLIT Parent=====");
            Node<T> recuParent =  parent.split(parent);
            
            return recuParent;
        }
        else
        {
            Number middle = node.keys[1];
        
            int parentInsertPos= parent.insertKey((T)middle);
            parent.children.remove(parentInsertPos);

            System.out.println("Inserted at "+parentInsertPos);
            Node<T> childOne= new Node<T>();
            childOne.insertKey((T)node.keys[0]);
            childOne.setParent(parent);

            Node<T> childTwo = new Node<T>();
            childTwo.insertKey((T)node.keys[2]);
            childTwo.setParent(parent);

            parent.getChildren().add(parentInsertPos, childTwo);
            parent.getChildren().add(parentInsertPos, childOne);
            return parent;
        }
        
    }
    Node<T> splitWhenNoParent(Node<T> node)
    {
        Number middle = node.keys[1];
        Node<T> parent = new Node<T>();
        parent.insertKey((T)middle);

        Node<T> childOne= new Node<T>();
        childOne.insertKey((T)node.keys[0]);
        childOne.setParent(parent);
        
        Node<T> childTwo = new Node<T>();
        childTwo.insertKey((T)node.keys[2]);
        childTwo.setParent(parent);
        
        parent.children.add(childOne);
        parent.children.add(childTwo);

        node = null;
        return parent;
    }
    public String toString()
    {
        String str = "";
        for(int i=0;i< this.keys.length;i++)
        {
            str+= " "+this.keys[i];
        }
        return str;
    }
    public static void main(String[] args) {
        Node<Integer> node= new Node<Integer>();
        node.keys[0] = 5;
        
        node.insertKey(10);
    }
    
}
