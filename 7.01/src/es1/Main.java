package es1;

import java.util.Scanner;

public class Main {
    public static boolean stringaPariDispari() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String x = scanner.nextLine();
        int n = x.length();
        if ((n % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }

    void main() {
        System.out.println(stringaPariDispari());
    }

    ;
}


