package lt.itacademy.java.basics;

import java.util.Scanner;

public class OptionalTask_3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) {

        System.out.println("Type in number x: ");
        String x = scanner.next();
        System.out.println("Type in number y: ");
        String y = scanner.next();

        int xConverted = Integer.parseInt(x);
        int yConverted = Integer.parseInt(y);

        System.out.println("The sum of x and y: "+(xConverted+yConverted));
    }


}
