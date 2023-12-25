package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delicious_food_made_by_Doyoung_2961 {
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        br.close();
        result = Math.abs(arr[0][0] - arr[0][1]);
        func(arr, 0, 1, 0, 0);
        System.out.println(result);
    }

    static public void func(int[][] arr, int index, int sour, int bitter, int cnt){
        if(index == arr.length) {
            if(cnt != 0)
                result = Math.min(result, Math.abs(sour - bitter));
            return;
        }
        func(arr, index+1, sour*arr[index][0], bitter+arr[index][1], cnt + 1);
        func(arr, index+1, sour, bitter, cnt);

    }
}
