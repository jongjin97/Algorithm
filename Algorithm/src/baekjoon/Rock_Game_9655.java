package baekjoon;

import java.util.Scanner;

public class Rock_Game_9655 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;
        while(N != 0){
            cnt++;
            if(N>3)
                N-=3;
            else
                N-=1;
        }
        if(cnt%2 == 0)
            System.out.println("CY");
        else
            System.out.println("SK");
    }
}
