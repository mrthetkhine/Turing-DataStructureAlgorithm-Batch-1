/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.binarytree;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author macbook
 */
public class PostOrderTraversal implements Iterable<Node>{

    Tree tree;
    public PostOrderTraversal(Tree tree)
    {
        this.tree = tree;
    }
    @Override
    public Iterator<Node> iterator() {
        return new TreeIterator();
    }
    class TreeIterator implements Iterator<Node>
    {

        Node current;
        ArrayList<Node> items;
        int index = 0;
        public TreeIterator() {
            current = tree.root;
            this.items = new ArrayList<Node>();
            this.postOrderTraversal(this.current);
        }
        //lRr

        void postOrderTraversal(Node current)
        {
            if(current ==null)
            {
                return;
            }
            //lrR
            
            //left
            if(current.left != null)
            {
                this.postOrderTraversal(current.left);
            }
             //Right
            if(current.right!=null){
                this.postOrderTraversal(current.right);
            }
            //Root
            this.items.add(current);
           
            
        }
        @Override
        public boolean hasNext() {
            return index < this.items.size();
        }

        @Override
        public Node next() {
            return this.items.get(this.index++);
           
        }
        
    }
}
