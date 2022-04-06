package com.bridgelabz.gambler;

import java.util.Random;
import java.util.Scanner;

public class Gambler
{
    public static Scanner input = new Scanner(System.in);
    public static Random randNum = new Random();

    public int stack = 100;
    public int bet = 1;

    public static void main(String[] args) {
        System.out.println("""
                Welcome to the table
                Enter your name""");
        String name = input.next();
        System.out.println("Welcome " + name);
        bet();
    }

    public static void bet() {
        System.out.println("make your bet - type 'H' for 'Head' or 'T' for 'Tail' ");
        String call = input.next();
        System.out.println("Call is " +call);
        if (call.equalsIgnoreCase("H")||call.equalsIgnoreCase("T")) {
            int random = randNum.nextInt(2);
            System.out.println("RandNum number is " + random);
            
            char toss;
            if (random == 0) {
                toss = 'H';
                System.out.println("And it is Heads");
            } else {
                toss = 'T';
                System.out.println("And it is Tails");
            }
        } else {
            System.out.println("Note: Only H or T ---- Make your bet - type 'H' for 'Head' or 'T' for 'Tail' ");
            bet();
        }
    }
}