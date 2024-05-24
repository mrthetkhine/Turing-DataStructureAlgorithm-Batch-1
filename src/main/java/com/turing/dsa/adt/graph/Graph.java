/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    public void createAdjacencyMatrix()
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
            if(this.adjacencyMatrix[fromIndex][i] != 0)
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
    public ArrayList<String> filterVisited(ArrayList<String> vertices)
    {
        ArrayList<String> result = new ArrayList<>();
        for(String vertice : vertices)
        {
            System.out.println("Check "+vertice);
            if(!this.visited.contains(vertice))
            {
                result.add(vertice);
            }
        }
        return result;
    }
    void show(String label, ArrayList<String> items)
    {
        for (String item:items) {
            System.out.println(label+" "+item);
        }
        
    }
    public ArrayList<String> getVisted()
    {
        return this.visited;
    }
    public ArrayList<String> depthFirstSearch(String from)
    {
        System.out.println("Visited "+from);
        ArrayList<String> result = new ArrayList<>(); 
        if(!this.visited.contains(from))
        {
            result.add(from);
            this.markedVisited(from);

            ArrayList<String> unvistedVertices = this.getUnvistedReachableVertices(from);
            show("Reachable from "+from+"->",unvistedVertices );
            for (String unvisited: unvistedVertices) {
                if(!this.visited.contains(unvisited))
                {
                    ArrayList<String> res = filterVisited(depthFirstSearch(unvisited));
                    //System.out.println("Reachable vertices ");
                    for (String vertice: res) {
                        System.out.println("Reachable unvisited vertices "+vertice );
                    }
                    result.addAll(res);
                }
                
            }
            //result.addAll(this.getUnvistedReachableVertices(from));
            return result;
        }
        else
        {
            return result;
        }
    }
    public void dfsIterative(String from)
    {
        
        Stack<String> stack = new Stack<>();
        stack.push(from);
        while(!stack.isEmpty())
        {
            String element = stack.pop();
            System.out.println("Visit "+element);
            this.markedVisited(element);
            ArrayList<String> unvistedVertices = this.getUnvistedReachableVertices(element);
            show("Reachable from "+element+"->",unvistedVertices );
            for (int i = unvistedVertices.size()-1; i >=0; i--) {
                String vertice = unvistedVertices.get(i);
                if(!this.visited.contains(vertice))
                {
                    stack.push(vertice);

                }
            }
           
        }
        
    }
    public void breadthFirstSearch(String from)
    {
        Queue<String> queue = new LinkedList<>();
        
        queue.add(from);
        
        while(!queue.isEmpty())
        {
           
            String vertice = queue.remove();
            if(!this.visited.contains(vertice))
            {
                this.markedVisited(vertice);
            }
            
            ArrayList<String> neighbours = this.getUnvistedReachableVertices(vertice);
            for(String v : neighbours)
            {
                if(!this.visited.contains(v))
                {
                    queue.add(v);
                }
            }
        }
    }
}
