package ru.ali.springsource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.ali.springsource")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}

