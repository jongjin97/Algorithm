package baekjoon;

import java.util.Scanner;
//타일 채우기
public class fill_tile_2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n+1];
        int[] arr2 = new int[n+1];

        arr[0] = 1;
        arr2[0] = 1;
        if(n >= 2) {
            arr[2] = 3;
            arr2[2] = 0;
        }
        for(int i=4; i<=n; i+=2){
            arr[i] = arr[i - 2] * 3;
            arr2[i] = arr[i-4]*2 + arr2[i-2];
            arr[i] += arr2[i];
        }
        System.out.println(arr[n]);
    }
}
