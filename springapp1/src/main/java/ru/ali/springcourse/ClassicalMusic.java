package ru.ali.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
//    private ClassicalMusic classicalMusic;
//
//    private ClassicalMusic(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }
//
//    public void doMyInit() {
//        System.out.println("Doing my initialization");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody.";
    }
}
