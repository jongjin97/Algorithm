package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Receipt_25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            X -= price*cnt;
        }
        if(X == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
