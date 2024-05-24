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
        
        graph.createAdjacencyMatrix();
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
    
    /*
    @Test
    public void testHelperCycleCheck()
    {
        WeightedGraph graph = new WeightedGraph();
        
        //A   -> B (5)
        //A   -> C (1)
        //    ->D (2)
            
        //B-C>(3)
   
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        
        graph.createAdjacencyMatrix();
        graph.addEdge("A", "B",5);
        graph.addEdge("A", "C",1);
        graph.addEdge("A", "D",2);
        graph.addEdge("B", "C",3);
        
        graph.markedVisited(new Edge("A","B",5));
        graph.markedVisited(new Edge("A","C",1));
        
        assertEquals(true, graph.canCreateCicyle(new Edge("B","C",3)));
        assertEquals(false, graph.canCreateCicyle(new Edge("B","D",3)));
       
    }
    */
    
    
    @Test
    public void testPrims()
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
        
        graph.createAdjacencyMatrix();
        graph.addEdge("A", "B",5);
        graph.addEdge("A", "C",1);
        graph.addEdge("A", "D",2);
        graph.addEdge("C", "D",3);
        graph.addEdge("C", "E",4);
        graph.addEdge("D", "E",2);
        
        //
        // A,C->1
        //A,D->2
        //D,E->2
        //A->B->5
        //
        List<Edge> edges = graph.primMst("A");
        assertEquals(4,edges.size());
        assertEquals("A,C->1",edges.get(0).toString());
        assertEquals("A,D->2",edges.get(1).toString());
        assertEquals("D,E->2",edges.get(2).toString());
        assertEquals("A,B->5",edges.get(3).toString());
    }
    @Test
    public void testPrims2()
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
        List<Edge> edges = graph.primMst("A");
        assertEquals(4,edges.size());
        assertEquals("A,C->1",edges.get(0).toString());
        assertEquals("C,D->1",edges.get(1).toString());
        assertEquals("D,E->2",edges.get(2).toString());
        assertEquals("A,B->5",edges.get(3).toString());
    }
}
