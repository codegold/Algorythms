package ru.ali.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private JazzMusic jazzMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public void playMusic(EnumMusic enumMusic) {
        Random random = new Random();

        int randomTrack = random.nextInt(3);

        if (enumMusic == EnumMusic.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomTrack));
        } else if (enumMusic == EnumMusic.ROCK){
            System.out.println(rockMusic.getSongs().get(randomTrack));
        } else {
            System.out.println(jazzMusic.getSongs().get(randomTrack));

        }
    }
}
