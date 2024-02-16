/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.stack;
import java.util.HashMap;
import java.util.Stack;
/**
 *
 * 
Step 1: If the scanned character is an operand, put it into postfix expression.
Step 2: If the scanned character is an operator and operator's stack is empty, push operator into operators' stack.
Step 3: If the operator's stack is not empty, there may be following possibilities.
   3.1 If the precedence of scanned operator is greater than the top most operator of operator's stack, push this operator into operator 's stack.
   3.2 If the precedence of scanned operator is less than the top most operator of operator's stack, pop the operators from operator's stack until we find     a low precedence operator than the scanned character.
    If the precedence of scanned operator is equal then check the associativity of the operator. If associativity left to right then pop the operators from stack until we find a low precedence operator. If associativity right to left then simply put into stack.
    If the scanned character is opening round bracket ( '(' ), push it into operator's stack.
    If the scanned character is closing round bracket ( ')' ), pop out operators from operator's stack until we find an opening bracket ('(' ).
    Repeat Step 1,2 and 3 till expression has character
Step 4: Now pop out all the remaining operators from the operator's stack and push into postfix expression.
Step 5: Exit

 */
public class PostixTransformer {
    static HashMap<Character,Integer> precedence = new HashMap<Character,Integer>();
    
    static
    {
        precedence.put('+',1);
        precedence.put('-',1);
        precedence.put('*',2);
        precedence.put('/',2);
    }
    public static String transform(String infix)
    {
        String postFix= "";
        Stack<Character> opStack = new Stack<Character>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            
            //Step 1
            if( isOperand(ch))
            {
                postFix+=ch;
            }
            else if(isOperator(ch))
            {
                //Step 2
                if(  opStack.isEmpty())
                {
                    opStack.push(ch);
                }
                else //stack not empty
                {
                    //step 3
                    // 3.1
                    if(isGreaterThan(ch, opStack.peek()))
                    {
                        opStack.push(ch);
                    }
                    //3.2
                    /*
                    If the precedence of scanned operator is less than the top most operator of operator's stack, 
                        pop the operators from operator's stack until we find a low precedence operator than the scanned character.
                    */
                    //scanned < opStack top
                    else if(isLessThan(ch, opStack.peek()))
                    {
                        // pop the operators from operator's stack until we find a low precedence operator than the scanned character.
                        while( !opStack.isEmpty() &&  (!isLessThan(opStack.peek(), ch)))
                        {
                            postFix+=opStack.pop();
                            
                        }
                        //stack empty
                        opStack.push(ch);
                    }
                    //3.3
                    else if(isEqual(ch, opStack.peek()))//equal case
                    {
                        System.out.println("Equal case");
                        while( !opStack.isEmpty() &&  (!isLessThan(opStack.peek(), ch)))
                        {
                            postFix+=opStack.pop();
                            
                        }
                        //stack empty
                        opStack.push(ch);
                    }
                }
            }
            
            
            
        }
        //Step 4
        while( !opStack.isEmpty())
        {
            postFix += opStack.pop();
        }
        return postFix;
    }
    static boolean isOperand(char ch)
    {
        return Character.isLetter(ch);
    }
    static boolean isOperator(char ch)
    {
        return ch=='+' || ch=='-' || ch=='*' || ch=='/';
    }
    static boolean isGreaterThan(char op1,char op2)
    {
        return precedence.get(op1) > precedence.get(op2);
    }
    static boolean isLessThan(char op1,char op2)
    {
        return precedence.get(op1) < precedence.get(op2);
    }
    static boolean isEqual(char op1,char op2)
    {
        return precedence.get(op1).equals(precedence.get(op2));
    }
}
