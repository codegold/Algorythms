package ru.ali.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Jazz track 1");
        songs.add("Jazz track 2");
        songs.add("Jazz track 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
