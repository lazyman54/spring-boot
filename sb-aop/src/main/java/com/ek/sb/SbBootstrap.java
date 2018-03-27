package com.ek.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbBootstrap {
    public static void main(String[] args) {
        SpringApplication sp = new SpringApplication(SbBootstrap.class);
        sp.setWebApplicationType(WebApplicationType.SERVLET);
        ConfigurableApplicationContext context = sp.run(args);

    }
}
