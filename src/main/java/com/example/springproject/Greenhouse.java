package com.example.flowers;

import org.springframework.stereotype.Component;

@Component
public class Greenhouse {

    private final Flower flower;


    public Greenhouse(Flower flower) {
        this.flower = flower;
    }


    public void manage() {
        System.out.println("Managing greenhouse with a beautiful " + flower.getClass().getSimpleName());
    }
}
