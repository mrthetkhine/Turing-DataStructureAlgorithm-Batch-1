/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.stack;

import com.turing.dsa.adt.stack.DelimiterMatcher;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class TestDelimiter {
    
    @Test
    public void testSimpleCase()
    {
        DelimiterMatcher matcher = new DelimiterMatcher("c[d]");
        
        assertEquals(true,matcher.isValid());
    }
    @Test
    public void testSimpleCaseNegatgive1()
    {
        DelimiterMatcher matcher = new DelimiterMatcher("c[d");
        
        assertEquals(false,matcher.isValid());
    }
    @Test
    public void testSimpleCaseNegatgive2()
    {
        DelimiterMatcher matcher = new DelimiterMatcher("cd]");
        
        assertEquals(false,matcher.isValid());
    }
}
