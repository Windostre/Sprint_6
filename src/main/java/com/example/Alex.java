package com.example;

import java.util.List;

public class Alex extends Lion {

    String sex = "Самец";
    public Alex( Feline feline) throws Exception {
        super("Самец", feline);
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    public List<String> friendsNames () {
        return List.of("Марти", "Глория", "Мелман");
    }

    @Override
    public int getKittens() {
        return 0;

    }
}
