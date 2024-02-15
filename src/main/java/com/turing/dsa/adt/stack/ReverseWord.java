/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.stack;
import java.util.Stack;
/**
 *
 * @author macbook
 */
public class ReverseWord {
    public static void main(String[] args) {
        String data = "Hello";
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < data.length(); i++) {
            stack.push(data.charAt(i));
        }
        String reversed= "";
        while(!stack.isEmpty())
        {
            reversed+= stack.pop();
        }
        System.out.println("Reversed "+reversed);
    }
}
