package lt.itacademy.java.basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Basics {

    public void hello() {
        String name;
        String surname;
        int age;

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
        surname = scanner.nextLine();
        age = scanner.nextInt();

        System.out.println("Hello I am " + name + " " + surname + " " + age + ". I am attending IT Academy 2021!");
    }

    public void task2() {

        String h = "h";
        int ello = 3110;
        char tarpelis = ' ';
        char w = 'w';
        int o = 0;
        char r = 'r';
        int l = 1;
        char d = 'd';
        String versija = "2.0";
        String tiesa = "true";

        StringBuilder tekstas = new StringBuilder();
        tekstas.append(h).append(ello).append(tarpelis);
        tekstas.append(w).append(o).append(r).append(l).append(d);
        tekstas.append(tarpelis).append(versija).append(tarpelis).append(tiesa);


        System.out.println(tekstas);

        // System.out.println(h+ello+tarpelis+w+o+r+l+d+tarpelis+versija+tarpelis+tiesa);

    }

    public void task3() {

        Scanner scanner = new Scanner(System.in);

        int pirmas;
        int antras;
        pirmas = scanner.nextInt();
        antras = scanner.nextInt();
        System.out.println("Pirmas = " + pirmas + "\nAntras = " + antras);
        System.out.println("Pirmas - Antras = " + (pirmas - antras));
        System.out.println("Pirmas / Antras = " + (pirmas / antras));
        System.out.println("Pirmas * Antras = " + (pirmas * antras));
        System.out.println("Pirmas % Antras = " + (pirmas % antras));
        System.out.println("Didesnis skaicius yra: ");
        if (pirmas > antras) {
            System.out.println("pirmas, ir jo reiksme yra: " + pirmas);
        } else {
            System.out.println("antras, ir jo reiksme yra: " + antras);
        }

        System.out.println("Mazesnis skaicius yra: ");
        if (pirmas < antras) {
            System.out.println("pirmas, ir jo reiksme yra: " + pirmas);
        } else {
            System.out.println("antras, ir jo reiksme yra: " + antras);
        }


    }

}
