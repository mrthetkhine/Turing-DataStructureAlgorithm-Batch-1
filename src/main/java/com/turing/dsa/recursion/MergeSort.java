/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion;

import com.turing.dsa.sorting.Sortable;
import com.turing.dsa.sorting.Util;

/**
 *
 * @author macbook
 */
public class MergeSort implements Sortable{

    @Override
    public void sort(int[] arr) {
        mergeSort(arr,0,arr.length-1);
    }
    void mergeSort(int[]arr,int startIndex,int endIndex)
    {
        if(startIndex<endIndex)
        {
            //split
            
            int middle = (startIndex + endIndex)/2;
            mergeSort(arr,startIndex,middle);
            mergeSort(arr,middle+1,endIndex);
            
            //merge
            int i = startIndex;
            int j = middle+1;
            
            int currentIndex = 0;
            int size = endIndex -startIndex+1;
            int []mergedArr = new int[size];
            while( i<=middle && j<=endIndex)
            {
                if(arr[i]< arr[j])
                {
                    mergedArr[currentIndex] = arr[i];
                    i++;
                }
                else
                {
                    mergedArr[currentIndex] = arr[j];
                    j++;
                }
                currentIndex ++;
            }
            while(i<=middle)
            {
                mergedArr[currentIndex++] = arr[i++];
            }
            while(j<=endIndex)
            {
                mergedArr[currentIndex++] = arr[j++];
            }
            //copied mergeArray into original array
           
            System.arraycopy(mergedArr, 0, arr, startIndex, size);
            
        }
        
    }
    public static void main(String[] args) {
       int arr[] = new int[]{8,3};
       //Util.print("Arr ",arr);
       Sortable algo = new MergeSort();
       algo.sort(arr);
    }
}
