package lt.itacademy.java.basics;

import java.util.Scanner;

public class OptionalTask_2 {

private static final Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) {

        System.out.println("Type how many symbols you want to check:");
        long n = scanner.nextLong();

        System.out.println("Type some letters: ");
        String s = scanner.next();

        System.out.println("Type a letter you will be looking for: ");
        char letter = scanner.next().charAt(0);


        StringBuilder infiniteString = new StringBuilder();
        /* Styga nebus begaline taciau ji visada bus pakankamai ilga, kad
        galetume patikrinti reikiama elementu kieki */
        while (n>=infiniteString.length()) {
            infiniteString.append(s);
        }

        char [] copyOfAString= new char [infiniteString.length()];
        int counter = 0;
        for (int i = 0; i<n; i++) {
            copyOfAString[i] = infiniteString.charAt(i);
            if (copyOfAString[i]==letter) {
                counter++;
            }
        }

        System.out.println("The letter "+letter+" repeats "+counter+" times in first "+n+" elements of the String!");


        System.out.println(counter);

    }

}
