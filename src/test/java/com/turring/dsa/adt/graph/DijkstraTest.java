/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.graph;

import com.turing.dsa.adt.graph.Edge;
import com.turing.dsa.adt.graph.GraphForDijkstra;
import com.turing.dsa.adt.graph.Tuple;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class DijkstraTest {
    
    /*
    @Test
    public void testSetup()
    {
        GraphForDijkstra graph = createGraph();
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
    */

    GraphForDijkstra createGraph() {
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
        return graph;
    }
    //use test data from https://graphicmaths.com/computer-science/graph-theory/dijkstras-algorithm/
    /*
    @Test
    public void testDijkstraUtil()
    {
       GraphForDijkstra graph = this.createGraph();
       List<Edge> unvistedRechableEdge= graph.getEdgeRechableUnvisitedFromVertice("A");
       assertEquals(2,unvistedRechableEdge.size());
       
       List<Tuple<String,Integer>> verticesAndWeight = graph.getRecahbleUnvisitedVertice("A");
       assertEquals(2,verticesAndWeight.size());
       
       assertEquals("B",verticesAndWeight.get(0).getFirst());
       assertEquals(7,verticesAndWeight.get(0).getSecond());
       
       assertEquals("E",verticesAndWeight.get(1).getFirst());
       assertEquals(1,verticesAndWeight.get(1).getSecond());
    }*/
    /*
    @Test
    public void testDijkstra()
    {
        GraphForDijkstra graph = this.createGraph();
        graph.dikstraAlgorithm("A");
        
        assertEquals(6,graph.getTotalDistance()[1]);//B
        assertEquals("C",graph.getPrevious()[1]);
        
        assertEquals(3,graph.getTotalDistance()[2]);//C
        assertEquals("E",graph.getPrevious()[2]);
        
        assertEquals(8,graph.getTotalDistance()[3]);//D
        assertEquals("E",graph.getPrevious()[3]);
        
        assertEquals(1,graph.getTotalDistance()[4]);//E
        assertEquals("A",graph.getPrevious()[4]);
    }
    */
    @Test
    public void testDijkstraShortestPath()
    {
        GraphForDijkstra graph = this.createGraph();
        
        
        List<String> vertices = graph.getShortestPath("A", "B");
        assertEquals(4,vertices.size());//
        
        assertEquals("A",vertices.get(0));//
        assertEquals("E",vertices.get(1));
        assertEquals("C",vertices.get(2));
        assertEquals("B",vertices.get(3));

    }
}
