package com.example.catTests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTestGetFood {
    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {
        List<String> mockFoodList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(mockFoodList);
        Cat cat = new Cat(feline);
        List<String> actualList = cat.getFood();

        assertEquals(actualList, mockFoodList);
    }
}
