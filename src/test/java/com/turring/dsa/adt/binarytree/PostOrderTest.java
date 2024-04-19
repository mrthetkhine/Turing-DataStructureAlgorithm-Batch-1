/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.binarytree;

import com.turing.dsa.adt.binarytree.InOrderTraversal;
import com.turing.dsa.adt.binarytree.Node;
import com.turing.dsa.adt.binarytree.PostOrderTraversal;
import com.turing.dsa.adt.binarytree.Tree;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class PostOrderTest {
    @Test
    public void testPostOrderBaseCase()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(5);
        tree.insert(25);
        
       
        PostOrderTraversal traversal = new PostOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(5,iterator.next().getValue());
        assertEquals(25,iterator.next().getValue());
        assertEquals(10,iterator.next().getValue());
    }
    @Test
    public void testPostOrderMany()
    {
        Tree tree = new Tree();
        
        tree.insert(10);
        tree.insert(5);
        tree.insert(25);
        tree.insert(6);
        tree.insert(12);
       
        PostOrderTraversal traversal = new PostOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        
        assertEquals(6,iterator.next().getValue());
        assertEquals(5,iterator.next().getValue());
        assertEquals(12,iterator.next().getValue());
        assertEquals(25,iterator.next().getValue());
        assertEquals(10,iterator.next().getValue());
    }
}
