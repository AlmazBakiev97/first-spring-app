package ru.bakiev.myspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("First classical song");
        songs.add("Second classical song");
        songs.add("Third classical song");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
