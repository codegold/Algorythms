package ru.ali.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//    private JazzMusic jazzMusic;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("jazzMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
//
//    public MusicPlayer(@Qualifier("jazzMusic") Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    //    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//        this.jazzMusic = jazzMusic;
//    }

//
//    @Autowired
//    public MusicPlayer(@Qualifier("rockMusic")Music music) {
//        this.music = music;
//    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic() {
        //return "Playing: " + classicalMusic.getSong() + " '+' " + jazzMusic.getSong();
        return "Playing: " + music1.getSong() + " , " + music2.getSong();
    }
//    ArrayList<Music> musicList = new ArrayList<>();
//
//    public String getName() {
//        return name;
//    }
//
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

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer() {
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
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
