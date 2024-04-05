/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.binarytree;

import java.util.Iterator;

/**
 *
 * @author macbook
 */
public class BinaryTreeUtil {
    public static boolean isBinaryTree(Tree tree)
    {
        InOrderTraversal traversal = new InOrderTraversal(tree);
        Iterator<Node> iterator = traversal.iterator();
        Node previous = iterator.next();
        
        while(iterator.hasNext())
        {
            Node next = iterator.next();
            if(! (previous.getValue()< next.getValue()))
            {
                return false;
            }
            System.out.println("Value "+next.getValue());
        }
        return true;
    }
}
