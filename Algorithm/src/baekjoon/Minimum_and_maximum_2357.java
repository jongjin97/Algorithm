package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//최솟값과 최댓값
public class Minimum_and_maximum_2357 {
    static int MAX;
    static int MIN;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] max = new int[N*4];
        int[] min = new int[N*4];

        for(int i=0; i<arr.length; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        init(arr, max, min, 1, 0, N-1);

        for(int i=0; i<M; i++){
            MAX = Integer.MIN_VALUE;
            MIN = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            find(max, min, 1, 0, N-1, a-1, b-1);
            bw.write(MIN + " " + MAX);
            bw.newLine();
        }
        bw.flush();
    }

    public static void find(int[] max, int[] min, int index, int left, int right, int start, int end){
        if(left > end || right < start){
            return;
        }
        if(start <= left && right <= end){
            MAX = Math.max(MAX, max[index]);
            MIN = Math.min(MIN, min[index]);
            return;
        }
        int mid = (left + right)/2;
        find(max, min, index*2, left, mid, start, end);
        find(max, min, index*2+1, mid+1, right, start, end);
    }

    public static void init(int[] arr, int[] max, int[] min, int index, int left, int right){
        if(left == right){
            min[index] = arr[left];
            max[index] = arr[left];
            return;
        }

        int mid = (left + right)/2;
        init(arr, max, min, index*2, left, mid);
        init(arr, max, min, index*2+1, mid+1, right);
        min[index] = Math.min(min[index*2], min[index*2+1]);
        max[index] = Math.max(max[index*2], max[index*2+1]);
    }
}
