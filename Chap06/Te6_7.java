// code for practice 6-7

import java.util.Random;
import java.util.Scanner;

class Te6_7 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        final int n = 12;
        int[] a = new int[n];

        for (int j = 0; j < n; j++)
            a[j] = rand.nextInt(10);

        System.out.print("Values of all elements in array a\n { ");
        for (int j = 0; j < n; j++)
            System.out.print(a[j] + " ");
        System.out.println(" }");

        System.out.print("Value to be found : ");
        int key = stdIn.nextInt();

        int i;
        for (i = n -1; i < n; i--)
            if (a[i] == key)
                break;

        if (i < n)
            System.out.println("The element is a[ " + i + " ]." );
        else
            System.out.println("The element is not existed");
    }
}
