package com.bridgelabz.gambler;

import java.util.Random;
import java.util.Scanner;

public class Gambler {
    public static Scanner input = new Scanner(System.in);
    public static Random randNum = new Random();

    public static int stack = 100;
    public static int playCount = 1;
    public static int dayCount = 1;
    public static String status;

    public static void main(String[] args) {
        System.out.println("""
                Welcome to the table
                Enter your name""");
        String name = input.next();
        System.out.println("Welcome " + name);

        recursive();
    }

    public static void play() {
        int random = randNum.nextInt(2);
        System.out.println("RandNum number is " + random);

        if (random == 0) {
            System.out.println("And it is Heads");
            stack++;

        } else {
            System.out.println("And it is Tails");
            stack--;
        }
    }

    public static boolean check() {
        int max = 150, min = 50;
        if (stack == max)
            status = "Won";
        if (stack == min)
            status = "Lost";
        return ((stack < max) && (stack > min));
    }

    public static void recursive()
    {
        while (dayCount <= 20) {
            while (playCount != 0) {
                if (check()) {
                    play();
                    System.out.println("After " + playCount + " round, now the stacks is " + stack);
                    playCount++;
                } else {
                    System.out.println("Day of play is " + dayCount + " and the play has " + status + " and the stack is " + stack);
                    break;
                }
            }
            playCount = 1;
            stack = 100;
            dayCount++;
        }
    }
}