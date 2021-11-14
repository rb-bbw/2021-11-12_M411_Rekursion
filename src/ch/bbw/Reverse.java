package ch.bbw;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Text ein:");
        String userInput = keyboard.nextLine();

        System.out.println( reverse(userInput.toCharArray(), userInput.length() - 1) );

        keyboard.close();
    }
    private static String reverse(char[] data, int last) {
        if(last >= 0){
            return data[last] + reverse(data, last - 1);
        }
        return "";
    }
}
