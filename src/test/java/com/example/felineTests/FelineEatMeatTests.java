package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class FelineEatMeatTests {
    Feline feline = new Feline();
    @Test
    public void eatMeatReturnPredatorFood() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, feline.eatMeat());
    }
}
