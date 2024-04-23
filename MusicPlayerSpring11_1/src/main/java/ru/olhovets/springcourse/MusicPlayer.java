package ru.olhovets.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music1;

    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;

//    public MusicPlayer() {
//
//    }

    public String playMusic(Genre genre){
        Random rnd = new Random();
        int number = rnd.nextInt(3);
        String song = null;

        switch (genre){
            case ROCK:
                song =  "Playing " + music1.getSong(number);
                break;
            case CLASSICAL:
                song =  "Playing " + music2.getSong(number);
                break;
        }
        return song;
    }
}
