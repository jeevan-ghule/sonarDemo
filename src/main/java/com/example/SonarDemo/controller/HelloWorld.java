package com.example.SonarDemo.controller;

public class HelloWorld {

    void sayHello() {
        System.out.println("Hello World!");
    }

    void notCovered() {
        System.out.println("This method is not covered by unit tests");
    }

}