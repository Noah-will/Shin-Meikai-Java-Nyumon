// Output a double array in the order 1.1 2.2 3.3 4.4 5.5 (5 elements)

class Te6_3 {
    public static void main(String[] args) {
        double[] a = new double[5];

        for (int i = 0; i < a.length; i++)
            a[i] = (double) (i + 1) + (double) (i + 1) / 10;
        // Because double cannot be represented exactly, this representation is chosen
        for (int i = 0; i < a.length; i++)
            System.out.println("a [" + i + "] = " + a[i]);
    }
}
