// code for practice 6-19

import java.util.Scanner;

class Te6_19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Number of classes: ");
        int[][] a;
        a = new int[stdIn.nextInt()][];

        // Read the number of classes and the number of students and their marks
        for (int i = 0; i < a.length; i++) {
            System.out.print("Number of students in no " + (i + 1) + " class : ");
            a[i] = new int[stdIn.nextInt()];
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Class" + (i + 1) + " No " + (j + 1) + "'s score : ");
                a[i][j] = stdIn.nextInt();
            }
        }
        System.out.println();

        // print out the array
        System.out.println(" Class   |  Sum   Average" );
        System.out.println("--------------------------");
        int[] sum = new int[a.length];
        double[] average = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Class " + (i + 1)+ "  |");
            for (int j = 0; j < a[i].length; j++) {
                sum[i] += a[i][j];
            }
            average[i] = (double)sum[i] / a[i].length;
            System.out.print("  " + sum[i] + "    ");
            System.out.printf("%.1f\n",average[i]);
        }
        int s = 0; double b = 0;
        for (int i = 0; i < a.length; i++) {
            s += sum[i];
            b += average[i];
        }
        System.out.print("Total    |  " + s + "    ");
        System.out.printf("%.1f", (b / a.length));

    }
}
