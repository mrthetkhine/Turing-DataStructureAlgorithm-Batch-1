/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.turing.dsa.adt.two34tree;

import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author macbook
 */
public class TwoThreeFourVisualizer extends javax.swing.JFrame {

    /**
     * Creates new form TwoThreeFourVisualizer
     */
    public TwoThreeFourVisualizer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnShowTree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        btnShowTree.setText("Show Tree");
        btnShowTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowTree, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowTree)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
     
        //assertEquals(2,parent.getN_Node());
        //assertEquals(false,parent.isLeaf());
        
       
        
        return parent;
    }
    Node<Integer> buildTree()
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
        
        
        l1C4.insertKey(305);
        l1C4.insertKey(306);
         /*
                       
                    [200][301][303]
                [150]   [300] [302] [304,305,306]
        */
        Node<Integer> finalRoot = l1C4.split(l1C4);
      
        return finalRoot;
    }
    void traverseTree(DefaultMutableTreeNode parent,Node<Integer> node)
    {
        if(!node.isLeaf())
        {
            ArrayList<Node<Integer>> children = node.getChildren();
            for(Node<Integer> n : children)
            {
                 DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(n.toString());
                 parent.add(treeNode);
                 traverseTree(treeNode,n);
            }
        }
    }
    void showTree(Node<Integer> root)
    {
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(root.toString());
       
        
        traverseTree(rootNode, root);
        
        JTree tree = new JTree(rootNode);
        tree.setSize(200, 500);
        this.panel.add(tree);
        tree.setVisible(true);
        this.pack();
        System.out.println("Build tree done");
    }
    private void btnShowTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTreeActionPerformed
        // TODO add your handling code here:
         Node<Integer> root = this.buildTree();
         this.showTree(root);
    }//GEN-LAST:event_btnShowTreeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TwoThreeFourVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoThreeFourVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoThreeFourVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoThreeFourVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoThreeFourVisualizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowTree;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
