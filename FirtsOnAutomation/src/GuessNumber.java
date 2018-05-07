
package com.example.alexwilkinson.myapplication;

import java.util.Random;
import java.util.Scanner;


    public class GuessNumber {
        public static void main(String[] args) {
            Random newRandom = new Random();
            int randomnumber = newRandom.nextInt(9);
            System.out.println("Please enter a number between 0 and 9:");
            Scanner newScanner = new Scanner(System.in);
            int scannerNumber = newScanner.nextInt();

            if (scannerNumber > randomnumber || scannerNumber < randomnumber) {
                for (int schetchik = 3; schetchik > 0; --schetchik) {
                    if (scannerNumber > randomnumber) {
                        System.out.println("You number is bigger. Please try again. You have: " + schetchik +" more attempts");
                        Scanner newscannerT = new Scanner(System.in);
                        int scannerttwo = newscannerT.nextInt();
                        scannerNumber = scannerttwo;
                    }
                    else if (scannerNumber < randomnumber) {
                        System.out.println("You number is smaller. Please try again. You have: " + schetchik +" more attempts");
                        Scanner newscnnaerThr = new Scanner(System.in);
                        int newScannerThree = newscnnaerThr.nextInt();
                        scannerNumber = newScannerThree;
                    }
                }
                if (scannerNumber == randomnumber) {
                    System.out.println("You guess!");
                }
            }
            if (scannerNumber > randomnumber || scannerNumber < randomnumber) {
                System.out.println("You lose!");
            }
        }
    }

