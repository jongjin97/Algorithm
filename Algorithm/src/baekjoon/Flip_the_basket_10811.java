package baekjoon;

import java.util.Scanner;

public class Flip_the_basket_10811 {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for( int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a - 1; j < b; j++) {
                int temp = arr[j];
                arr[j] = arr[b - 1];
                arr[b - 1] = temp;
                b--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
