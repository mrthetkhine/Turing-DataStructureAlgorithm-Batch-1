/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.graph;

import com.turing.dsa.adt.graph.Edge;
import com.turing.dsa.adt.graph.Graph;
import com.turing.dsa.adt.graph.WeightedGraph;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class PrimMstTest {
    /*
    @Test
    public void testHelperMethod()
    {
        WeightedGraph graph = new WeightedGraph();
        
        //A   -> B (5)
        //A   -> C (1)
        //    ->D (2)
            
        //C->D (3)
        //C->E (4)
   
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        
        graph.creteAdjacencyMatrix();
        graph.addEdge("A", "B",5);
        graph.addEdge("A", "C",1);
        graph.addEdge("A", "D",2);
        graph.addEdge("C", "D",3);
        graph.addEdge("C", "E",4);
        
       
        //total mst =12
        //A,C->1
        //A,D-2
        //D,E-4
        //A,B-5
        
        List<Edge> edges = graph.getEdgeRechableFromVertice("A");
        assertEquals(3,edges.size());
        assertEquals("A,B->5",edges.get(0).toString());
        assertEquals("A,C->1",edges.get(1).toString());
        assertEquals("A,D->2",edges.get(2).toString());
        
        Edge minEdge = WeightedGraph.getMinWeightEdge(edges);
        assertEquals("A,C->1",minEdge.toString());
    }*/
    @Test
    public void testHelperMethodTwo()
    {
         WeightedGraph graph = new WeightedGraph();
        
        //A   -> B (5)
        //A   -> C (1)
        //    ->D (2)
            
        //C->D (3)
        //C->E (4)
        //D->E (2)
   
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        
        graph.creteAdjacencyMatrix();
        graph.addEdge("A", "B",5);
        graph.addEdge("A", "C",1);
        graph.addEdge("A", "D",2);
        graph.addEdge("C", "D",3);
        graph.addEdge("C", "E",4);
        graph.addEdge("D", "E",2);
        
        graph.markedVisited(new Edge("A","C",1));
    }
}
