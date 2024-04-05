/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.binarytree;

import com.turing.dsa.adt.binarytree.InOrderTraversal;
import com.turing.dsa.adt.binarytree.Node;
import com.turing.dsa.adt.binarytree.Tree;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class InorderTest {
    @Test
    public void testInOrderBaseCase()
    {
        Node node10 = new Node(10);
        Node node13 = new Node(13);
        Node node15 = new Node(15);
        
        node10.setLeft(node13);
        node10.setRight(node15);
        
        Tree tree =new Tree(node10);
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(node13,iterator.next());
        assertEquals(node10,iterator.next());
        assertEquals(node15,iterator.next());
    }
    @Test
    public void testInOrderBaseCase0()
    {
        Node node10 = new Node(10);
      
      
        
        Tree tree =new Tree(node10);
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(node10,iterator.next());
        assertEquals(false,iterator.hasNext());
    }
    @Test
    public void testInOrderManyCase()
    {
        Node node10 = new Node(10);
        Node node9 = new Node(9);
        Node node15 = new Node(15);
      
        node10.setLeft(node9);
        node10.setRight(node15);
      
        Node node8 = new Node(8);
        node9.setLeft(node8);
        
        Node node12 = new Node(12);
        node15.setLeft(node12);
        
        Tree tree =new Tree(node10);
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(node8,iterator.next());
        assertEquals(node9,iterator.next());
        assertEquals(node10,iterator.next());
        assertEquals(node12,iterator.next());
        assertEquals(node15,iterator.next());
        assertEquals(false,iterator.hasNext());
    }
}
