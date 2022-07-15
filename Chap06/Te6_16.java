// code for practice -16

import java.util.Scanner;

class Te6_16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Calculate the product of a 4-row, 3-column matrix and a 3-row, 4-column matrix.");

        System.out.println("Matrix a"); // get the value of a
        int[][] a = new int[4][3];
        System.out.println("Please enter the value of a");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++){
                System.out.print("a [" + i + "][" + j + "] = " + "  ");
                a[i][j] = stdIn.nextInt();
            }

        System.out.println("Matrix b"); // get the value of b
        int[][] b = new int[3][4];
        System.out.println("Please enter the value of b");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++){
                System.out.print("b [" + i + "][" + j + "] = " + "  ");
                b[i][j] = stdIn.nextInt();
            }

        System.out.println("Matrix c"); // use for loop to caculate the value
        int[][] c = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;                  // every colum start at 0, then add
                for (int k = 0; k < 3; k++)
                    sum += a[j][k] * b[k][j]; // eacch item equal to the sum
                c[i][j] = sum;
            }
        }

        // display the value in c
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++)
                System.out.printf("%3d", c[i][j]);
            System.out.println();
        }
    }
}
