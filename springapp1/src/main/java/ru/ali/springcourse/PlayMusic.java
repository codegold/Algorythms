package ru.ali.springcourse;

public class PlayMusic {
    private Music music;

    public PlayMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
