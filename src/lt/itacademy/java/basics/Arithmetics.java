package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {
    Scanner scanner = new Scanner(System.in);


    public void task4 () {
        System.out.println("Iveskite kubo krastine: ");
        int krastine;
        krastine = scanner.nextInt();
        int volume = krastine*krastine*krastine;
        int surfaceArea = (krastine*krastine)*6;
        System.out.println("Kubo krastine yra: "+krastine);
        System.out.println("Kubo turis yra: "+volume);
        System.out.println("Kubo pavirsiaus plotas yra: "+surfaceArea);


    }

    public void task5 () {
        int feet = scanner.nextInt();
        double inches = scanner.nextDouble();
        double allInches = (feet*12)+inches;
        double cm = allInches*2.54;
        System.out.println(feet+" feet and "+inches+" inches = "+cm+" cm.");



    }



}
