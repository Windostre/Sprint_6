package com.example.alexTest;

import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;


    @Test
    public void getPlaceOfLiving() throws Exception {
        Alex alex = new Alex(feline);
        String expectedText = "Нью-Йоркский зоопарк";
        assertEquals(expectedText, alex.getPlaceOfLiving());

    }

    @Test
    public void friendsNames() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedList = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedList, alex.friendsNames());
    }

    @Test
    public void getKittens() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
    }
    @Test
    public void hasMaleReturnTrue() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(alex.doesHaveMane(), true);

    }
}