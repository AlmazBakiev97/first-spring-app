package ru.bakiev.myspring;

import org.springframework.stereotype.Component;

@Component
public class HipHopMusic implements Music {
    @Override
    public String getSong() {
        return "Hip hop";
    }
}
