package ru.ali.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Battery.");
        songs.add("Nothing else matters.");
        songs.add("Peremen.");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
