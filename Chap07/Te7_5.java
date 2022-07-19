// code for practice 7-5

import java.util.Scanner;

class Te7_5 {

    // --- display Hello ---//
    static void hello(int n) {
        while (n-- > 0)
            System.out.print("Hello");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Do you want to see hello?");
        System.out.print("1 means yes, 0 means no. You choose: ");
        int i = stdIn.nextInt();
        hello(i);

    }
}
