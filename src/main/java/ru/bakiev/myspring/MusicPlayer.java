package ru.bakiev.myspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private HipHopMusic hipHopMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, HipHopMusic hipHopMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.hipHopMusic = hipHopMusic;
    }

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

    public void playMusic(SongsGenre songGenre) {
        Random random = new Random();
        int randomSong = random.nextInt(3);
        switch (songGenre) {
            case ROCK:
                System.out.println(rockMusic.getSongs().get(randomSong));
                break;
            case CLASSICAL:
                System.out.println(classicalMusic.getSongs().get(randomSong));
                break;
            case HIPHOP:
                System.out.println(hipHopMusic.getSongs().get(randomSong));
                break;
        }
    }
}
