/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class RadixSort implements Sortable{

    @Override
    public void sort(int[] arr) {
        int radix = this.maxDigit(arr);
        
        for (int i = 0; i < radix; i++) {
            ArrayList<Integer> bucket[] = new ArrayList[10];
            
            //0-9
            for (int j = 0; j < 10; j++) {
                bucket[j] =new ArrayList<Integer>();
            }
            //Group element into bucket based on radix
            for(int element : arr)
            {
                int bucketIndex = bucketIndex(element,i);
                bucket[bucketIndex].add(element);
            }
            int index = 0;
            //copy all item from all bucket into array
            //System.out.println("Radix "+i);
            for (int j = 0; j < 10; j++) {
                //System.out.println("Bucket ==>"+j);
               for(int item: bucket[j])
               {
                   //System.out.println("Item "+item);
                   arr[index++] = item;
               }
               //System.out.println("");
            }          
            
        }
    }
    static int bucketIndex(int element,int index)
    {
        String str = String.valueOf(element);
        if(str.length()> index)//'12'->1
        {
            return Integer.valueOf(str.charAt(str.length()-1- index)+"");
        }
        return 0;
        
    }
    int maxDigit(int arr[])
    {
        int maxElement = this.max(arr);
        return String.valueOf(maxElement).length();
    }
    int max(int arr[])
    {
        if(arr.length==1)
        {
            return arr[0];
        }
        else
        {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>max)
                {
                    max = arr[i];
                }
            }
            return max;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,8,11,2,10};
        RadixSort algo = new RadixSort();
        algo.sort(arr);
    }
}
