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
        int fromIndex = getVerticeIndex(from);
        int toIndex = getVerticeIndex(to);
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
        System.out.println("Rechableedge "+rechableEdges.size());
        for (Edge edge : rechableEdges) {
            if(!this.visited.contains(edge.to))
            {
                result.add(edge);
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
        int verticeIndex = getVerticeIndex(startVertice);
        this.totalDistance[verticeIndex] = 0;
    }
   void updateDistacnce(Edge edge,String vertice)
   {
       int previousIndex = getVerticeIndex(vertice); 
       int preWeight = this.totalDistance[previousIndex];
       int weight = edge.getWeight();
       int toIndex = getVerticeIndex(edge.to);
       if(this.totalDistance[toIndex] > weight + preWeight)
       {
           this.totalDistance[toIndex] = weight + preWeight;
           this.previous[toIndex] = vertice;
       }
   }
   public List<Tuple<String,Integer>> getRecahbleUnvisitedVertice(String v)
   {
       List<Tuple<String,Integer>> result = new ArrayList<>();
       List<Edge> unvisitedEdges = this.getEdgeRechableUnvisitedFromVertice(v);
       //System.out.println("UnvisitedEdge length "+unvisitedEdges.size());
       List<String> unvisitedVertices =new ArrayList<>();
       for(Edge edge : unvisitedEdges)
       {
           //System.out.println("Edge "+edge);
           String to = edge.to;
           if(!unvisitedVertices.contains(to))
           {
               unvisitedVertices.add(to);
               Tuple<String,Integer> tuple= new Tuple<>(to,edge.weight);
               result.add(tuple);
               
           }
       }
       return result;
       
   }
   String getVerticeWithSmallestWeight()
   {
       String vertice = null;
       int smallestWeight = Integer.MAX_VALUE;
       for (String un : this.getUnvisitedVertices()) {
           int verticeIndex = this.getVerticeIndex(un);
           int weight = this.totalDistance[verticeIndex];
           
           if(weight < smallestWeight)
           {
               smallestWeight = weight;
               vertice = un;
           }
       }
       return vertice;
   }
   int getVerticeIndex(String vertice) {
        return this.vertices.indexOf(vertice);
   }
   public void dikstraAlgorithm(String startVertice)
   {
       
       this.initDistance(startVertice);
      
       int n = this.vertices.size();
       String vertice = startVertice;
       int accumulativeDistance =0;
       while( this.visited.size() != n )
       {
           
           System.out.println("Visit vertice "+vertice);
           this.markedVisited(vertice);
           List<Tuple<String,Integer>> rechableVertices = this.getRecahbleUnvisitedVertice(vertice);
           String from = vertice;
           if(rechableVertices.size() > 0)
           {
               for(Tuple<String,Integer> verticesAndWeight : rechableVertices)
                {
                    String v = verticesAndWeight.getFirst();
                    int weight = verticesAndWeight.getSecond();
                    int verticeIndex = this.getVerticeIndex(v);
                    //System.out.println("Accumulative "+ accumulativeDistance + " "+v+  " weight "+weight);
                    //System.out.println("Reachable vertice "+v +" old "+this.totalDistance[verticeIndex] + " new "+(accumulativeDistance+weight));
                    if(this.totalDistance[verticeIndex] > (accumulativeDistance+weight))
                    {
                        
                        this.totalDistance[verticeIndex] = accumulativeDistance+weight;
                        this.previous[verticeIndex] = vertice;
                        //System.out.println("Update "+v +" previous "+vertice+ " weight "+this.totalDistance[verticeIndex]);
                    }
                    
                }
               vertice = this.getVerticeWithSmallestWeight();
           }
           else 
           {
               List<String> unvisitedVertices = this.getUnvisitedVertices();
               for(String v : unvisitedVertices)
               {
                   this.markedVisited(v);
               }
           }
           accumulativeDistance += this.getDistance(from, vertice);
       }
   }
   String getPreviousOf(String vertice)
   {
       int index = this.getVerticeIndex(vertice);
       return this.previous[index];
   }
   public List<String> getShortestPath(String from,String to)
   {
       List<String> paths = new ArrayList<>();
       this.dikstraAlgorithm(from);
       
       String prev = this.getPreviousOf(to);
       paths.add(to);
       while(!prev.equals(from)) 
       {
           paths.add(prev);
           prev = this.getPreviousOf(prev);
       }
       paths.add(prev);
       
       List<String> result = new ArrayList<String>();
       while(paths.size()>0)
       {
           result.add(paths.get(paths.size()-1));
           paths.remove(paths.size()-1);
       }
       return result;
   }
   int getDistance(String from,String to)
   {
       int fromIndex= this.getVerticeIndex(from);
       int toIndex = this.getVerticeIndex(to);
       return this.adjacencyMatrix[fromIndex][toIndex];
   }
    
    
}
