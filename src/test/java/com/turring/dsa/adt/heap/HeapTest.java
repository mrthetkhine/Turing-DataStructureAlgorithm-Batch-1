/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.heap;

import com.turing.dsa.adt.binarytree.Node;
import com.turing.dsa.adt.heap.MaxHeap;
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
        MaxHeap tree = new MaxHeap(items);
        
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
        MaxHeap tree = new MaxHeap(items);
        
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
        
        MaxHeap tree = new MaxHeap(items);
        
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
    @Test
    public void testHeapifyBase()
    {
        Integer[] items = {1,3,2}; //Root 7
        MaxHeap tree = new MaxHeap(items);
        tree.heapify();
        tree.buildTree();
        Node root = tree.getRoot();
        assertEquals(3,root.getValue());
    }
    @Test
    public void testHeapifyComplexCase()
    {
        Integer[] items = {1,7,9,4,12,3,20}; //Root 20
        MaxHeap tree = new MaxHeap(items);
        tree.heapify();
        tree.buildTree();
        Node root = tree.getRoot();
        assertEquals(20,root.getValue());
    }
    @Test
    public void testInsert()
    {
        Integer[] items = {1,7,9,4,12,3,20}; //Root 20
        MaxHeap tree = new MaxHeap(items);
        tree.insert(100);
       
        Node root = tree.getRoot();
        assertEquals(100,root.getValue());
    }
    @Test
    public void testDelete()
    {
        Integer[] items = {1,7,9,4,12,3,20}; //Root 20
        MaxHeap tree = new MaxHeap(items);
        tree.delete(20);
       
        Node root = tree.getRoot();
        assertEquals(12,root.getValue());
    }
}
