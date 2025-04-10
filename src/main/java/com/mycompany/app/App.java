package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Actually I really don't like Jenkins. Gotcha.");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
