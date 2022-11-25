package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineEatMeatTests {
    Feline feline = new Feline();

    @Test
    public void eatMeatReturnFelineFood() {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = null;
        try {
            actualList = feline.eatMeat();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(expectedList, actualList);
    }
}
