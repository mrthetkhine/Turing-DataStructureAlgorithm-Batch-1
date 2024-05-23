/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class WeightedGraph extends Graph {
    ArrayList<Edge> edges = new ArrayList<Edge>();
    ArrayList<Edge> visitedEdge = new ArrayList<Edge>();
    public WeightedGraph()
    {
        super();
    }
    public void addEdge(String from, String to,int weight)
    {
        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);
        this.adjacencyMatrix[fromIndex][toIndex]= weight;
        
        Edge edge =new Edge(from,to,weight);
        this.edges.add(edge);
    }
    boolean isEdgeExist(String from, String to )
    {
        int fromIndex = this.vertices.indexOf(from);
        int toIndex = this.vertices.indexOf(to);
        return this.adjacencyMatrix[fromIndex][toIndex] != 0;
    }
    public void markedVisited(Edge edge)
    {
        this.visitedEdge.add(edge);
    }
    public List<Edge> getEdgeRechableFromVertice(String from)
    {
        List<Edge> result = new ArrayList<>();
        for(Edge edge: this.edges)
        {
            if(edge.from.equals(from))
            {
                result.add(edge);
            }
        }
        return result;
    }
    public static Edge getMinWeightEdge(List<Edge> edges)
    {
        edges.sort((a,b)->a.getWeight()-b.getWeight());
        return edges.get(0);
    }
    public boolean canCreateCicyle(Edge edge)
    {
        return true;
    }
}
