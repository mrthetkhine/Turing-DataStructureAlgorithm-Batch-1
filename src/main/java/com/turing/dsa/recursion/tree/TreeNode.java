/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class TreeNode {
    String value;
    List<TreeNode> children = new ArrayList<TreeNode>();
    
    TreeNode(String value)
    {
        this.value = value;
        
    }
    public void addChild(TreeNode child)
    {
        this.children.add(child);
    }
    
}
