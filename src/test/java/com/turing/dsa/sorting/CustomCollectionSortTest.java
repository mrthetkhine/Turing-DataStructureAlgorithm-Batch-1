/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class CustomCollectionSortTest {
    @Test
    public void test()
    {
        List<Human> list = new ArrayList<Human>();
        list.add(new Human("One",10));
        list.add(new Human("Two",5));
        list.add(new Human("Three",30));
        list.add(new Human("Four",2));
        
        Collections.sort(list);
        
        list.forEach(System.out::println);
    }
    
}
