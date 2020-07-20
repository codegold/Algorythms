package ru.ali.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music1 = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        ArrayList<String> rockList = new ArrayList<>();
        rockList.add("Battery.");
        rockList.add("Nothing else matters.");
        rockList.add("Peremen.");

        ArrayList<String> classicList = new ArrayList<>();
        classicList.add("Swan.");
        classicList.add("Symphony no.5.");
        classicList.add("Shelkunchik.");



        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
        context.close();
    }
}

