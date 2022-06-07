package Vaidation;

import java.util.Scanner;

public class InputValidation {

    private static final Scanner sc = new Scanner(System.in);

    public static int Int() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
            return Int();
        }
    }

    public static String String() {
        try {
            return sc.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Invalid string format!");
            return String();
        }
    }
    
}

