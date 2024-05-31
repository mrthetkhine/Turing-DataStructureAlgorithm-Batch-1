/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.graph;

import com.turing.dsa.adt.graph.Edge;
import com.turing.dsa.adt.graph.GraphForDijkstra;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class DijkstraTest {
    
    @Test
    public void testSetup()
    {
        GraphForDijkstra graph = new GraphForDijkstra();
        
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
      
        
        graph.createAdjacencyMatrix();
        graph.addEdge("A", "B",7);
        graph.addEdge("A", "E",1);
        
        graph.addEdge("B", "C",3);
        graph.addEdge("B", "E",8);
   
        graph.addEdge("C", "E",2);
        graph.addEdge("C", "D",6);
        
        graph.addEdge("D", "E",7);
        
        graph.initTotalDistanceAndPrevious();
        int n = graph.getVertices().size();
        assertEquals(true, graph.isEdgeExist("E", "C"));
        assertEquals(n,graph.getPrevious().length);
        assertEquals(n,graph.getTotalDistance().length);
        
        List<Edge> edges = graph.getEdgeRechableFromVertice("B");
        assertEquals(3,edges.size());
        
        //graph.markedVisited("A");
        graph.markedVisited("B");
        
        List<String>  unvisited = graph.getUnvisitedVertices();
        assertEquals(4,unvisited.size());
        
        List<Edge> rechableEdges = graph.getEdgeRechableFromVertice("A");
        assertEquals(2,rechableEdges.size());
        
        List<Edge> unvistedRechable= graph.getEdgeRechableUnvisitedFromVertice("A");
        assertEquals(1,unvistedRechable.size());
        
    }
    //use test data from https://graphicmaths.com/computer-science/graph-theory/dijkstras-algorithm/
    @Test
    public void testDijkstra()
    {
       
    }
}
