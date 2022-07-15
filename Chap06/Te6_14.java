// Enter the English expression according to the numerical month

import java.util.Random;
import java.util.Scanner;

class Te6_14 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] monthString = {
                "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        System.out.println("Please enter the English word for the month, with the first letter capitalized.");

        int retry = 0;
        int month = 1 + rand.nextInt(12);

        // Determine if it is a consecutive month
        do {
            if (retry == 1) {    // First determine if you are in the loop
                int month2;      // Take a random month with another variable and use it for comparison
                do {
                    month2 = 1 + rand.nextInt(12);
                } while (month2 == month);
                // If the second time the value is the same as the first time, then retake the value

                month = month2;
            }

            String a;  // String comparison

            do {
                System.out.print(month + " month : ");
                a = stdIn.next();
                if (a.equals(monthString[month - 1]))
                    System.out.println("Right answer.");
                else
                    System.out.println("Wrong answer.");
            } while(!a.equals(monthString[month - 1]));

            System.out.print("Do you want to repeat, 1 means yes, 0 means no: ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
