// code for practice 7-2

import java.util.Scanner;

class Te7_2 {

    // --- Returns the smallest of three numbers ---//
    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Integer a: "); int a = stdIn.nextInt();
        System.out.print("Integer b: "); int b = stdIn.nextInt();
        System.out.print("Integer c: "); int c = stdIn.nextInt();

        System.out.println("The minimum value is " + min(a, b, c) + ".");
    }
}
