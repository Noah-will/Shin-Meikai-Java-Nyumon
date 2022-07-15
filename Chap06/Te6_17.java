// code for practice 6-17

import java.util.Scanner;

class Te6_17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Read in the two subject results of six students.");
        System.out.println("calculate the average score of each subject ");
        System.out.println("and the average score of each student");

        System.out.println("Matrix Scores"); // get the value of Scores
        int[][] a = new int[7][3];   // a column for every students' average
        System.out.println("Please enter the value of Score");
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 2; j++){
                System.out.print("Score [" + i + "][" + j + "] = " + "  ");
                a[i][j] = stdIn.nextInt();
            }

        // calculate the average
        for (int i = 0; i < 6; i++) {
            int studentAverage = 0;
            for (int j = 0; j < 2; j++)
                studentAverage += a[i][j];
            a[i][2] = studentAverage / 2;
        }

        for (int i = 0; i < 2; i++) {
            int itemAverge = 0;
            for (int j = 0; j < 6; j++)
                itemAverge += a[j][i];
            a[6][i] = itemAverge / 6;
        }
        System.out.println();

        // display the value in Scores
        System.out.println("Items1   Items2  Avergae");
        // Can be modified to look like a table, but here the work is omitted
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 3; j++)
                System.out.printf("%3d", a[i][j]);
            System.out.println();
        }
    }
}
