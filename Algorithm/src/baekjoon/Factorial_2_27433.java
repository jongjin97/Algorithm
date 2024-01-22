package baekjoon;

import java.util.Scanner;

public class Factorial_2_27433 {
    static long min = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0){
            System.out.println(1);
            return;
        }
        func(num, 1);

        System.out.println(min);;
    }
    public static void func(int end, int start){
        if(end == start){
            min*=start;
            return;
        }
        min*= start;
        func(end, start+1);
    }
}
