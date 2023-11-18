package baekjoon;

import java.util.Scanner;

public class N_Queen_9663 {
    static int result = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nQueen(arr, 0, n);
        System.out.println(result);
    }
    public static void nQueen(int[] arr, int depth, int n){
        if(depth == n){
            result++;
            return;
        }
        for(int i=0; i<n; i++){
            arr[depth] = i;
            if(check(arr, depth)){
                nQueen(arr, depth+1, n);
            }
        }
    }
    public static boolean check(int[] arr, int depth){
        for(int i=0; i<depth; i++) {
            if (arr[i] == arr[depth] || Math.abs(depth - i) == Math.abs(arr[depth] - arr[i]))
                return false;
        }
        return true;
    }
}
