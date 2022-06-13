package baekjoon;

import java.util.Scanner;

public class N_and_M_2_15650 {

    static StringBuilder st = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        func(a,b,0 , "",1);
        System.out.println(st);
    }

    public static void func(int a, int b, int cnt, String str, int num){
        if(b == cnt){
            str = str.substring(1);
            st.append(str+"\n");
            return;
        }

        for(int i=num; i<=a; i++){
            func(a,b,cnt+1,str + " " + i,i+1);
        }
    }
}
