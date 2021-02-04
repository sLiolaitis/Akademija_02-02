package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    Scanner scanner = new Scanner(System.in);
    public void task6 () {
        int a,b,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if (a==b && b==c && a==c) {
            System.out.println("Triangle is Equilateral. Sides: "+a+" "+b+" "+c);
        } else if (a==b || b==c || a==c) {
            System.out.println("Triangle is Isosceles. Sides: "+a+" "+b+" "+c);
        } else {
            System.out.println("Triangle is Scalene. Sides: "+a+" "+b+" "+c);
        }

    }

    public void task7() {
        double distance = scanner.nextDouble();
        double fuel = scanner.nextDouble();
        double usage = scanner.nextDouble();
        double price = scanner.nextDouble();
        System.out.println("Destination is in "+distance+" km. ");
       double nuvaziuojamaDistancija = (fuel*100)/usage;

        if (nuvaziuojamaDistancija>distance) {
            System.out.println("Car is able to reach the destination. ");
            double likusiDistancija = nuvaziuojamaDistancija-distance;
            double likeLitrai = (usage/100)*likusiDistancija;
            System.out.println("It will have "+String.format("%.2f",likeLitrai)+" liters of fuel left.");
        } else {
            System.out.println("Car is not able to reach the destination. ");
            double likusiDistancija = distance-nuvaziuojamaDistancija;
            double kiekDarReikia = (usage/100)*likusiDistancija;
            System.out.println("It needs "+String.format("%.2f",kiekDarReikia)+" liter of fuel more. ");
            double kaina = kiekDarReikia*price;
            System.out.println("It will cost "+String.format("%.2f",kaina)+".");

        }

    }

}
