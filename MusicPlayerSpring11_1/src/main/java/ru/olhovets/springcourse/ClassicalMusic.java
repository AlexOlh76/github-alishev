package ru.olhovets.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music{

    @Override
    public String getSong(int musicNumber) {
        ArrayList<String> classicSong = new ArrayList<>();
            classicSong.add("Hungarian Rhapsody");
            classicSong.add("Токката и фуга ре-минор");
            classicSong.add("щелкунчик");
        return classicSong.get(musicNumber);
    }
}
