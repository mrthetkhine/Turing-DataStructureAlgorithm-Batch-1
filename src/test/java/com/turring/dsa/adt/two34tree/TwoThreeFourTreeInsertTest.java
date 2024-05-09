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
    /*
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
    @Test
    public void testSearchBaseCase()
    {
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(100);
        
        assertEquals(5,tree.search(5));
        assertEquals(10,tree.search(10));
        assertEquals(100,tree.search(100));
        assertEquals(null,tree.search(15));
    }*/
    
    //@Test
    public void testLevel2()
    {
        /*
             [103]
        [100] [108,112]
        */
        Node<Integer> root= new Node<Integer>();
        root.insertKey(103);
         
        Node<Integer> left= new Node<Integer>(); 
        left.insertKey(100);
        
        Node<Integer> right = new Node<Integer>(); 
        right.insertKey(108);
        right.insertKey(112);
        
        root.getChildren().add(left);
        root.getChildren().add(right);
        
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>(root);
        assertEquals(103,tree.search(103));
        assertEquals(100,tree.search(100));
        assertEquals(108,tree.search(108));
        assertEquals(112,tree.search(112));
        assertEquals(null,tree.search(107));
        assertEquals(null,tree.search(115));
    }
    //@Test
    public void testLevel3()
    {
        /*
                            [112]
                    [103]         [120,150]
              [100][108]       [115][130] [160,170]
        */
        Node<Integer> root= new Node<Integer>();
        root.insertKey(112);
         
        Node<Integer> left= new Node<Integer>(); 
        left.insertKey(103);
        
        Node<Integer> right = new Node<Integer>(); 
        right.insertKey(120);
        right.insertKey(150);
        
        root.getChildren().add(left);
        root.getChildren().add(right);
        
        Node<Integer> leftC1= new Node<Integer>(); 
        leftC1.insertKey(100);
        
        Node<Integer> leftC2= new Node<Integer>();
        leftC2.insertKey(108);
        
        left.children.add(leftC1);
        left.children.add(leftC2);
        
        Node<Integer> rightC1= new Node<Integer>(); 
        rightC1.insertKey(115);
        right.children.add(rightC1);
        
        Node<Integer> rightC2= new Node<Integer>(); 
        rightC2.insertKey(130);
        right.children.add(rightC2);
        
        Node<Integer> rightC3= new Node<Integer>(); 
        rightC3.insertKey(160);
        rightC3.insertKey(170);
        right.children.add(rightC3);
        
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>(root);
        assertEquals(170,tree.search(170));
        assertEquals(160,tree.search(160));
       
        assertEquals(null,tree.search(165));
        assertEquals(null,tree.search(145));
        assertEquals(null,tree.search(110));
    }
    @Test
    public void testSearchToInsertBaseCase()
    {
        Node<Integer> root= new Node<Integer>();
        root.insertKey(103);
        root.insertKey(102);
        root.insertKey(105);//[102,103,105]
        
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>(root);
        Node<Integer> nodeToInsert = tree.searchLeafToInsert(109);
        assertEquals(root,nodeToInsert);
    }
    @Test
    public void testSearchToInsertComplexCase()
    {
        /*
                            [112]
                    [103]         [120,150]
              [100][108]       [115][130] [160,170]
        */
        Node<Integer> root= new Node<Integer>();
        root.insertKey(112);
         
        Node<Integer> left= new Node<Integer>(); 
        left.insertKey(103);
        
        Node<Integer> right = new Node<Integer>(); 
        right.insertKey(120);
        right.insertKey(150);
        
        root.getChildren().add(left);
        root.getChildren().add(right);
        
        Node<Integer> leftC1= new Node<Integer>(); 
        leftC1.insertKey(100);
        
        Node<Integer> leftC2= new Node<Integer>();
        leftC2.insertKey(108);
        
        left.children.add(leftC1);
        left.children.add(leftC2);
        
        Node<Integer> rightC1= new Node<Integer>(); 
        rightC1.insertKey(115);
        right.children.add(rightC1);
        
        Node<Integer> rightC2= new Node<Integer>(); 
        rightC2.insertKey(130);
        right.children.add(rightC2);
        
        Node<Integer> rightC3= new Node<Integer>(); 
        rightC3.insertKey(160);
        rightC3.insertKey(170);
        right.children.add(rightC3);
        
        TwoThreeFourTree<Integer> tree = new TwoThreeFourTree<>(root);
        Node<Integer> node171 = tree.searchLeafToInsert(171);
        assertEquals(rightC3,node171);
        assertEquals(true, node171.isLeaf());
        
        Node<Integer> node125 = tree.searchLeafToInsert(125);
        assertEquals(rightC2,node125);
    }
}
