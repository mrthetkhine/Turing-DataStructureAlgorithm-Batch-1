/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.two34tree;

import com.turing.dsa.adt.two34tree.Node;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TestNode {
    /*
    @Test
    public void test2Node()
    {
        Node<Integer> node= new Node<Integer>(2);
       
        
        node.children.add(new Node<Integer>(1));
        node.children.add(new Node<Integer>(1));
        
        assertEquals(2,node.getN_Node());
    }
    @Test
    public void test3Node()
    {
        Node<Integer> node= new Node<Integer>(3);
      
        
        node.children.add(new Node<Integer>(1));
        node.children.add(new Node<Integer>(1));
        
        assertEquals(3,node.getN_Node());
    }
    @Test
    public void test4Node()
    {
        Node<Integer> node= new Node<Integer>(4);
      
        
        node.children.add(new Node<Integer>(1));
        node.children.add(new Node<Integer>(1));
        
        assertEquals(4,node.getN_Node());
    }
    @Test
    public void testLeaf()
    {
        Node<Integer> node= new Node<Integer>(4);
        
        assertEquals(true,node.isLeaf());
    }
    @Test
    public void testNonLeaf()
    {
        Node<Integer> node= new Node<Integer>(3);
        node.children.add(new Node<Integer>(2));
        node.children.add(new Node<Integer>(2));
        assertEquals(false,node.isLeaf());
    }
    */
    @Test
    public void testInsertKey()
    {
        Node<Integer> node= new Node<Integer>(2);
        node.keys[0] = 5;
        
        node.insertKey(10);
        
        assertEquals(5,node.keys[0]);
        assertEquals(10,node.keys[1]);
    }
    @Test
    public void testInsertKey2()
    {
        Node<Integer> node= new Node<Integer>(2);
        node.keys[0] = 15;
        
        node.insertKey(10);
        
        assertEquals(10,node.keys[0]);
        assertEquals(15,node.keys[1]);
    }
    @Test
    public void testInsertKey3()
    {
        Node<Integer> node= new Node<Integer>(2);
        node.keys[0] = 150;
        
        node.insertKey(10);
        node.insertKey(200);
        
        assertEquals(10,node.keys[0]);
        assertEquals(150,node.keys[1]);
        assertEquals(200,node.keys[2]);
    }
    @Test
    public void testInsertKey4()
    {
        Node<Integer> node= new Node<Integer>(2);
        node.keys[0] = 150;
        
        node.insertKey(200);
        node.insertKey(300);
        
        assertEquals(150,node.keys[0]);
        assertEquals(200,node.keys[1]);
        assertEquals(300,node.keys[2]);
    }
}
