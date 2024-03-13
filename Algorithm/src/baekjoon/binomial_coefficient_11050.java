package baekjoon;

import java.util.Scanner;
//이항 계수 1
public class binomial_coefficient_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<=N; i++){
            arr[i] = arr[i-1]*i;
        }
        System.out.println(arr[N]/(arr[N-K]*arr[K])  );
    }
}
