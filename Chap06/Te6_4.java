// the code for practice 6-4

import java.util.Random;
import java.util.Scanner;

class Te6_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 1 + rand.nextInt(10);

        int max = a[0];
        // find the maximum elements, use as numbers of column
        for (int i = 1; i < n ; i++) {
            if (a[i] > max)
                max = a[i];
        }

        for (int i = 0; i < n; i++)
            System.out.println("a [" + i + "] = " + a[i]);

        for (int j = 0; j < max; j++) {
            for (int i = 0; i < n; i++) {
                if (a[i] < (max - j))       // each column needs a differet compared value
                    System.out.print("  "); // look at the picture, need two blank to display
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++)
            System.out.print("--");         // Enter -- to separate, two - for each number
        System.out.println();
        for (int i = 0; i < n; i++)
            System.out.print((i % 10) + " ");
    }
}
