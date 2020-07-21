package ru.ali.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Swan.");
        songs.add("Symphony no.5.");
        songs.add("Shelkunchik.");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
