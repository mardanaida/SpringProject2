package com.example.flowers;

import org.springframework.stereotype.Component;

@Component
public class Greenhouse {

    private final Flower flower;

    // Внедрение зависимости через конструктор
    public Greenhouse(Flower flower) {
        this.flower = flower;
    }

    // Метод для управления теплицей
    public void manage() {
        System.out.println("Managing greenhouse with a beautiful " + flower.getClass().getSimpleName());
    }
}
