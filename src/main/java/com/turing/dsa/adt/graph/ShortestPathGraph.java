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
public class ShortestPathGraph extends WeightedGraph{
    public static int MAX= 20000;
    public ShortestPathGraph()
    {
        super();
    }
    public int[][] getAdjacencyMatrix()
    {
        return this.adjacencyMatrix;
    }
    public ArrayList<String> getAllVertices()
    {
        return this.vertices;
    }
    public void createAdjacencyMatrix()
    {
        
        this.adjacencyMatrix = new int[vertices.size()][vertices.size()];
        int n = this.vertices.size();
        for(int i=0;i<n;i++ )
        {
            for (int j = 0; j < n; j++) {
                if(i==j)
                {
                    this.adjacencyMatrix[i][j] = 0;
                }
                else
                {
                    this.adjacencyMatrix[i][j] = MAX;
                }
                
            }
        }
    }
    /*
    n = no of vertices
    A = matrix of dimension n*n
    for k = 1 to n
        for i = 1 to n
            for j = 1 to n
                Ak[i, j] = min (Ak-1[i, j], Ak-1[i, k] + Ak-1[k, j])
    return A
    */
    public int[][] warshallAlgorithm()
    {
        int n = this.vertices.size();
        int[][] matrix = cloneAdjacencyMatrix();
        for (int k = 0; k < n; k++) {//intermediate vertices
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i!=j)
                    {
                        if (matrix[i][k] + matrix[k][j] < matrix[i][j])
                        {
                            matrix[i][j] = matrix[i][k] + matrix[k][j];
                        }
                    }
                    
                        
                }
            }
        }
        return matrix;
    }
    
    int[][] cloneAdjacencyMatrix() {
        int matrix[][] = new int[vertices.size()][vertices.size()];
        int n = this.vertices.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                matrix[i][j] = this.adjacencyMatrix[i][j];
            }
        }
        return matrix;
    }
}
