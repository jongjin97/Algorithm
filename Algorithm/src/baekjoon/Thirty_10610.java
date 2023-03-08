package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Thirty_10610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] arr = new int[10];

        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += arr[i] * i;
        }
        if(arr[0] == 0 || sum % 3 != 0) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 9; i >= 0; i--) {
                while(arr[i] > 0) {
                    sb.append(i);
                    arr[i]--;
                }
            }
            System.out.println(sb);
        }

    }
}
