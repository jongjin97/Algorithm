package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Jumong_1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int cnt = 0;
        int start = 0;
        int end = n-1;
        Arrays.sort(arr);
        while(start < end){
            if(arr[start] + arr[end] == m) cnt++;
            if(arr[start] + arr[end] < m) start++;
            else end--;
        }
        System.out.println(cnt);
    }
}
