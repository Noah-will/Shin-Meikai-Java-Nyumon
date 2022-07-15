// code for practice 6-10

import java.util.Random;
import java.util.Scanner;

class Te6_15 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] weekString = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        String[] weekStringZh = {
                "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"
        };

        System.out.println("Please enter the English word for the week, with the first letter capitalized.");

        int retry = 0;
        int week = 1 + rand.nextInt(7);

        // Determine if it is a consecutive month
        do {
            if (retry == 1) {    // First determine if you are in the loop
                int weekAgain;      // Take a random month with another variable and use it for comparison
                do {
                    weekAgain = 1 + rand.nextInt(7);
                } while (weekAgain == week);
                // If the second time the value is the same as the first time, then retake the value

                week = weekAgain;
            }

            String a;  // String comparison

            do {
                System.out.print(weekStringZh[week - 1] + " : ");
                a = stdIn.next();
                if (a.equals(weekString[week - 1]))
                    System.out.println("Right answer.");
                else
                    System.out.println("Wrong answer.");
            } while(!a.equals(weekString[week - 1]));

            System.out.print("Do you want to repeat, 1 means yes, 0 means no: ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
