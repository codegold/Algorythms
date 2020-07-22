package ru.ali.springsource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.ali.springsource")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    //@Scope("prototype")
    ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    List<Music> genreList() {
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

    @Bean
    Computer computer() {
        return new Computer(musicPlayer());
    }
}

