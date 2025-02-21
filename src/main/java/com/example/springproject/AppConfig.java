package com.example.flowers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.flowers")
public class AppConfig {
    // Этот класс будет отвечать за сканирование пакета и регистрацию компонентов.
}
