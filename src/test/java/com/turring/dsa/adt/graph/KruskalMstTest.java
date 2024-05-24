/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.graph;

import com.turing.dsa.adt.graph.Edge;
import com.turing.dsa.adt.graph.WeightedGraph;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class KruskalMstTest {
    @Test
    public void testKrusal()
    {
        WeightedGraph graph = new WeightedGraph();
        
        //A   -> B (5)
        //A   -> C (1)
        //    ->D (2)
            
        //C->D (1)
        //C->E (4)
        //D->E (2)
   
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        
        graph.createAdjacencyMatrix();
        graph.addEdge("A", "B",5);
        graph.addEdge("A", "C",1);
        graph.addEdge("A", "D",2);
        graph.addEdge("C", "D",1);
        graph.addEdge("C", "E",4);
        graph.addEdge("D", "E",2);
        
        
        //
        // A,C->1
        // C,D->1
        //D,E->2
        //A->B->5
        //
        List<Edge> edges = graph.krusalMst();
        assertEquals(4,edges.size());
        assertEquals("A,C->1",edges.get(0).toString());
        assertEquals("C,D->1",edges.get(1).toString());
        assertEquals("D,E->2",edges.get(2).toString());
        assertEquals("A,B->5",edges.get(3).toString());
    }
}
