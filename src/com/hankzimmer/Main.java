package com.hankzimmer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int counter = 0;
        //Continue taking in user inputs until an invalid input, and then break out of the loop
        while (true) {
            System.out.println("Enter number");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                //If it is the first input, set the max and min equal to the input
                if (counter == 0) {
                    min = input;
                    max = input;

                } else if (input < min) {
                    min = input;
                } else if (input > max) {
                    max = input;
                }
                counter++;
            } else {
                System.out.println("Invalid Input");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The max number input is " + max + " and the mininum number input is " + min);
        scanner.close();
    }
}
