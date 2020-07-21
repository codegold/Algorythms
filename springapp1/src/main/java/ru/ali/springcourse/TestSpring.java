package ru.ali.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(EnumMusic.CLASSICAL);
        musicPlayer.playMusic(EnumMusic.ROCK);
        musicPlayer.playMusic(EnumMusic.JAZZ);

        context.close();
    }
}

