package com.practice;

/**
 * A simple Hello World program to get started with Java.
 */
public class HelloWorld {
    
    /**
     * Main method - entry point of the program.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Java World!");
        System.out.println("Welcome to the Java Practice Workspace!");
    }
    
    /**
     * Returns a greeting message.
     * 
     * @param name the name to greet
     * @return a greeting string
     */
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
