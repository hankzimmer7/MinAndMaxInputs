package com.hankzimmer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean firstInput = true;
        //Continue taking in user inputs until an invalid input, and then break out of the loop
        while (true) {
            System.out.println("Enter number");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                //If it is the first input, set the max and min equal to the input
                if (firstInput) {
                    min = input;
                    max = input;
                    firstInput = false;
                } else if (input < min) {
                    min = input;
                } else if (input > max) {
                    max = input;
                }
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
