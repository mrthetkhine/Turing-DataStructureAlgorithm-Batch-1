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
    }
}
