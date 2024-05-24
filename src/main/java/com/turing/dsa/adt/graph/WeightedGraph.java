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
    List<String> getVisitedVertices()
    {
        List<String> result = new ArrayList<>();
        for(Edge edge :this.visitedEdge)
        {
            String from = edge.getFrom();
            String to = edge.getTo();
            if(!result.contains(from))
            {
                result.add(from);
            }
            if(!result.contains(to))
            {
                result.add(to);
            }
        }
        return result;
    }
    public boolean canCreateCicyle(Edge edge)
    {
        String from = edge.getFrom();
        String to = edge.getTo();
        
        List<String> visitedVertices = this.getVisitedVertices();
        return visitedVertices.contains(from) && visitedVertices.contains(to);
    }
    public List<Edge> getNonCyclicRechableEdgeFromVisitedVertices()
    {
        List<String> visitedVertices = this.getVisitedVertices();
        List<Edge> result = new ArrayList<>();
        
        for(String vertice: visitedVertices)
        {
             List<Edge> rechableEdges = this.getEdgeRechableFromVertice(vertice);
             
             for(Edge edge : rechableEdges)
             {
                 if(!this.canCreateCicyle(edge))
                 {
                     result.add(edge);
                 }
             }
        }
        return result;
    }
    public List<Edge> primMst(String from)
    {
        
        String vertice = from;
        List<Edge> rechableEdges = this.getEdgeRechableFromVertice(vertice);
        Edge minEdge = WeightedGraph.getMinWeightEdge(rechableEdges);
        this.markedVisited(minEdge);
        
        while(this.getVisitedVertices().size() != this.vertices.size())
        {
            rechableEdges = this.getNonCyclicRechableEdgeFromVisitedVertices();
            minEdge = WeightedGraph.getMinWeightEdge(rechableEdges);
            this.markedVisited(minEdge);
        }
        
        return this.visitedEdge;
    }
    List<Edge> getConnectableNonCyclicEdges()
    {
        List<Edge> result = new ArrayList<>();
        if(this.visitedEdge.size()==0)
        {
            for(Edge edge : this.edges)
            {
               result.add(edge);
            }
        }
        else
        {
            result = this.getNonCyclicRechableEdgeFromVisitedVertices();
        }
        return result;
    }
    public List<Edge> krusalMst()
    {
        List<Edge> rechableEdges = this.getConnectableNonCyclicEdges();
        Edge minEdge = WeightedGraph.getMinWeightEdge(rechableEdges);
        this.markedVisited(minEdge);
        while(this.getVisitedVertices().size() != this.vertices.size())
        {
            rechableEdges = this.getConnectableNonCyclicEdges();
            minEdge = WeightedGraph.getMinWeightEdge(rechableEdges);
            this.markedVisited(minEdge);
        }
        return this.visitedEdge;
    }
    public List<String> getNoSuccessorVertices()
    {
        List<String> result = new ArrayList<String>();
        for (String vertice: this.vertices) {
            boolean notInFromPos = true;
            for(Edge edge : this.edges)
            {
                notInFromPos = notInFromPos && !edge.getFrom().equals(vertice);
            }
            if(notInFromPos)
            {
                result.add(vertice);
            }
        }
        return result;
    }
    public void deleteEdgeForVertices(List<String> verticesToDelete)
    {
        for(String vertice:verticesToDelete)
        {
            this.vertices.remove(vertice);
            List<Edge> edgesToDelete = getEdgeToDeleteForVertice(vertice);
            for(Edge edge: edgesToDelete)
            {
                this.edges.remove(edge);
            }
        }
        
    }

    List<Edge> getEdgeToDeleteForVertice(String vertice) {
        List<Edge> edgesToDelete = new ArrayList<>();
        
        for (Edge edge: this.edges) {
            if(edge.getTo().equals(vertice))
            {
                edgesToDelete.add(edge);
            }
        }
        return edgesToDelete;
    }
    public List<String> getTopologicalSort()
    {
        List<String> result = new ArrayList<String>();
        int orgSize = this.vertices.size();
        while(result.size() != orgSize)
        {
            List<String> verticesWithNosuccessor = getNoSuccessorVertices();
            
            for (String vertice: verticesWithNosuccessor) {
                System.out.println("Vertice "+vertice);
            }
            result.addAll(verticesWithNosuccessor);
            deleteEdgeForVertices(verticesWithNosuccessor);
            //System.out.println("Loop");
        }
        return result;
    }
}
