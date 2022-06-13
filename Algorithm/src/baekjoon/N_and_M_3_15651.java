package baekjoon;

import java.util.Scanner;

public class N_and_M_3_15651 {
    static StringBuilder st = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        func(a,b,0 , "");
        System.out.println(st);
    }

    public static void func(int a, int b, int cnt, String str){
        if(b == cnt){
            str = str.substring(1);
            st.append(str+"\n");
            return;
        }

        for(int i=1; i<=a; i++){
            func(a,b,cnt+1,str + " " + i);
        }
    }
}
