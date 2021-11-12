package ch.bbw;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Text ein:");
        String userInput = keyboard.nextLine();

        if (isPalindrome(userInput.toCharArray(), 0, userInput.length() - 1)) {
            System.out.println("Die Eingabe ist ein Palindrom");
        } else {
            System.out.println("Die Eingabe ist kein Palindrom");
        }
        keyboard.close();
    }
    private static boolean isPalindrome(char[] data, int front, int rear) {
        if(rear - front > 0) {
            boolean possibly_palindrome = isPalindrome(data, front + 1, rear - 1);

            return possibly_palindrome && data[front] == data[rear]; // if previous was and current is equal
        } else return true;
    }
}
