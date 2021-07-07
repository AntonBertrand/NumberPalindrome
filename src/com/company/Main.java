package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-707));
    }

    public static boolean isPalindrome (int number) {

        if (number < 0) {
            number = number * -1;
        }

        int originalNumber = number;
        int reverse = 0;
        int lastDigit;




        while (number > 0) {

            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }


        if (reverse == originalNumber) {
            return true;
        } else {
            return false;
        }

    }

}
