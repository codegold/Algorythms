package ru.ali.springsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    List<Music> genreList = new LinkedList<>();

//    {
//        genreList.add("rockMusic");
//        genreList.add("classicMusic");
//        genreList.add("jazzMusic");
//    }

    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public String playMusic() {
        Random random = new Random();
        return genreList.get(random.nextInt(genreList.size())).getSong();
    }

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;

    //@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("jazzMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


//    ArrayList<Music> musicList = new ArrayList<>();
}
