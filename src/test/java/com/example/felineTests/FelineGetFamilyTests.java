package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.*;

public class FelineGetFamilyTests {

    Feline feline = new Feline();
    @Test
    public void getFamilyTest() {

        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(actual, expected);
    }


}