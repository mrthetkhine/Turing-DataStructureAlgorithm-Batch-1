/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.graph;

import com.turing.dsa.adt.graph.ShortestPathGraph;
import com.turing.dsa.adt.graph.WeightedGraph;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class WarshallAlgorithmTest {
    @Test
    public void testGraphSetup()
    {
        ShortestPathGraph graph = new ShortestPathGraph();
        
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
        graph.addEdge("A", "B",5);
        graph.addEdge("C", "B",1);
        graph.addEdge("B", "E",3);
        graph.addEdge("D", "E",2);
        graph.addEdge("D", "F",9);
        int[][] matrix = graph.getAdjacencyMatrix();
        int n = graph.getAllVertices().size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                {
                    assertEquals(0,matrix[i][j]);
                }
                
            }
        }
        assertEquals(5,matrix[0][1]);
        assertEquals(ShortestPathGraph.MAX,matrix[0][2]);
        
    }
    //Use graph from https://www.programiz.com/dsa/floyd-warshall-algorithm
    @Test
    public void testShortestPath()
    {
        ShortestPathGraph graph = new ShortestPathGraph();
        
        //1-2->3
        //1-4->5
        //2-1->2
        //2-4->4
        //3-2->1
        //4-3->2
   
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");
        graph.addVertex("4");
        
        graph.createAdjacencyMatrix();
        graph.addEdge("1", "2",3);
        graph.addEdge("1", "4",5);
        graph.addEdge("2", "1",2);
        graph.addEdge("2", "4",4);
        graph.addEdge("3", "2",1);
        graph.addEdge("4", "3",2);
        
        int resultMatrix [][] ={
            {0,3,7,5},
            {2,0,6,4},
            {3,1,0,5},
            {5,3,2,0},
        };
        int[][] adjacencyMatrix = graph.getAdjacencyMatrix();
        //0,1->3
        assertEquals(3,adjacencyMatrix[0][1]);
        assertEquals(5,adjacencyMatrix[0][3]);
        int matrix[][] = graph.warshallAlgorithm();
        int n = graph.getAllVertices().size();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.print(matrix[i][j]+" , ");
                if(i!=j)//skip diagonal
                {
                    assertEquals(resultMatrix[i][j],matrix[i][j]);
                }
                
            }
            //System.out.println("");
        }
    }

    
}
