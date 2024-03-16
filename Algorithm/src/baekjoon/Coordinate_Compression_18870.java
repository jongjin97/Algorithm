package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
//좌표 압축
public class Coordinate_Compression_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arr2 = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                continue;
            } else {
                map.put(arr[i], cnt);
                cnt++;
            }
        }
        for(int i=0; i<arr2.length; i++){
            bw.write(map.get(arr2[i]) + " ");
        }
        bw.flush();

    }
}
