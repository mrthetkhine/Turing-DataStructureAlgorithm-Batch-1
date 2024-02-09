/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

/**
 *
 * @author macbook
 */
public class InsertionSort implements Sortable{

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j= i;
            while (j>0 && arr[j-1]>arr[j])
            {
                //swap
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1] = temp;
                
                j--;
            }
            Util.print("Iteration "+i+" ", arr);
        }
    }
    
}
