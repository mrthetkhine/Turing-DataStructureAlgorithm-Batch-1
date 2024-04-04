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
}
