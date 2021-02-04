package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Iveskite figuros numeri, su kuria norite atlikti veiksmus: \nRectangle (1) \nTriangle (2) \nSquare (3)");
            int figura = scanner.nextInt();

            switch (figura) {
                case 1:
                    calc.rectangle();
                    break;
                case 2:
                    calc.triangle();
                    break;
                case 3:
                    calc.square();
                    break;

                default:
                    System.out.println("Ivedete netinkama zodi, kartojame is naujo...");
            }

        } while (calc.kartojimas());

    }

    public void rectangle() {
        System.out.println("Iveskite dvi krastines a ir b:");
        Scanner ived = new Scanner(System.in);
        int a = ived.nextInt();
        int b = ived.nextInt();
        if ((a<=0) || (b<=0)) {
            System.out.println("Rectangle side can not be less or equal to 0!");
            boolean klaida = true;
            while (klaida) {
                System.out.println("Iveskite dvi krastines a ir b:");
                a = ived.nextInt();
                b = ived.nextInt();
                if ((a>0) && (b>0)) {
                    klaida = false;
                }
            }
        }
        int perimeter = (a + b) * 2;
        int area = a * b;
        System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area);
    }

    public void square() {
        System.out.println("Iveskite viena krastine a:");
        Scanner ived = new Scanner(System.in);
        int a = ived.nextInt();
        if (a <= 0) {
            System.out.println("Square side can not be less or equal to 0!");
            boolean klaida = true;
            while (klaida) {
                System.out.println("Iveskite viena krastine a:");
                a = ived.nextInt();
                if (a > 0) {
                    klaida = false;
                }
            }
            int perimeter = a * 4;
            int area = a * a;
            System.out.println("Square perimeter is " + perimeter + " and area is " + area);
        }
    }

    public void triangle() {
        System.out.println("Iveskite tris krastines a, b ir c: ");
        Scanner ived = new Scanner(System.in);
        double a = ived.nextInt();
        double b = ived.nextInt();
        double c = ived.nextInt();
        if ((a<=0) || (b<=0) || (c<=0)) {
            System.out.println("Triangle side can not be less or equal to 0!");
            boolean klaida = true;
            while (klaida) {
                System.out.println("Iveskite dvi krastines a, b ir c:");
                a = ived.nextInt();
                b = ived.nextInt();
                c = ived.nextInt();
                if ((a>0) && (b>0) && (c>0)) {
                    klaida = false;
                }
            }
        }
        boolean flag = false;
        if (((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            flag = true;
        }
        while (flag) {
            System.out.println("Ivedete krastines, is kuriu neimanoma sudelioti trikampio, pakartokite veiksma is naujo.");
            System.out.println("Iveskite tris krastines a, b ir c: ");

            a = ived.nextInt();
            b = ived.nextInt();
            c = ived.nextInt();

            if ((a<=0) || (b<=0) || (c<=0)) {
                System.out.println("Triangle side can not be less or equal to 0!");
                boolean klaida = true;
                while (klaida) {
                    System.out.println("Iveskite dvi krastines a, b ir c:");
                    a = ived.nextInt();
                    b = ived.nextInt();
                    c = ived.nextInt();
                    if ((a>0) && (b>0) && (c>0)) {
                        klaida = false;
                    }
                }
            }

            if (((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        double perimetras = a + b + c;
        double s = (a + b + c) / 2;
        double plotas = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Triangle perimeter is " + perimetras + " and area is " + plotas);
    }

    public boolean kartojimas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ar norite dar naudotis skaiciuotuvu? (y/n)");
        String ats = scanner.next();
        if (ats.equals("y") || ats.equals("Y")) {
            System.out.println("Okay vaziuojam is naujo..");
            return true;
        } else {
            return false;
        }

    }


}
