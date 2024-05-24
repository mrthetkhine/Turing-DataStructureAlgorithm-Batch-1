/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.graph;

import com.turing.dsa.adt.graph.Graph;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class DFSIterativeTest {
   
    /*
    @Test
    public void testDFSBaseCase()
    {
        Graph graph = new Graph();
        
        //A   -> B
        //B->C
        //C->D    
   
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        
        graph.createAdjacencyMatrix();
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        
        graph.dfsIterative("A");
        ArrayList<String> result = graph.getVisted();
        assertEquals(4,result.size());
        assertEquals("A",result.get(0));
        assertEquals("B",result.get(1));
        assertEquals("C",result.get(2));
        assertEquals("D",result.get(3));
    }
    */
    
    @Test
    public void testDFSComplexSearchNeighbou()
    {
        Graph graph = new Graph();
        
        //A   -> B
        //    ->D
        //B->C
        //D->E
   
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        
        graph.createAdjacencyMatrix();
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("D", "E");
        
        graph.dfsIterative("A");
        ArrayList<String> result = graph.getVisted();
        assertEquals(5,result.size());
        assertEquals("A",result.get(0));
        assertEquals("B",result.get(1));
        assertEquals("C",result.get(2));
        assertEquals("D",result.get(3));
        assertEquals("E",result.get(4));
    }
    
}
