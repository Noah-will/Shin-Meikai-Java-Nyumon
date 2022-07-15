// code for practice 612

import java.util.Random;
import java.util.Scanner;

class Te6_12 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Nomber of elements : ");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        // The original array
        for (int i = 0; i < num; i++) {
            a[i] = 1 + rand.nextInt(10);
            System.out.print("a[" + i + "] = " + a[i] + "  ");
        }
        System.out.println();

        // Random sorting
        for (int i = 0; i < a.length; i++) {
            int t = a[i];
            int j = rand.nextInt(num);
            a[i] = a[j];
            a[j] = t;
        }

        // The new array
        for (int i = 0; i < a.length; i++)
            System.out.print("a[" + i + "] = " + a[i] + "  ");
    }
}
