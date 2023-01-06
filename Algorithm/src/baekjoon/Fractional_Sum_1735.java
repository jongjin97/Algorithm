package baekjoon;

import java.util.Scanner;

public class Fractional_Sum_1735 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[2];
        int num2[] = new int[2];

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num2[0] = sc.nextInt();
        num2[1] = sc.nextInt();

        int numerator, denominator;

        denominator = num[1] * num2[1];
        numerator = num[0] * num2[1] + num2[0] * num[1];

        int gcd = gcd(numerator, denominator);

        System.out.println(numerator/gcd + " " + denominator/gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
