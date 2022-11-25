package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetKittensTests {
    @Test
    public void getKittensArgumentNullReturns1() {
        Feline feline = new Feline();
        int expectedKittens = feline.getKittens();
        int actualKittens = 1;
        assertEquals("По умолчанию д.б.1 котенок", actualKittens, expectedKittens);
    }

    @Test
    public void getKittensArgument1lReturns1() {
        Feline feline = new Feline();
        int expectedKittens = feline.getKittens(1);
        int actualKittens = 1;
        assertEquals("Количество котят не равны", actualKittens, expectedKittens);
    }

    @Test
    public void getKittensArgument0lReturns0() {
        Feline feline = new Feline();
        int expectedKittens = feline.getKittens(0);
        int actualKittens = 0;
        assertEquals("Количество котят не равны", actualKittens, expectedKittens);
    }

    @Test
    public void getKittensArgumentMoreThan1lReturnsTheSame() {
        Feline feline = new Feline();
        int expectedKittens = feline.getKittens(5);
        int actualKittens = 5;
        assertEquals("Количество котят не равны", actualKittens, expectedKittens);
    }

    @Test
    public void getKittensArgumentLessThan1lReturnsError() {
        Feline feline = new Feline();
        int expectedKittens = feline.getKittens(-1);
        int actualKittens = 0;
        assertEquals("Количество котят не могут быть отрицательные", actualKittens, expectedKittens);
    }
}
