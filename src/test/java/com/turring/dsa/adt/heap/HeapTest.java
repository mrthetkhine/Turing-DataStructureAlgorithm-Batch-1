/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.heap;

import com.turing.dsa.adt.binarytree.Node;
import com.turing.dsa.adt.heap.CompleteBinaryTree;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class HeapTest {
    @Test
    public void testBuildHeapBaseCase()
    {
        /*[1,2]
            [1]
           [2]
        */
        Integer[] items = {1,2};
        CompleteBinaryTree tree = new CompleteBinaryTree(items);
        
        Node root = tree.getRoot();
        assertEquals(1,root.getValue());
        assertEquals(2,root.getLeft().getValue());
    }
    @Test
    public void testBuildHeapBaseCaseTwo()
    {
        /*[1,2,3]
            [1]
           [2] [3]
        */
        Integer[] items = {1,2,3};
        CompleteBinaryTree tree = new CompleteBinaryTree(items);
        
        Node root = tree.getRoot();
        assertEquals(1,root.getValue());
        assertEquals(2,root.getLeft().getValue());
        assertEquals(3,root.getRight().getValue());
    }
    @Test
    public void testBuildHeapComplexCase()
    {
        /*[1,2,3,4,5,6]
                [1]
           [2]      [3]
        [4] [5]   [6]
        */
        Integer[] items = {1,2,3,4,5,6};
        
        CompleteBinaryTree tree = new CompleteBinaryTree(items);
        
        Node root = tree.getRoot();
        assertEquals(1,root.getValue());
        assertEquals(2,root.getLeft().getValue());
        assertEquals(3,root.getRight().getValue());
        
        Node node2 = root.getLeft();
        Node node3 = root.getRight();
        
        assertEquals(4,node2.getLeft().getValue());
        assertEquals(5,node2.getRight().getValue());
        
        assertEquals(6,node3.getLeft().getValue());
        
    }
}
