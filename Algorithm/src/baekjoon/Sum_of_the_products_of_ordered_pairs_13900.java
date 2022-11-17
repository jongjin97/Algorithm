package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Sum_of_the_products_of_ordered_pairs_13900 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n+1];
        int[] sum = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            num[i] = tmp;
            sum[i] += sum[i-1] + tmp;
        }
        long result = 0;
        for(int i=1; i<=n; i++){
            result += (long) sum[i - 1] * num[i];
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
