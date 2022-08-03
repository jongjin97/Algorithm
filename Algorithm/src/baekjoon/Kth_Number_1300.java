package baekjoon;

import java.lang.management.MemoryType;
import java.util.Scanner;

public class Kth_Number_1300 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int min = 1;
        int max = K;
        int mid = (min + max)/2;

        while(min < max){
            mid = (min + max) /2;
            int tmp = 0;
            for(int i=1; i<=N; i++){
                tmp += Math.min(mid / i, N);
            }
            if(K <= tmp){
                max = mid;
            } else{
                min = mid+1;
            }
        }
        System.out.println(min);
        // 0 1 2 3 4
        // 1 1 2 3 4
        // 2 2 4 6 8
        // 3 3 6 9 12
        // 4 4 8 12 16

    }
}
