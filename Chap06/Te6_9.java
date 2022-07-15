// code for practice 6-9


import java.util.Random;
import java.util.Scanner;

class Te6_9 {
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
    }
}
