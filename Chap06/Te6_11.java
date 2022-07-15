// None of the array elements are equal

import java.util.Random;
import java.util.Scanner;

class Te6_11 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Nomber of elements : ");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = 1 + rand.nextInt(10);
            System.out.print("a[" + i + "] = " + a[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++){
                if (a[j] == a[i]) {
                    System.out.print("a[" + j + "] = " + a[j] + "  ");  // display the same elements
                    a[j] +=1 + rand.nextInt(3);  // channge the value of the elements
                }
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++)
            System.out.print("a[*" + i + "] = " + a[i] + "  ");

    }
}
