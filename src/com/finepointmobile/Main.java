package com.finepointmobile;

public class Main {

    public static void main(String[] args) {
        String givenNumbers = "three;seven;eight;nine;two";
        String[] number = givenNumbers.split(";");

        String[] possibleNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < possibleNumbers.length; j++) {
                if (number[i].equals(possibleNumbers[j])) {
                    System.out.print(j);
                }
            }
        }
    }
}
