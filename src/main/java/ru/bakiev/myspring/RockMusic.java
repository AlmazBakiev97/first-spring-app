package ru.bakiev.myspring;

import org.springframework.stereotype.Component;

import java.util.List;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("First rock music");
        songs.add("Second rock music");
        songs.add("Third rock music");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
