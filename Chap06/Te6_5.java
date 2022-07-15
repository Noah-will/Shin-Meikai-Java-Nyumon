// code for practice 6-5

import javax.net.ssl.SSLContext;
import java.util.Scanner;

class Te6_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("How many elements do you want in an array : ");
        int num = stdIn.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a [" + i + "] = ");
            a[i] = stdIn.nextInt();
        }
        System.out.print("a = {");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("}");
    }
}
