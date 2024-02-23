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
Step 1 : Scan the Infix Expression from left to right.
Step 2 : If the scanned character is an operand,
         append it with final Infix to Postfix string.
Step 3 : Else,//operator
    Step 3.1 : If the precedence order of the scanned(incoming) operator is greater than the precedence order of the operator in the stack 
        (or the stack is empty or the stack contains a ‘(‘ or ‘[‘ or ‘{‘), push it on stack.
    Step 3.2 : Else, Pop all the operators from the stack which are greater than or equal to in precedence than that of the scanned operator. After doing that Push the scanned operator to the stack. (If you encounter parenthesis while popping then stop there and push the scanned operator in the stack.)
Step 4 : If the scanned character is an ‘(‘ or ‘[‘ or ‘{‘, push it to the stack.
Step 5 : If the scanned character is an ‘)’or ‘]’ or ‘}’, pop the stack and and output it until a ‘(‘ or ‘[‘ or ‘{‘ respectively is encountered, and discard both the parenthesis.
Step 6 : Repeat steps 2-6 until infix expression is scanned.
Step 7 : Print the output
Step 8 : Pop and output from the stack until it is not empty.

 */
public class PostixTransformer {
    static HashMap<Character,Integer> precedence = new HashMap<Character,Integer>();
    
    static
    {
        precedence.put('+',1);
        precedence.put('-',1);
        precedence.put('*',2);
        precedence.put('/',2);
        //precedence.put('(',3);
        //precedence.put(')',3);
    }
    public static String transform(String infix)
    {
        String postFix= "";
        Stack<Character> opStack = new Stack<Character>();
        for (int i = 0; i < infix.length(); i++) {
            char scannedChar = infix.charAt(i);
            System.out.println("Scanned operator "+scannedChar + " stack  "+opStack);
            //Step 1
            if( isOperand(scannedChar))
            {
                postFix+=scannedChar;
            }
            //Step 3
            else if(isOperator(scannedChar) )
            {
                
                if(opStack.isEmpty()) 
                {
                    System.out.println("Step 3.1 ");
                    opStack.push(scannedChar);
                }
                else
                {
                    if(isGreaterThan(scannedChar, opStack.peek()) )
                    {
                        System.out.println("Greater than stack top push "+scannedChar);
                        opStack.push(scannedChar);
                    }
                    else if(isLessThan(scannedChar, opStack.peek()) || isEqual(scannedChar, opStack.peek()))
                    {
                        System.out.println("Less than or equal pop");
                        while(!opStack.empty() && !isLessThan(opStack.peek(), scannedChar))
                        {
                            char ch = opStack.pop();
                            System.out.println("Pop" +ch);
                            if(ch!='(')
                            {
                                postFix+=ch;
                            }
                            else
                            {
                                opStack.push('(');
                                break;
                            }
                            

                        }
                            //stack empty
                        opStack.push(scannedChar);
                    }
                    else if(opStack.contains('('))
                    {
                        System.out.println("Contain ("+" push "+scannedChar);
                        opStack.push(scannedChar);
                    }
                    
                }
                
                      
                 
            }
            //Step 4
            else if(scannedChar=='(')
            {
                System.out.println("Step 4 push ( onto stack");
                opStack.push(scannedChar);
            }
            //step 5
            else if(scannedChar==')')
            {   
                //Pop
                while(!opStack.isEmpty() && opStack.peek()!='(')
                {
                    char op = opStack.pop();
                    if(op != '(' || op!=')')
                    {
                        postFix += op;
                    }
                    
                }
                if(!opStack.isEmpty()&& opStack.peek()=='(')
                {
                    opStack.pop();
                }
              
            }
        }
        //Step 4
        while( !opStack.isEmpty())
        {
            char op = opStack.pop();
            if(op != '(' || op!=')')
            {
                postFix += op;
            }
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
        try
        {
            return precedence.get(op1) > precedence.get(op2);
        }
        catch(Exception e)
        {
            return false;
        }
       
    }
    static boolean isLessThan(char op1,char op2)
    {
        try
        {
            return precedence.get(op1) < precedence.get(op2);
        }
        catch(Exception e)
        {
            return false;
        }
    }
    static boolean isEqual(char op1,char op2)
    {
        try
        {
            return precedence.get(op1).equals(precedence.get(op2));
        }
        catch(Exception e)
        {
            return false;
        }
        
    }
    public static void main(String[] args) {
        String output = PostixTransformer.transform("a+(b*c+d)/e");
        //ab+c*
        System.out.println("Output "+output);
    }
}
