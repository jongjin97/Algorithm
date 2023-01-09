package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Previous_Permutations_10973 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        if(prev_permutation(num)) {
            for (int i = 0; i < N; i++) {
                System.out.print(num[i] + " ");
            }
        } else {
            System.out.println(-1);
        }
    }

    public static boolean prev_permutation(int[] num){
        int i = num.length-1;
        while(i>0 && num[i-1] <= num[i]){
            i--;
        }
        if(i<=0){
            return false;
        }
        int j = num.length-1;
        while(num[j] >= num[i-1]){
            j--;
        }
        int temp = num[i-1];
        num[i-1] = num[j];
        num[j] = temp;

        j = num.length-1;
        while(i<j){
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}
