package baekjoon;

import java.util.Scanner;

public class Chess_3003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] num = new int[6];

        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<num.length; i++){
            stringBuilder.append(chess[i]-num[i] + " ");
        }

        System.out.println(stringBuilder);
    }
}
