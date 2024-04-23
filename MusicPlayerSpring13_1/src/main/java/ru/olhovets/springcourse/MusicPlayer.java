package ru.olhovets.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(){

        Random rnd = new Random();
        int number = rnd.nextInt(musicList.size());

        String music = musicList.get(number).getSong();

        return "Playing " + music;
    }
}
