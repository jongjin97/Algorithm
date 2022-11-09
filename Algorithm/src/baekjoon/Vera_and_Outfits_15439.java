package baekjoon;

import java.util.Scanner;

public class Vera_and_Outfits_15439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        for(int i =0;i <N; i++){
            for(int j=0; j<N; j++){
                if(i!=j)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
