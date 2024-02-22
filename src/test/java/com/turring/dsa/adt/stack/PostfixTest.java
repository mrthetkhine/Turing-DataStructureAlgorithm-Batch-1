/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turring.dsa.adt.stack;

import com.turing.dsa.adt.stack.PostixTransformer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author macbook
 */
public class PostfixTest {
    
    @Test
    public void testBaseCase()
    {
        assertEquals("ab+",PostixTransformer.transform("a+b"));
    }
    
    @Test
    public void testThreePoint1()
    {
        assertEquals("abc*+",PostixTransformer.transform("a+b*c"));
    }
    
    @Test
    public void testThreePoint2()
    {
        assertEquals("ab*c+",PostixTransformer.transform("a*b+c"));
    }
    
    @Test
    public void testThreePoint3()
    {
        assertEquals("ab-c+",PostixTransformer.transform("a-b+c"));
    }
    
    @Test
    public void testParaenthesis()
    {
        assertEquals("ab+c*",PostixTransformer.transform("(a+b)*c"));
    }
    @Test
    public void testParaenthesis2()
    {
        assertEquals("ab+cd/*",PostixTransformer.transform("(a+b)*(c/d)"));
    }
    @Test
    public void testParaenthesis3()
    {
        assertEquals("abc*d++e/",PostixTransformer.transform("a+(b*c+d)/e"));
    }
    
}
