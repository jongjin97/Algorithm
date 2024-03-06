package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gas_station_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        long result = Long.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        long[] len = new long[N-1];
        long[] price = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<len.length; i++){
            len[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<price.length; i++){
            price[i] = Integer.parseInt(st.nextToken());
        }
        func(len, price, price[0], 0, 0);
    }

    public static void func(long[] len, long[] price, long min, int index, long sum){
        if(index == len.length){
            System.out.println(sum);
            return;
        }
        long tmp = Math.min(min, price[index]);
        func(len, price, tmp, index+1, sum+tmp*len[index]);
    }
}
