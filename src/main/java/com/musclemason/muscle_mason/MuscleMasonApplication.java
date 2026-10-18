package com.musclemason.muscle_mason;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MuscleMasonApplication {

    private static final Logger log = LoggerFactory.getLogger(MuscleMasonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MuscleMasonApplication.class, args);

        log.info("Application Started Successfully!");
    }

}
