/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.graph;

import com.turing.dsa.adt.graph.Graph;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class GraphForDijkstra extends WeightedGraph{
    int totalDistance[];
    String previous[];
    
    public GraphForDijkstra()
    {
        super();
    }
    public void initTotalDistanceAndPrevious()
    {
        this.totalDistance = new int[vertices.size()];
        this.previous =new String[vertices.size()];
    }
    public boolean isEdgeExist(String from, String to)
    {
        return super.isEdgeExist(from, to) || super.isEdgeExist(to, from);
    }
    public void addEdge(String from, String to,int weight)
    {
        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);
        this.adjacencyMatrix[fromIndex][toIndex]= weight;
        this.adjacencyMatrix[toIndex][fromIndex]= weight;
        
        Edge edge =new Edge(from,to,weight);
        this.edges.add(edge);
        
        Edge edge2 =new Edge(to,from,weight);
        this.edges.add(edge2);
    }
    public List<Edge> getEdgeRechableUnvisitedFromVertice(String from)
    {
        List<Edge> result = new ArrayList<>();
        List<Edge> rechableEdges = super.getEdgeRechableFromVertice(from);
        for (Edge edge : rechableEdges) {
            for (String vertice : this.visited) {
                if(!edge.to.equals(vertice))
                {
                    result.add(edge);
                }
            }
        }
        return result;
    }
    public int[] getTotalDistance() {
        return totalDistance;
    }

  

    public String[] getPrevious() {
        return previous;
    }
    public List<String> getUnvisitedVertices()
    {
        List<String> result = new ArrayList<>();
        for (String vertice: this.vertices) {
            if(!this.visited.contains(vertice))
            {
                result.add(vertice);
            }
        }
        return result;
    }
    void initDistance(String startVertice)
    {
        for(int i = 0; i < this.totalDistance.length; i++) {
            this.totalDistance[i]= Integer.MAX_VALUE;
        }
        int verticeIndex = this.vertices.indexOf(startVertice);
        this.totalDistance[verticeIndex] = 0;
    }
   void updateDistacnce(Edge edge,String vertice)
   {
       int previousIndex = this.vertices.indexOf(vertice); 
       int preWeight = this.totalDistance[previousIndex];
       int weight = edge.getWeight();
       int toIndex = this.vertices.indexOf(edge.to);
       if(this.totalDistance[toIndex] > weight + preWeight)
       {
           this.totalDistance[toIndex] = weight + preWeight;
           this.previous[toIndex] = vertice;
       }
   }
   public void dikstraAlgorithm(String startVertice)
   {
       this.initDistance(startVertice);
       int n = this.vertices.size();
       String vertice = startVertice;
       while( this.visited.size() != n )
       {
           System.out.println("Visit vertice "+vertice);
           this.markedVisited(vertice);
           List<Edge> unvisitedEdges = this.getEdgeRechableUnvisitedFromVertice(vertice);
       }
   }
    
}
