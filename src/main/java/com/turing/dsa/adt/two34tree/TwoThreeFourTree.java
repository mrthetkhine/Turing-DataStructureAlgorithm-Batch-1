/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.two34tree;

import com.turing.dsa.recursion.tree.TreeNode;
import java.util.ArrayList;

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
    public TwoThreeFourTree()
    {
    }
    public TwoThreeFourTree(Node<T> root)
    {
        this.root = root;
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
    
    public T search(Number value)
    {
        if(root == null)
        {
            return null;
        }
        else
        {
            Node<T> current = this.root;
            while(current != null)
            {
                Number[]keys = current.keys;
                int keyIndex =0;
                for (int i = 0; i < keys.length; i++) {
                    
                    if(keys[i] ==null)
                    {
                        keyIndex = i-1;
                        break;
                    }
                    else if( keys[i].doubleValue()> value.doubleValue())
                    {
                        keyIndex = i;
                        break;
                    }
                    else if(keys[i] !=null && keys[i].doubleValue()== value.doubleValue())
                    {
                        System.out.println("Found at index "+i + " current "+current);
                        return (T)value;
                    }
                }
               
                if(!current.isLeaf())
                {
                    System.out.println("Here "+value +" KeyIndex "+keyIndex);
                    Number nodeValue= keys[keyIndex];
                    ArrayList<Node<T>> children = current.getChildren();
                    if(nodeValue.doubleValue()>value.doubleValue())
                    {
                        current = children.get(keyIndex);
                        System.out.println("Search deep less than case "+current);
                    }
                    else
                    {
                        current = children.get(keyIndex+1);
                        System.out.println("Search deep greater than case"+current);
                    }
                    
                }
                else
                {
                    current = null;
                }
            }
            return null;
        }
    }
    public Node<T> searchLeafToInsert(Number value)
    {
        if(root == null)
        {
            root = new Node<T>();
            return root;
        }
        else
        {
            Node<T> current = this.root;
            while(current != null)
            {
                Number[]keys = current.keys;
                int keyIndex =0;
                for (int i = 0; i < keys.length; i++) {
                    
                    if(keys[i] ==null)
                    {
                        keyIndex = i-1;
                        break;
                    }
                    else if( keys[i].doubleValue()> value.doubleValue())
                    {
                        keyIndex = i;
                        break;
                    }
                    else if(keys[i] !=null && keys[i].doubleValue()== value.doubleValue())
                    {
                        System.out.println("Found at index "+i + " current "+current);
                        return current;
                    }
                }
               
                if(!current.isLeaf())
                {
                    System.out.println("Here "+value +" KeyIndex "+keyIndex);
                    Number nodeValue= keys[keyIndex];
                    ArrayList<Node<T>> children = current.getChildren();
                    if(nodeValue.doubleValue()>value.doubleValue())
                    {
                        current = children.get(keyIndex);
                        System.out.println("Search deep less than case "+current);
                    }
                    else
                    {
                        current = children.get(keyIndex+1);
                        System.out.println("Search deep greater than case"+current);
                    }
                    
                }
                else
                {
                   return current;
                }
            }
            return current;
        }
    }
}
