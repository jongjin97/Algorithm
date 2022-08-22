package baekjoon;

import java.io.*;

public class Small_change_5585 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int[] money = {500, 100, 50, 10, 5, 1};
        int cur = 1000 - num;
        int result = 0;
        while(cur != 0){
            for(int i=0; i<money.length; i++){
                if(cur >= money[i]){
                    cur -= money[i];
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
