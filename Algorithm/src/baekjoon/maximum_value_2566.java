package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//최댓값
public class maximum_value_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];

        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j] >= result){
                    x = i+1;
                    y = j+1;
                    result = arr[i][j];
                }
            }
        }

        System.out.println(result);
        System.out.println(x + " " + y);
    }
}
