package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Coin_9084 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt(); // 동전 개수
            int a[] = new int[n+1];
            for(int i=1;i<=n;i++) a[i] = sc.nextInt();

            int m = sc.nextInt(); // 목표
            int d[] = new int[m+1];//테스트케이스만큼 돌려야 하므로 매 케이스마다 선언해 초기화함

            d[0] = 1;
            for (int i = 1; i <= n; i++)
                for (int j = a[i]; j <= m; j++)
                    d[j] += d[j - a[i]];
            System.out.println(d[m]);
            for(int i=0; i<d.length; i++){
                System.out.println(i + " : " + d[i]);
            }
        }
        sc.close();
    }

}
