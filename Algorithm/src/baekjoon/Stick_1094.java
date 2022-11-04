package baekjoon;

import java.util.Scanner;

public class Stick_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int stick = 64;
        int result = 0;
        int sum = 0;

        while(sum != num){
            if(stick + sum > num){
                stick/=2;
            } else {
                sum += stick;
                stick/=2;
                result++;
            }
        }
        System.out.println(result);
    }
}
