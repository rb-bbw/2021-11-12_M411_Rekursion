package ch.bbw;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Limit ein:");
        int limit = Integer.parseInt(keyboard.nextLine());

        for(int i = 1; i <= limit; i++) {
            System.out.println(fibonacci(i));
        }

        keyboard.close();
    }
    private static int fibonacci(int number) {
        if(number > 1) {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }

        return number;
    }
}
