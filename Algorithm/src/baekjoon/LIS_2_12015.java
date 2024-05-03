package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
//가장 긴 증가하는 부분 수열 2
public class LIS_2_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            int tmp = list.get(list.size()-1);
            if(tmp < arr[i]){
                list.add(arr[i]);
            } else if(tmp > arr[i]) {
                int lo = 0;
                int hi = list.size()-1;
                while (lo < hi){
                    int mid = (lo+hi)/2;

                    if(arr[i] <= list.get(mid)){
                        hi = mid;
                    } else {
                        lo = mid+1;
                    }
                }

                list.set(lo, arr[i]);

            }
        }
        System.out.println(list.size());
    }
}
