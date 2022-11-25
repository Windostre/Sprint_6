package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.*;

public class FelineGetFamilyTests {
    
    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(actual, expected);
    }


}