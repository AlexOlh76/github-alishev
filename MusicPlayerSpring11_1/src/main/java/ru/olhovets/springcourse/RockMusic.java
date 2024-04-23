package ru.olhovets.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong(int musicNumber) {
        ArrayList<String> rockSong = new ArrayList<>();
        rockSong.add("Wind cries Mary");
        rockSong.add("Wind of change");
        rockSong.add("Bohemian Rhapsody");
        return rockSong.get(musicNumber);
    }
}
