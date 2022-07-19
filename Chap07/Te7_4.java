// code for practice 7-4

import java.util.Scanner;

class Te7_4 {

    // --- Calculate the sum of all integers from 1 to n ---//
    static int sumUp(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)   // add 1 to n
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Calculate the sum of all integers from 1 to n.");
        System.out.print("The value of n is : ");  int n = stdIn.nextInt();

        System.out.println("the sum of all integers from 1 to " + n + " is : " + sumUp(n) + ".");
    }
}
