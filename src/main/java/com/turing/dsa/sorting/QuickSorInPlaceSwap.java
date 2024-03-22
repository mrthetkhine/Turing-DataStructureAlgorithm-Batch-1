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
public class QuickSorInPlaceSwap implements Sortable{

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
            
            int left = startIndex;
            int right = endIndex;
            
            while(left<=right)
            {
                while(arr[left]<pivot)
                {
                    left++;
                }
                while(arr[right]>pivot)
                {
                    right--;
                }
                if(left<=right)
                {
                    //swap
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right]= temp;
                    left ++;
                    right --;
                }
            }
            quickSort(arr,startIndex,right);
            quickSort(arr,left,endIndex);
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
