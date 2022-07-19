// code for practice 6-18

import java.util.Scanner;

class Te6_18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[][] c;

        System.out.print("Number of rows: ");
        int rows = stdIn.nextInt();
        c = new int[rows][];

        // Create a new array
        System.out.println("Number of columns per row.");
        for (int i = 0; i < rows; i++) {
            System.out.print("Number of columns in " + (i + 1) + " row: ");
            c[i] = new int[stdIn.nextInt()];
        }

        // Read the elements of each column
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print("c[" + i + "][" + j + "] = ");
                c[i][j] = stdIn.nextInt();
            }
        }
        System.out.println();

        // print out the array
        System.out.println("Array: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++)
                System.out.printf("%3d", c[i][j]);
            System.out.println();
        }
    }
}
