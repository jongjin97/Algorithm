package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Count_counting_10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        System.out.println(Arrays.stream(num).filter(value -> value==v).toArray().length);
    }
}
