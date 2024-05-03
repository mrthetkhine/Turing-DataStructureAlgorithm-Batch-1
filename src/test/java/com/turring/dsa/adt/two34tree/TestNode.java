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
    
    //@Test 
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
    //@Test 
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
    //@Test 
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
    @Test
    public void testSlitNodeOneLevel()
    {
        Node<Integer> parent = this.createParentWithTwoChild();
        ArrayList<Node<Integer>> children= parent.getChildren();
        Node<Integer> childOne= children.get(0);
        Node<Integer> childTwo= children.get(1);
        
        //150,200,300
        //childTwo [300,301,302]
        childTwo.insertKey(301);
        childTwo.insertKey(302);
        /*
                [200]
                [150] [300,301,302]
        */
        
        System.out.println("ChildTwo "+childTwo);
        Node<Integer> resultParent = childTwo.split(childTwo);
        ArrayList<Node<Integer>> children2 = resultParent.getChildren();
         /*
                        [200,301]
                [150] [300] [302]
        */
        
        //assertEquals(200,resultParent.keys[0]);
        //assertEquals(301,resultParent.keys[1]);
        
        //assertEquals(3,children2.size());
        
        Node<Integer> c1= children2.get(0);
        Node<Integer> c2= children2.get(1);
        
        Node<Integer> c3 = children2.get(2);
        c3.insertKey(303);
        c3.insertKey(304);
       
        
        Node<Integer> root = c3.split(c3);
       
        
        /*
                [200,301]
            [150]   [300] [302,303,304]<-c3
        */
        
        /*
                       
                    [200][301][303]
                [150]   [300] [302] [304]
        */
        assertEquals(200, root.keys[0]);
        assertEquals(301, root.keys[1]);
        assertEquals(303, root.keys[2]);
        assertEquals(4, root.getN_Node());
        
        ArrayList<Node<Integer>> level1Child = root.getChildren();
        
        Node<Integer> l1C1 = level1Child.get(0);
        Node<Integer> l1C2 = level1Child.get(1);
        Node<Integer> l1C3 = level1Child.get(2);
        Node<Integer> l1C4 = level1Child.get(3);
      
        assertEquals(150,l1C1.keys[0]);
        assertEquals(300,l1C2.keys[0]);
        assertEquals(302,l1C3.keys[0]);
        assertEquals(304,l1C4.keys[0]);
        
       
        
    }
    @Test
    public void testSlitNodeTwoevel()
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
        
     
        Node<Integer> c1= children2.get(0);
        Node<Integer> c2= children2.get(1);
        
        Node<Integer> c3 = children2.get(2);
        c3.insertKey(303);
        c3.insertKey(304);
       /*
                [200,301]
            [150]   [300] [302,303,304]<-c3
        */
        Node<Integer> root = c3.split(c3);
      
        
       
        /*
        /*
                [200,301,303]
            [150]   [300] [302] [304]<-l1C4
        */
       
        
        ArrayList<Node<Integer>> level1Child = root.getChildren();
        
        Node<Integer> l1C1 = level1Child.get(0);
        Node<Integer> l1C2 = level1Child.get(1);
        Node<Integer> l1C3 = level1Child.get(2);
        Node<Integer> l1C4 = level1Child.get(3);
        
        assertEquals(304,l1C4.keys[0]);
        l1C4.insertKey(305);
        l1C4.insertKey(306);
         /*
                       
                    [200][301][303]
                [150]   [300] [302] [304,305,306]<-l1C4
        */
        Node<Integer> finalRoot = l1C4.split(l1C4);
        /*
        
                            [301]
                      [200]  [303] 
               [150]   [300] [302]      [304,305,306]<-l3Rightmost
        */
        assertEquals(301,finalRoot.keys[0]); 
        ArrayList<Node<Integer>> finalRootLevel1Child = finalRoot.getChildren();
        Node<Integer> fl1C1 = finalRootLevel1Child.get(0);
        Node<Integer> fl1C2 = finalRootLevel1Child.get(1);
        //Node<Integer> fl1C3 = finalRootLevel1Child.get(2);
        assertEquals(200,fl1C1.keys[0]); 
        assertEquals(303,fl1C2.keys[0]); 
        
        ArrayList<Node<Integer>> level3ChildRightMost =  fl1C2.getChildren();
        System.out.println("Noof child "+level3ChildRightMost.size());
        Node<Integer> rightMostNode = level3ChildRightMost.get(1);
        assertEquals(304,rightMostNode.keys[0]); 
        assertEquals(305,rightMostNode.keys[1]); 
        assertEquals(306,rightMostNode.keys[2]); 
        
        /*
            ->307
                            [301]
                     [200]         [303] 
               [150]   [300]     [302]   [304,305,306]
        */
        
    }
}
