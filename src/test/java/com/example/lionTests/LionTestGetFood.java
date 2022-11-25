package com.example.lionTests;

import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTestGetFood {
    @Mock
    Feline predator;
    @Test
    public void getFoodReturnPredatorList() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedList);
        Lion lion = new Lion("Самец",predator);
        List<String> actualList = lion.getFood();

        assertEquals(actualList, expectedList);

    }
}
