package javaapplication37;

import java.util.Scanner;

public class JavaApplication37 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = input.nextInt();
        }
        int[] y = sort(x);
        for (int i = 0; i < n; i++) {
            System.out.println((y[i]));
        }

    }

    public static int[] sort(int[] x) {
        int temp;
        for (int i = 1; i < x.length; i++) {
            for (int j = i; j > 0; j--) {
                if (x[j] < x[j - 1]) {
                    temp = x[j];
                    x[j] = x[j - 1];
                    x[j - 1] = temp;

                }
            }
        }

        return x;
    }

}
