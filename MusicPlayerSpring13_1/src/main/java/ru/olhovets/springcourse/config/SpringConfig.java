package ru.olhovets.springcourse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.olhovets.springcourse.*;
import ru.olhovets.springcourse.genres.ClassicalMusic;
import ru.olhovets.springcourse.genres.JazzMusic;
import ru.olhovets.springcourse.genres.RockMusic;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        List<Music> list = new ArrayList<>();

        list.add(rockMusic());
        list.add(classicalMusic());
        list.add(jazzMusic());

        return list;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
