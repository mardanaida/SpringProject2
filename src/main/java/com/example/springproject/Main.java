package com.example.flowers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {

            Gardener gardener = context.getBean(Gardener.class);

            gardener.careForFlowers();
        }
    }
}
