package com.dzoms.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Основной класс приложения.
 */
@SpringBootApplication
public class UserServiceApplication {

    /**
     * Основной метод приложения.
     *
     * @param args аргументы приложения
     */
    public static void main(final String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
