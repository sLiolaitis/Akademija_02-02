package lt.itacademy.java.basics;

import java.util.Scanner;

public class OptionalTask_1 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        OptionalTask_1 optTsk1 = new OptionalTask_1();

        optTsk1.greetings();
        boolean valid;


        do {
            String password = scanner.next();

            valid = optTsk1.validity(password);
            if (!valid) {
                System.out.println("Please try again...");

            }

        } while (!valid);





    }

    private boolean validity (String psw) {
        char [] password = new char[psw.length()];
        if (psw.length()<10) {
            System.out.println(ANSI_RED + "Password is invalid! \n It must contain atleast 10 characters!" + ANSI_RESET);
            return false;
        }
        int numbers = 0;
        int letters = 0;
        int other = 0;
        for (int i = 0; i<psw.length(); i++) {
            password [i] = psw.charAt(i);
            if ((password[i]>='a'&& password[i]<='z')||(password[i]>='A'&& password[i]<='Z')) {
                letters++;
            }
            else if (password[i]>='0' && password [i]<='9') {
                numbers++;
            } else {
                other++;
            }

        }

        /* System.out.println("Numbers: "+numbers);
        System.out.println("Letters: "+letters);
        System.out.println("Other: "+other); */

        if (other>0) {
            System.out.println(ANSI_RED + "Password is invalid! \n Only letters and numbers are allowed!" + ANSI_RESET);
            return false;
        } else if (numbers<2) {
            System.out.println(ANSI_RED + "Password is invalid! \n A password must contain at least two digits!" + ANSI_RESET);
            return false;
        } else {
            System.out.println(ANSI_GREEN + "Password is valid: "+ANSI_RESET+psw);
            return true;
        }

    }

    private void greetings () {
        System.out.println("OPTIONAL TASK 1");
        System.out.println("You will be creating a password");
        System.out.println("Password rules: \n   - A password must have at least ten characters");
        System.out.println("   - A password consists of only letters and digits");
        System.out.println("   - A password must contain at least two digits");
        System.out.println("  **********************************************  ");
        System.out.println("\n Please enter yuor desired password: ");
    }

}
