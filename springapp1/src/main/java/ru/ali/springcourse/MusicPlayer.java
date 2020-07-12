package ru.ali.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
//    ArrayList<Music> musicList = new ArrayList<>();
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    private String name;
//    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

//    public MusicPlayer() {
//    }

    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

//    public void setMusicList(ArrayList<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public void playMusicList() {
//        for (Music music : musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }
}
