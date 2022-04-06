package com.bridgelabz.gambler;

import java.util.Random;
import java.util.Scanner;

public class Gambler {
    public static Scanner input = new Scanner(System.in);
    public static Random randNum = new Random();

    public static int stack = 100;
    public static int bet = 1;
    public static int playCount = 0;
    public static String toss;

    public static void main(String[] args) {
        System.out.println("""
                Welcome to the table
                Enter your name""");
        String name = input.next();
        System.out.println("Welcome " + name);
        play();
    }

    public static void play() {
        System.out.println("make your bet - type 'H' for 'Head' or 'T' for 'Tail' ");
        String call = input.next();
        System.out.println("Call is " + call);

        if (call.equalsIgnoreCase("H") || call.equalsIgnoreCase("T")) {
            int random = randNum.nextInt(2);
            System.out.println("RandNum number is " + random);

            if (random == 0) {
                toss = String.valueOf('H');
                System.out.println("And it is Heads");

            } else {
                toss = String.valueOf('T');
                System.out.println("And it is Tails");
            }
        } else {
            System.out.println("Note: Only H or T ---- Make your bet - type 'H' for 'Head' or 'T' for 'Tail' ");
            play();
        }
        if ((call.equalsIgnoreCase("H") && "H".equalsIgnoreCase(toss)) ||
                (call.equalsIgnoreCase("T") && "T".equalsIgnoreCase(toss))) {
            playCount++;
            stack++;
            System.out.println("After " + playCount + " round, now the stacks is " + stack);
        } else {
            playCount++;
            stack--;
            System.out.println("After " + playCount + "games, now the stacks is " + stack);
        }
    }
}