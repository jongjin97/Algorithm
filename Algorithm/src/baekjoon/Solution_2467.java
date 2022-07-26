package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Solution_2467 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        String[] str = br.readLine().split(" ");
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int left = 0;
        int right = size-1;
        int sum = Integer.MAX_VALUE;
        int[] result = new int[2];
        while(left < right){
            int tmp = Math.abs(arr[left] + arr[right]);

            if(tmp < sum){
                sum = tmp;
                result[0] = arr[left];
                result[1] = arr[right];
            }
            if(sum == 0)
                break;
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                left++;
            } else {
                right--;
            }
        }
        bw.write(result[0] + " " + result[1]);
        bw.flush();
    }
}
