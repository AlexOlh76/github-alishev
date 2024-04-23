package ru.olhovets.springcourse.genres;

import ru.olhovets.springcourse.Music;

public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Only you";
    }
}
