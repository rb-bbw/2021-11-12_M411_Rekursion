package ch.bbw;

import java.util.Scanner;

public class La_Russe {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bitte geben Sie Zahl a ein:");
        int a = Integer.parseInt(keyboard.nextLine());
        System.out.println("Bitte geben Sie Zahl b ein:");
        int b = Integer.parseInt(keyboard.nextLine());

        System.out.println(la_russe(a, b));

        keyboard.close();
    }
    private static int la_russe(int a, int b) {
        int newA = 0;
        if(b > 1) {
            newA = la_russe(a * 2, Math.floorDiv(b, 2));
        }

        if(b % 2 != 0) {
            return a + newA;
        }

        return newA;
    }
}
