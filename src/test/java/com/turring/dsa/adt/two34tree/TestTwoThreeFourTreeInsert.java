/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.two34tree;

import com.turing.dsa.adt.two34tree.Node;
import com.turing.dsa.adt.two34tree.TwoThreeFourTree;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TestTwoThreeFourTreeInsert {
    //@Test
    public void testInsertBaseCase()
    {
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>();
        Node<Integer> result = tree.insert(100);
        
        assertEquals(100,result.keys[0]);
    }
    //@Test
    public void testInsertBaseCase2()
    {
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>();
        Node<Integer> result = tree.insert(100);
        tree.insert(99);
        tree.insert(102);//[99,100,102]
        
        System.out.println("Root "+tree.getRoot());
        assertEquals(99,result.keys[0]);
        assertEquals(100,result.keys[1]);
        assertEquals(102,result.keys[2]);
       
    }
    @Test
    public void testInsertSplitCase()
    {
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>();
        Node<Integer> result = tree.insert(100);
        tree.insert(99);
        tree.insert(102);//[99,100,102]
        
        result = tree.insert(150);
        
        /*
                    [100]
               [99] [102,150]
        */
        
        System.out.println("Root "+tree.getRoot());
        Node<Integer> root = tree.getRoot();
        assertEquals(100,root.keys[0]);
        ArrayList<Node<Integer>> children= root.getChildren();
        Node<Integer> child0 = children.get(0);
        Node<Integer> child1 = children.get(1);
        
        assertEquals(99,child0.keys[0]);
        assertEquals(102,child1.keys[0]);
        assertEquals(150,child1.keys[1]);
        
       
    }
}
