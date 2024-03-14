/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion.tree;

import java.util.Stack;

/**
 *
 * @author macbook
 */
public class TreeTraversal {
    
    void preOrder(TreeNode root)
    {
        //base case
        if(root.children.size() ==0)
        {
            System.out.println(root.value);
        }
        else
        {
            System.out.println(root.value);
            for(TreeNode child: root.children)
            {
                this.preOrder(child);
            }
        }
    }
    void preOrderIterative(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty())
        {
            TreeNode node =stack.pop() ;
            System.out.println(node.value);
            
            if(node.children.size()>0)
            {
                //push
                for (int i = node.children.size()-1; i >=0; i--) {
                    stack.push(node.children.get(i));
                }
  
            }
        }
    }
    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        
        nodeA.addChild(nodeB);
        nodeA.addChild(nodeC);
        
        nodeC.addChild(nodeD);
        nodeC.addChild(nodeE);
        
        TreeTraversal traversal = new TreeTraversal();
        //traversal.preOrder(nodeA);
        traversal.preOrderIterative(nodeA);
    }
}
