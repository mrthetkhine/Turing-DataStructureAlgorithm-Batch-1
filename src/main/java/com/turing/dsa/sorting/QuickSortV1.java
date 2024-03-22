/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class QuickSortV1 implements Sortable{

    @Override
    public void sort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }
    void quickSort(int []arr,int startIndex,int endIndex)
    {
        int size = endIndex-startIndex +1;
        
        
        if(size>=3)
        {
            //divide
            int pivot = arr[endIndex];
            
            //two list 
            List<Integer> leftSide = new ArrayList<Integer>();
            List<Integer> rightSide = new ArrayList<Integer>();
            for (int i = startIndex; i < endIndex; i++) {
                if(arr[i]<=pivot)
                {
                    leftSide.add(arr[i]);
                }
                else
                {
                    rightSide.add(arr[i]);
                }
            }
            //copied back
            int index = startIndex;
            for (Integer left:leftSide) {
                arr[index++] = left;
            }
            int pivotIndex = index;
            arr[index++] = pivot;
            for (Integer right:rightSide) {
                arr[index++] = right;
            }
            quickSort(arr,startIndex,pivotIndex-1);
            quickSort(arr,pivotIndex+1,endIndex);
        }
        else
        {
            //base case
            if(size ==2)
            {
                if( arr[startIndex]> arr[endIndex])
                {
                    //swap
                    int temp = arr[startIndex];
                    arr[startIndex] = arr[endIndex];
                    arr[endIndex] = temp;
                }
            }
        }
    }
}
