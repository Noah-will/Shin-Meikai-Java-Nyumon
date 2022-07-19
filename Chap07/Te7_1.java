// code for practice 7-1

import java.util.Scanner;

class Te7_1 {

    // --- Returns 1, 0, -1 depending on the value of n ---//
    static int signOf(int n) {
        if (n > 0)
            return 1;
        else if (n < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Please enter a value of n: ");
        int n = stdIn.nextInt();

        int a = signOf(n);
        if (a > 0)
            System.out.println("n is positive.");
        else if (a < 0)
            System.out.println("n is negative.");
        else
            System.out.println("n is 0.");
    }
}
