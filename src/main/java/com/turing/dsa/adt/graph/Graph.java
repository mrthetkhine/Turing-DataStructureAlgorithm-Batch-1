/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.graph;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class Graph {
    ArrayList<String> vertices = new ArrayList<>();
    ArrayList<String> visited = new ArrayList<>();
    int [][]adjacencyMatrix ;
    
    public void addVertex(String label)
    {
        this.vertices.add(label);    
    }
    public void creteAdjacencyMatrix()
    {
        this.adjacencyMatrix = new int[vertices.size()][vertices.size()];
    }
    public void addEdge(String from, String to)
    {
        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);
        this.adjacencyMatrix[fromIndex][toIndex]= 1;
    }
    boolean isEdgeExist(String from, String to )
    {
        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);
        return this.adjacencyMatrix[fromIndex][toIndex] == 1;
    }
    public void markedVisited(String vertex)
    {
        this.visited.add(vertex);
    }
    public ArrayList<String> getUnvistedReachableVertices(String from)
    {
        ArrayList<String> result = new ArrayList<>(); 
        int fromIndex = this.vertices.indexOf(from);
        
        for (int i = 0; i < this.vertices.size(); i++) {
            if(this.adjacencyMatrix[fromIndex][i] ==1)
            {
                int toIndex = i;
                String toVertice =this.vertices.get(toIndex);
                if(this.visited.indexOf(toVertice) ==-1)
                {
                    result.add(toVertice);
                }
            }
        }
        return result;
                
    }
    public ArrayList<String> depthFirstSearch(String from)
    {
        ArrayList<String> result = new ArrayList<>(); 
        result.add(from);
        this.markedVisited(from);
        result.addAll(this.getUnvistedReachableVertices(from));
        return result;
    }
}
