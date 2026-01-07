package es3;

import java.util.Scanner;

public class Main {
    public static String stampo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero da 0 a 3");
        int num = scanner.nextInt();
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> "non valido";
        };


    }

    static void main() {
        System.out.println(stampo());

    }
}
