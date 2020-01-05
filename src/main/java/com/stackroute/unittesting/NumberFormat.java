package com.stackroute.unittesting;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        new NumberFormat().inputValidator();
    }

    //write logic to get inputs from user and send inputs to findLongestSequence
    public void inputValidator() {
        Scanner scanner = new Scanner(System.in);
        outputPrinter("Enter the Number:");
        String input = scanner.nextLine();
        scanner.close();
        if (!input.isEmpty()) {
            int number = Integer.parseInt(input);
            if (number > 99 && number < 1000)
                outputPrinter(findNumberFormat(number));
            else if (number < 0)
                outputPrinter("Please give proper positive number not negative number");
            else if (number == 0)
                outputPrinter("Please give proper positive number not zero");
            else if (number >= 1000)
                outputPrinter("Please give proper positive number less than 1000 and greater than 99");
            else if (number <= 99)
                outputPrinter("Please give proper positive number greater than 99 and less than 1000");
        } else
            outputPrinter("Please give proper input but not null");
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

    public void outputPrinter(Object printStatement) {
        System.out.println(printStatement);
    }
}
