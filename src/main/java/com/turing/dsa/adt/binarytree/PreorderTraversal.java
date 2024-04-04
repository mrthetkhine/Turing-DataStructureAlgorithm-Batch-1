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
public class PreorderTraversal implements Iterable<Node>{

    Tree tree ;
    PreorderTraversal(Tree tree)
    {
        this.tree = tree;
    }
    
    
    @Override
    public Iterator<Node> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
