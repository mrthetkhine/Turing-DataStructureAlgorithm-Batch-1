/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.adt.stack;

/**
 *
 * @author macbook
 */
public class StackUnderflowException extends RuntimeException{
    public StackUnderflowException(String message)
    {
        super(message);
    }
}
