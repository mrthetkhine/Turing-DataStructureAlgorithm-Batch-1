/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
/**
 *
 * @author macbook
 */
public class DelimiterMatcher {
    String input;

    Stack<Character> stack;
    Map<Character,Character> pair;
    public DelimiterMatcher(String input) {
        
        this.stack = new Stack<Character>();
        this.pair = new HashMap<Character,Character>();
        this.input = input;
        
        this.init();
        
    }
    void init()
    {
        this.pair.put('[',']');
        this.pair.put('{','}');
        this.pair.put('(',')');
        this.pair.put('<','>');
    }
    Character getClosing(Character opening)
    {
        return this.pair.get(opening);
    }
    public boolean isValid()
    {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            if(this.isOpening(currentChar))
            {
                System.out.println("Push into stack "+currentChar);
                this.stack.push(currentChar);
            }
            if(this.isClosing(currentChar))
            {
                if(this.stack.isEmpty())
                {
                    return false;
                }
                
                char openingChar = this.stack.pop();
                System.out.println("Pop opening char "+openingChar+  "Current "+currentChar);
                if(isProperlyMatch(openingChar, currentChar))
                {
                    return false;
                }
                
            }
        }
        
        return this.stack.isEmpty();
    }

    public boolean isProperlyMatch(char openingChar, char closingChar) {
        char closing = this.getClosing(openingChar);
        System.out.println("Closing "+closing);
        if (closing != closingChar) {
            return true;
        }
        return false;
    }
    //<>
    boolean isOpening(char ch)
    {
        return this.pair.keySet().contains(ch); 
    }
    boolean isClosing(char ch)
    {
        return this.pair.values().contains(ch);
    }
    
}
