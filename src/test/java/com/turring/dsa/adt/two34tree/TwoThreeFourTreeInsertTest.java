/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.two34tree;

import com.turing.dsa.adt.two34tree.Node;
import com.turing.dsa.adt.two34tree.TwoThreeFourTree;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TwoThreeFourTreeInsertTest {
    @Test
    public void testInsertLeafBaseCase()
    {
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(100);
        
        Node<Integer> root = tree.getRoot();
        assertEquals(5,root.keys[0]);
        assertEquals(10,root.keys[1]);
        assertEquals(100,root.keys[2]);
    }
}
