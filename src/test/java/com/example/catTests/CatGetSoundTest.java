package com.example.catTests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest {
    @Mock
    Feline feline;
    Cat cat = new Cat(feline);

    @Test
    public void getSoundReturnsCatSound() {
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(actual, expected);


    }
}