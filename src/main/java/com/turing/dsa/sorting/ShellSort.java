/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

/**
 *
 * @author macbook
 */
public class ShellSort implements Sortable{

    @Override
    public void sort(int[] arr) {
        int n =arr.length;
        int gap =(int) Math.floor(n/2.0);
        
        while( gap >= 1)
        {
            int temp;
            for (int i = gap; i < n; i += 1)
            {
                temp = arr[i];
                int j = i;
                //insertion sort of gap items.
                for (; (j >= gap) && (arr[j - gap] > temp); j -= gap)
                {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
                 
            }
            
            gap = (int)Math.floor(gap/2.0);
        }
    }
    
}
