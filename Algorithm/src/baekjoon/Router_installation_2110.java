package baekjoon;

import java.io.*;
import java.util.*;
//공유기 설치
public class Router_installation_2110 {
    static int[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        list = new int[N];
        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);

        int lo = 1;
        int hi = list[N-1] - list[0] + 1;
        while (lo < hi){
            int mid = (lo+hi)/2;

            if(func(mid) < C){
                hi = mid;
            }else {
                lo = mid + 1;
            }
        }

        System.out.println(lo-1);
    }

    public static int func(int d){
        int cnt = 1;
        int locate = list[0];

        for(int i=1; i<list.length; i++){
            int curr = list[i];

            if(curr-locate >= d){
                cnt++;
                locate = curr;
            }
        }
        return cnt;

    }
}
