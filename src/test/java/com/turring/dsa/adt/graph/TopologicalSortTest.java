/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.graph;

import com.turing.dsa.adt.graph.WeightedGraph;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TopologicalSortTest {
    /*
    @Test
    public void testTopologicalSortHelperNoSucessor()
    {
        WeightedGraph graph = new WeightedGraph();
        
        //A   -> B (1)
        //C   -> B (1)
        //B->E (1)
        //D->E (1)
        //D->F(1)
   
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        
        graph.createAdjacencyMatrix();
        graph.addEdge("A", "B",1);
        graph.addEdge("C", "B",1);
        graph.addEdge("B", "E",1);
        graph.addEdge("D", "E",1);
        graph.addEdge("D", "F",1);
        
        
        List<String> noSuccesorVertices = graph.getNoSuccessorVertices();
        assertEquals(2,noSuccesorVertices.size());
        assertEquals("E",noSuccesorVertices.get(0)); 
        assertEquals("F",noSuccesorVertices.get(1));
    }
    */
    @Test
    public void testTopologicalSort()
    {
        WeightedGraph graph = new WeightedGraph();
        
        //A   -> B (1)
        //C   -> B (1)
        //B->E (1)
        //D->E (1)
        //D->F(1)
   
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        
        graph.createAdjacencyMatrix();
        graph.addEdge("A", "B",1);
        graph.addEdge("C", "B",1);
        graph.addEdge("B", "E",1);
        graph.addEdge("D", "E",1);
        graph.addEdge("D", "F",1);
        
        
        List<String> vertices = graph.getTopologicalSort();
        assertEquals(6,vertices.size());
        assertEquals("E",vertices.get(0)); 
        assertEquals("F",vertices.get(1));
        assertEquals("B",vertices.get(2));
        assertEquals("D",vertices.get(3));
        assertEquals("A",vertices.get(4));
        assertEquals("C",vertices.get(5));
    }
}
