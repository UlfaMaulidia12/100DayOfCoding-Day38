package ProgramDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("nilai x = 1");
                break;
            case 2:
                System.out.println("nilai x = 2");
                break;
            case 3:
                System.out.println("nilai x = 3");
                break;
            default:
                System.out.println("nilai x tidak diketahui");
        }
    }
}
