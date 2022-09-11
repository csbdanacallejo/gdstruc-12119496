package com;

import java.util.Scanner;

public class danaandrea {
    public static void main(String[] args) {
        //prints out Hello world!
        System.out.println("Hello world!");

        //gets user input
        Scanner scanner= new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
    }
}
