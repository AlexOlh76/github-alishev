package ru.olhovets.springcourse.genres;

import ru.olhovets.springcourse.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
