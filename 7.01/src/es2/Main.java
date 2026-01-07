package es2;

import java.util.Scanner;

public class Main {
    public static boolean annoBisestile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un anno");
        int anno = scanner.nextInt();
        if (anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    void main() {
        System.out.println(annoBisestile());
    }

    ;
}