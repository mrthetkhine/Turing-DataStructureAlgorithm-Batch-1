/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

/**
 *
 * @author macbook
 */
public class Human implements Comparable<Human>{
    String name;
    int age;
    public Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Human another) {
        //Human another = (Human)o;
        return this.age - another.age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }
    
}
