package com.example.springproject;

import org.springframework.stereotype.Component;

@Component
public class TaskService {
    public void executeTask() {
        System.out.println("Выполняется задача...");
    }
}
