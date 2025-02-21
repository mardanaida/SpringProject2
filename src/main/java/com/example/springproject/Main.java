package com.example.flowers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Загружаем Spring ApplicationContext
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            // Получаем садовника из контекста
            Gardener gardener = context.getBean(Gardener.class);
            // Используем метод садовника для ухода за цветами
            gardener.careForFlowers();
        }
    }
}
