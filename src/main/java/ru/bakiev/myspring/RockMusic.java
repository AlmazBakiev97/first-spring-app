package ru.bakiev.myspring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music";
    }
}
