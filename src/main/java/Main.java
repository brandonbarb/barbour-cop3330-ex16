/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is your age? ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String not = age >= 16 ? "": "not ";
        System.out.printf("You are %sold enough to legally drive", not);
    }
}
