package baekjoon;

import java.util.Scanner;

public class Sum_of_numbers_5_2018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int left = 0;
        int right = 1;
        int sum = 1;
        int result = 0;
        while(left <= right){
            if(sum == N){
                result++;
            }
            if(sum > N){
                sum -= left++;
            } else {
                sum += ++right;
            }
        }
        System.out.println(result);
    }
}
