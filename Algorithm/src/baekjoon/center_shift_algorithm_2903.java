package baekjoon;

import java.util.Scanner;
//중앙 이동 알고리즘
public class center_shift_algorithm_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println((long) Math.pow((1+Math.pow(2,N)),2));
    }
}
