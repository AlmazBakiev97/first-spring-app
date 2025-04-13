package ru.bakiev.myspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HipHopMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("First hiphop music");
        songs.add("Second hiphop music");
        songs.add("Third hiphop music");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
