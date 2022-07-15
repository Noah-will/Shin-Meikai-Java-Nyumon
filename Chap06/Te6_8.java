import java.util.Scanner;

// code for practive 6-8
class Te6_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("How many elements do you want to caculate: ");
        int n = stdIn.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextDouble();
        }
        double sum = 0; // sum
        for (double i : a)
            sum += i;

        System.out.println("The sum is : " + sum + ".");
        System.out.println("Average is : " + sum / n + ".");
    }
}
