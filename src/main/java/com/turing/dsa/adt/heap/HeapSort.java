/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.heap;

import com.turing.dsa.sorting.Sortable;

/**
 *
 * @author macbook
 */
public class HeapSort implements Sortable{

    void heapfiy(int arr[], int n,int index)
    {
        System.out.println("Heapify index "+index);
        //n -array size
        //array
        int largest = index;
        int left = 2*index+1;
        int right = 2*index+2;
        
        if( left < n && arr[index]< arr[left])
        {
            //System.out.println("Left is bigger");
            largest = left;
        }
        if(right <n && arr[largest] < arr[right])
        {
            //System.out.println("Right is bigger");
            largest = right;
        }
        System.out.println("Heapify largest "+largest);
        if(largest !=index)
        {
            
            //swap
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
         
            this.heapfiy(arr,n,largest);
        }
    }
    /*
        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
          swap(&arr[0], &arr[i]);

          // Heapify root element to get highest element at root again
          heapify(arr, i, 0);
        }
    */
    @Override
    public void sort(int[] arr) {
        //build heap
        int n = arr.length;
        for (int i = n/2-1; i >=0; i--) {
            this.heapfiy(arr,n,i);
        }
        //sort
        for (int i = n-1; i >-0; i--) {
            //swap
            int temp = arr[i];//root
            arr[i] = arr[0];//last element<-root
            arr[0] = temp;
            this.heapfiy(arr,i,0);
        }
    }
    
}
