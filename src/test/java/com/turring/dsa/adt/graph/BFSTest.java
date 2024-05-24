/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.graph;

import com.turing.dsa.adt.graph.Graph;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class BFSTest {
    /*
    @Test
    public void testBaseCase()
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
        
        graph.breadthFirstSearch("A");
        ArrayList<String> result = graph.getVisted();
        assertEquals(5,result.size());
        assertEquals("A",result.get(0));
        assertEquals("B",result.get(1));
        assertEquals("D",result.get(2));
        assertEquals("C",result.get(3));
        assertEquals("E",result.get(4));
    }*/
    
    @Test
    public void testBaseCaseComplexCase()
    {
        Graph graph = new Graph();
        
        //A   -> B
        //    ->D
        //B->C
        //B->D
        //B->E
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
        graph.addEdge("B", "D");
        graph.addEdge("B", "E");
        graph.addEdge("D", "E");
        
        graph.breadthFirstSearch("A");
        ArrayList<String> result = graph.getVisted();
        assertEquals(5,result.size());
        assertEquals("A",result.get(0));
        assertEquals("B",result.get(1));
        assertEquals("D",result.get(2));
        assertEquals("C",result.get(3));
        assertEquals("E",result.get(4));
    }
}
