package com.example.flowers;

import org.springframework.stereotype.Component;

@Component
public class Flower {

    private String name;
    private String color;

    // Конструктор
    public Flower() {
        this.name = "Rose";
        this.color = "Red";
    }

    // Метод для вывода информации о цветке
    public void showInfo() {
        System.out.println("Flower name: " + name + ", Color: " + color);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
