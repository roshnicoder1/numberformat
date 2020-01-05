package com.stackroute.unittesting;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        new NumberFormat().inputValidator();
    }

    //write logic to get inputs from user and send inputs to findLongestSequence
    public void inputValidator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        String input = scanner.nextLine();
        if (!input.isEmpty()) {
            int number = Integer.parseInt(input);
            if (number > 99 && number < 1000)
                System.out.println(findNumberFormat(number));
            else if (number < 0)
                System.out.println("Please give proper positive number not negative number");
            else if (number == 0)
                System.out.println("Please give proper positive number not zero");
            else if (number >= 1000)
                System.out.println("Please give proper positive number less than 1000 and greater than 99");
            else if (number <= 99)
                System.out.println("Please give proper positive number greater than 99 and less than 1000");
        } else
            System.out.println("Please give proper input but not null");
    }

    //write logic to find number format of given number , returns result
    public String findNumberFormat(int number) {

        // convert each digit to character and store in character array
        char[] num = String.format("%03d", number).toCharArray();

        String result = "";

        for (int index = 0; index < num[0] - '0'; index++) {
            result += "H";
        }
        for (int index = 0; index < num[1] - '0'; index++) {
            result += "T";
        }
        for (int index = 0; index < num[2] - '0'; index++) {
            result += index + 1;
        }

        return result;
    }
}
