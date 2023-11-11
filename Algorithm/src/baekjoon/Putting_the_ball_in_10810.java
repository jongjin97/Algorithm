package baekjoon;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Putting_the_ball_in_10810 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();

            for (int j = start - 1; j < end; j++) {
                basket[j] = num;
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
        sc.close();

        System.out.println();

        System.out.println(basket);

        System.out.println();

        System.out.println(Arrays.toString(basket));

        System.out.println();

        System.out.println(basket.toString());
    }
}
