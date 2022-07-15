// code for practice 6-6

import java.util.Scanner;

class Te6_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("How mant students do you want to caculate: ");
        int num = stdIn.nextInt();

        int[] tensu = new int[num];

        System.out.println("Please enter " + num + " students' grades.");
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + " 's grade : ");
            tensu[i] = stdIn.nextInt();
        }
        // find the highest score
        int max = tensu[0];
        for (int i = 1; i < tensu.length; i++)
            if (tensu[i] > max) max = tensu[i];

        System.out.println("The highest score is " + max + ".");

        // find the lowest score
        int min = tensu[0];
        for (int i = 1; i < tensu.length; i++)
            if (tensu[i] < min) min = tensu[i];

        System.out.println("The lowest score is " + min + ".");

        // find the sum
        int sum = 0;
        for (int i = 0; i < tensu.length; i++)
            sum += tensu[i];
        System.out.println("The sum score is : " + sum + ".");
        System.out.println("The average score is " +(double)sum / num + ".");
    }
}
