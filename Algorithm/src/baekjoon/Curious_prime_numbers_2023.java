package baekjoon;

import java.io.*;
import java.util.ArrayList;

public class Curious_prime_numbers_2023 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        dfs("", n);

        bw.flush();
    }

    public static void dfs(String s , int n) throws IOException {
        if(s.length() == n){
            if(check(s))
                bw.write(s+"\n");
            return;
        }
        if(s.length()==0){
            dfs(s+2, n);
            dfs(s+3, n);
            dfs(s+5, n);
            dfs(s+7, n);
        } else{
            for(int i=1; i<10; i+=2){
                if(i!= 5){
                    dfs(s+i, n);
                }
            }
        }
    }

    public static boolean check(String s){
        int num = Integer.parseInt(s);
        while(num!=0){
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i == 0)
                    return false;
            }
            num/=10;
        }
        return true;
    }
}
