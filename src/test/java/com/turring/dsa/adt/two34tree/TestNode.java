/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.two34tree;

import com.turing.dsa.adt.two34tree.Node;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TestNode {
    /*
    @Test
    public void test2Node()
    {
        Node<Integer> node= new Node<Integer>(2);
       
        
        node.children.add(new Node<Integer>(1));
        node.children.add(new Node<Integer>(1));
        
        assertEquals(2,node.getN_Node());
    }
    @Test
    public void test3Node()
    {
        Node<Integer> node= new Node<Integer>(3);
      
        
        node.children.add(new Node<Integer>(1));
        node.children.add(new Node<Integer>(1));
        
        assertEquals(3,node.getN_Node());
    }
    @Test
    public void test4Node()
    {
        Node<Integer> node= new Node<Integer>(4);
      
        
        node.children.add(new Node<Integer>(1));
        node.children.add(new Node<Integer>(1));
        
        assertEquals(4,node.getN_Node());
    }
    @Test
    public void testLeaf()
    {
        Node<Integer> node= new Node<Integer>(4);
        
        assertEquals(true,node.isLeaf());
    }
    @Test
    public void testNonLeaf()
    {
        Node<Integer> node= new Node<Integer>(3);
        node.children.add(new Node<Integer>(2));
        node.children.add(new Node<Integer>(2));
        assertEquals(false,node.isLeaf());
    }
    */
    /*
    @Test
    public void testInsertKey()
    {
        Node<Integer> node= new Node<Integer>();
        //node.keys[0] = 5;
        
        node.insertKey(5);
        node.insertKey(10);
        
        assertEquals(5,node.keys[0]);
        assertEquals(10,node.keys[1]);
    }
    @Test
    public void testInsertKey2()
    {
        Node<Integer> node= new Node<Integer>();
        node.insertKey(15);
        node.insertKey(10);
        
        assertEquals(10,node.keys[0]);
        assertEquals(15,node.keys[1]);
    }
    @Test
    public void testInsertKey3()
    {
        Node<Integer> node= new Node<Integer>();
        
        node.insertKey(150);
        node.insertKey(10);
        node.insertKey(200);
        
        assertEquals(10,node.keys[0]);
        assertEquals(150,node.keys[1]);
        assertEquals(200,node.keys[2]);
    }
    @Test
    public void testInsertKey4()
    {
        Node<Integer> node= createFourNode();
        
        assertEquals(150,node.keys[0]);
        assertEquals(200,node.keys[1]);
        assertEquals(300,node.keys[2]);
    }
    */
    public Node<Integer> createFourNode() {
        Node<Integer> node= new Node<Integer>();
        node.insertKey(150);
        node.insertKey(200);
        node.insertKey(300);
        return node;
    }
    public Node<Integer> createParentWithTwoChild()
    {
        Node<Integer> fourNode = this.createFourNode();
        Node<Integer> parent = fourNode.split(fourNode);
     
        assertEquals(2,parent.getN_Node());
        assertEquals(false,parent.isLeaf());
        
       
        
        return parent;
    }
    //@Test
    public void testNoParentSplit()
    {
        Node<Integer> parent = this.createParentWithTwoChild();
        ArrayList<Node<Integer>> children= parent.getChildren();
        Node<Integer> childOne= children.get(0);
        Node<Integer> childTwo= children.get(1);
        assertEquals(200,parent.keys[0]);
        
        assertEquals(150,childOne.keys[0]);
        assertEquals(300,childTwo.keys[0]);
    }
    
    @Test 
    public void testWithTwoNodeParent()
    {
        Node<Integer> parent = this.createParentWithTwoChild();
        ArrayList<Node<Integer>> children= parent.getChildren();
        Node<Integer> childOne= children.get(0);
        Node<Integer> childTwo= children.get(1);
        
        //childTwo [300,301,302]
        childTwo.insertKey(301);
        childTwo.insertKey(302);
        
        System.out.println("ChildTwo "+childTwo);
        Node<Integer> resultParent = childTwo.split(childTwo);
        ArrayList<Node<Integer>> children2 = resultParent.getChildren();
        
        assertEquals(200,resultParent.keys[0]);
        assertEquals(301,resultParent.keys[1]);
        
        assertEquals(3,children2.size());
        
        Node<Integer> c1= children2.get(0);
        Node<Integer> c2= children2.get(1);
        Node<Integer> c3 = children2.get(2);
        assertEquals(150,c1.keys[0]);
        assertEquals(300,c2.keys[0]);
        assertEquals(302,c3.keys[0]);
        
    }
    @Test 
    public void testWithTwoNodeParent2()
    {
        Node<Integer> parent = this.createParentWithTwoChild();
        ArrayList<Node<Integer>> children= parent.getChildren();
        Node<Integer> childOne= children.get(0);
        Node<Integer> childTwo= children.get(1);
        
        //childOne [150,180,190]
        childOne.insertKey(180);
        childOne.insertKey(190);
        
        System.out.println("childOne "+childOne);
        Node<Integer> resultParent = childOne.split(childOne);
        ArrayList<Node<Integer>> children2 = resultParent.getChildren();
        
        assertEquals(180,resultParent.keys[0]);
        assertEquals(200,resultParent.keys[1]);
        
        assertEquals(3,children2.size());
        
        Node<Integer> c1= children2.get(0);
        Node<Integer> c2= children2.get(1);
        Node<Integer> c3 = children2.get(2);
        assertEquals(150,c1.keys[0]);
        assertEquals(190,c2.keys[0]);
        assertEquals(300,c3.keys[0]);
        
    }
    @Test 
    public void testWithTwoNodeParentTwo()
    {
        Node<Integer> parent = this.createParentWithTwoChild();
        ArrayList<Node<Integer>> children= parent.getChildren();
        Node<Integer> childOne= children.get(0);
        Node<Integer> childTwo= children.get(1);
        
        //childOne [150,180,190]
        childOne.insertKey(180);
        childOne.insertKey(190);
        
        System.out.println("childOne "+childOne);
        Node<Integer> resultParent = childOne.split(childOne);
        ArrayList<Node<Integer>> children2 = resultParent.getChildren();
        
        Node<Integer> c1= children2.get(0);
        Node<Integer> c2= children2.get(1);
        Node<Integer> c3 = children2.get(2);
        
        //c2[190,191,192]
        c2.insertKey(191);
        c2.insertKey(192);
        
        Node<Integer> parent3 = c2.split(c2);
          
        assertEquals(180,parent3.keys[0]);
        assertEquals(191,parent3.keys[1]);
        assertEquals(200,parent3.keys[2]);
        
        assertEquals(4,parent3.getChildren().size());
        ArrayList<Node<Integer>> children3 = parent3.getChildren();
        
        assertEquals(150,children3.get(0).keys[0]);
        assertEquals(190,children3.get(1).keys[0]);
        assertEquals(192,children3.get(2).keys[0]);
        assertEquals(300,children3.get(3).keys[0]);
        
        
    }
}
