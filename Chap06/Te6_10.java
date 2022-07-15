// code for practice 6-10

import java.util.Random;
import java.util.Scanner;

class Te6_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Nomber of elements : ");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = 1 + rand.nextInt(10);
            System.out.println("a[" + i + "] = " + a[i] + ".");
        }

        System.out.println("a[" + 0 + "] = " + a[0]);

        // Modify adjacent elements
        for (int i = 1; i < num; i++) {
            if (a[i] == a[i - 1])                  // if equal, then change
                a[i] = a[i - 1] - rand.nextInt(10);
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
