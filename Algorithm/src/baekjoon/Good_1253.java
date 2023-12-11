package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Good_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int result = 0;
        String[] str = br.readLine().split(" ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);


        for(int i = 0; i < N; i++) {
            //인덱스는 양쪽 끝에 위치
            int left = 0;
            int right = N - 1;

            while(left < right) {
                if(arr[left] + arr[right] == arr[i])
                    if(i == left) { //다른 수 확인
                        left++;
                    }
                    else if(i == right) { //다른 수 확인
                        right--;
                    }
                    else {
                        result++;
                        break;
                    }
                else if(arr[left] + arr[right] > arr[i])
                    right--;
                else
                    left++;
            }
        }
        System.out.println(result);
    }
}
