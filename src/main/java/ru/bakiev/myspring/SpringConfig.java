package ru.bakiev.myspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.bakiev.myspring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
