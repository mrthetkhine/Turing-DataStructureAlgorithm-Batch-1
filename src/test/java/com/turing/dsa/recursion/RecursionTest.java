/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class RecursionTest {
    @Test
    public void test()
    {
        int result = Factorial.factorial(3);
        assertEquals(result,6);
        
        result = Factorial.factorial(4);
        assertEquals(result,24);
    }
}
