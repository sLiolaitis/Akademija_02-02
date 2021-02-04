package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    Scanner scanner = new Scanner(System.in);
    public void task8 () {
        int days = scanner.nextInt();
        int hours = 0;
        int minutes = 0;
        for (int i = 1; i <= days; i++) {

            hours += 24;
            minutes += (24 * 60);

        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public void task9 () {
            int days = scanner.nextInt();
            int hours = 0;
            int minutes = 0;
            int counter = 1;
            while(counter<=days) {

                hours += 24;
                minutes += (24 * 60);
                counter++;

            }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public void task10 () {
        int number = scanner.nextInt();
        int factorial=1;
        for (int i = number; i>0; i--) {
            factorial *=i;
        }
        System.out.println("Factorial of number "+number+" is "+factorial);
    }

}
