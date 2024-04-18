/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.binarytree;

/**
 *
 * @author macbook
 */
public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value)
    {
        this.value = value;
    }
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    public int getValue()
    {
        return this.value;
    }
    public boolean isLeaf()
    {
        return left ==null && right==null;
    }
    public boolean haveOnlyLeftChild()
    {
        return left!=null && right==null;
    }
    public boolean haveOnlyRightChild()
    {
        return left==null && right!=null;
    }
    public boolean haveBothChild()
    {
        return left!=null && right!=null;
    }
}
