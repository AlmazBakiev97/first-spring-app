package ru.bakiev.myspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(SongsGenre.CLASSICAL);
        musicPlayer.playMusic(SongsGenre.ROCK);
        musicPlayer.playMusic(SongsGenre.HIPHOP);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        System.out.println(musicPlayer == musicPlayer2);

        context.close();
    }
}
