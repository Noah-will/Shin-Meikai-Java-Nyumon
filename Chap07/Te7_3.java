// code for practice 7-3


import java.util.Scanner;

class Te7_3 {
    static int med(int a, int b, int c) {
        if ((a - b)*(c - a) > 0) return a;
        if ((b - a)*(c - b) > 0) return b;
        else return c;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Integer a: "); int a = stdIn.nextInt();
        System.out.print("Integer b: "); int b = stdIn.nextInt();
        System.out.print("Integer c: "); int c = stdIn.nextInt();

        System.out.println("The median value is " + med(a, b, c) + ".");
    }
}
