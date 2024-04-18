/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.binarytree;

import com.turing.dsa.adt.binarytree.BinaryTreeUtil;
import com.turing.dsa.adt.binarytree.InOrderTraversal;
import com.turing.dsa.adt.binarytree.Node;
import com.turing.dsa.adt.binarytree.Tree;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class BinarySearchTreeTest {
    /*
    @Test
    void testInsert()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        
        assertEquals(true,BinaryTreeUtil.isBinaryTree(tree));
    }
    @Test
    void testSearch()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        
        Node node = tree.search(102);
        assertEquals(102,node.getValue());
    }*/
    /*
    @Test
    void testDeleteLeaf()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        
        tree.delete(4);
        assertEquals(true,BinaryTreeUtil.isBinaryTree(tree));
        
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(5,iterator.next().getValue());
        assertEquals(8,iterator.next().getValue());
        assertEquals(9,iterator.next().getValue()); 
        assertEquals(10,iterator.next().getValue());
        assertEquals(25,iterator.next().getValue());
        assertEquals(30,iterator.next().getValue());
        assertEquals(102,iterator.next().getValue());
    }
    @Test
    void testDeleteLeftOnlyChild()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        
        tree.delete(5);
        assertEquals(true,BinaryTreeUtil.isBinaryTree(tree));
        
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(4,iterator.next().getValue());
        assertEquals(8,iterator.next().getValue());
        assertEquals(9,iterator.next().getValue()); 
        assertEquals(10,iterator.next().getValue());
        assertEquals(25,iterator.next().getValue());
        assertEquals(30,iterator.next().getValue());
        assertEquals(102,iterator.next().getValue());
    
    }
    */
    /*
    @Test
    void testDeleteRightOnlyChild()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        
        tree.delete(30);
        assertEquals(true,BinaryTreeUtil.isBinaryTree(tree));
        
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(4,iterator.next().getValue());
        assertEquals(5,iterator.next().getValue());
        assertEquals(8,iterator.next().getValue());
        assertEquals(9,iterator.next().getValue()); 
        assertEquals(10,iterator.next().getValue());
        assertEquals(25,iterator.next().getValue());
        assertEquals(102,iterator.next().getValue());
    
    }*/
    
    @Test
    void testDeleteNodeWithBothChild()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        tree.insert(6);
        
        tree.delete(8);
        assertEquals(true,BinaryTreeUtil.isBinaryTree(tree));
        
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        
        assertEquals(4,iterator.next().getValue());
        assertEquals(5,iterator.next().getValue());
        assertEquals(6,iterator.next().getValue());
        assertEquals(9,iterator.next().getValue()); 
        assertEquals(10,iterator.next().getValue());
        assertEquals(25,iterator.next().getValue());
        assertEquals(30,iterator.next().getValue());
        assertEquals(102,iterator.next().getValue());
        
    
    }
    /* 
    @Test
    void testSuccessor()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(25);
        tree.insert(30);
        tree.insert(8);
        tree.insert(5);
        tree.insert(4);
        tree.insert(102);
        tree.insert(9);
        tree.insert(6);
        
        assertEquals(8,tree.getInOrderSuccessor(6).getValue());
        assertEquals(9,tree.getInOrderSuccessor(8).getValue());
    }*/
}
