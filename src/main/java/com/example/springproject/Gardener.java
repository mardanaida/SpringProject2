package com.example.flowers;

import org.springframework.stereotype.Component;

@Component
public class Gardener {

    private final Flower flower;
    private final Greenhouse greenhouse;

    // Внедрение зависимостей через конструктор
    public Gardener(Flower flower, Greenhouse greenhouse) {
        this.flower = flower;
        this.greenhouse = greenhouse;
    }

    // Метод для ухода за цветами
    public void careForFlowers() {
        System.out.println("Taking care of the flowers in the greenhouse...");
        flower.showInfo();
        greenhouse.manage();
    }
}
