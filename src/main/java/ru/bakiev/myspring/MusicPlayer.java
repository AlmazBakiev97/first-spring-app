package ru.bakiev.myspring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    private static int count;

    public MusicPlayer() {
    }

    // Inversion of control
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music m : musicList) {
            System.out.println(m.getSong());
        }
    }

    public void init() {
        System.out.println("init " + count);
        count++;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
