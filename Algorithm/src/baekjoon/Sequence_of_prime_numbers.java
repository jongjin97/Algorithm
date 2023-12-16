package baekjoon;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Sequence_of_prime_numbers {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int N = sc.nextInt();
        int[] numbers = new int[N+1];
        for(int i=0; i< numbers.length; i++){
            numbers[i] = i;
        }
        prime(numbers);
        int left = 0;
        int right = 0;
        if(N == 1){
            System.out.println(0);
            return;
        }
        int num = arrayList.get(0);
        while (left <= right){
            if(right == arrayList.size())
                break;

            if(num == N){
                result++;
                if(left >= 0)
                    num -= arrayList.get(left);
                left++;
            } else if(num < N){
                right++;
                if(right != arrayList.size())
                    num += arrayList.get(right);
            } else {
                if(left >= 0)
                    num -= arrayList.get(left);
                left++;
            }
        }
        System.out.println(result);
    }

    public static void prime(int[] numbers) {
        for(int i=2; i< numbers.length; i++){
            if(numbers[i] == 0)
                continue;
            arrayList.add(i);
            for(int j=i*2; j< numbers.length; j+=i){
                numbers[j] = 0;
            }
        }
    }
}
