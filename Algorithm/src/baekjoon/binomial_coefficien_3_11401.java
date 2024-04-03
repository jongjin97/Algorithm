package baekjoon;

import java.util.Scanner;
//이항 계수 3
public class binomial_coefficien_3_11401 {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long[] arr = new long[N+1];
        arr[1] = 1;
        arr[0] = 1;
        for(int i=2; i<=N; i++){
            arr[i] = (arr[i-1] * i) % mod;
        }
        long tmp = (arr[K]%mod)*(arr[N-K]%mod)%mod;
        //n^11 = n^5 + n^5 * n;
        long f = func(mod-2, tmp);
        long res = (arr[N]*f)%mod;
        System.out.println(res%mod);
    }
    public static long func(int p, long num){
        if(p == 1)
            return num%mod;
        long res = func(p/2, num)%mod;

        if(p%2 != 0){
            return (res*res%mod) * num % mod;
        }
        return res*res%mod;
    }
}
