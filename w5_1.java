package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, a, c = 0, i, d, e = 0, g = 0;
        float b, s, h = 0, j, k;
        n = input.nextInt();
        int[] f = new int[n];
        for (i = 0; i < n; i++) {
            f[i] = input.nextInt();
            c += f[i];
        }
        b = (float) c / i;
        for (i = 0; i < n; i++) {
            if (f[i] < f[e]) {
                e = i;
            }
        }
        for (i = 0; i < n; i++) {
            if (f[i] > f[g]) {
                g = i;
            }
        }
        for (i = 0; i < n; i++) {
            h += (float) Math.pow((f[i] - b), 2);
        }
        j = (h / (n - 1));
        k = (float) Math.sqrt(j);
        System.out.println("average = " + b);
        System.out.println("min = " + f[e]);
        System.out.println("max = " + f[g]);
        System.out.printf("SD = %.2f", k);;
    }

}
