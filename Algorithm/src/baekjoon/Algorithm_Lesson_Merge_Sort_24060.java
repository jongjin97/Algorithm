package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
//알고리즘 수업 - 병합 정렬 1
public class Algorithm_Lesson_Merge_Sort_24060 {
    static int cnt = 0;
    static int num = -1;
    static int K;
    static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        tmp = new int[N];
        merge_sort(arr, 0, N-1);

        System.out.println(num);
    }
    public static void merge_sort(int[] arr, int p, int r){
        if(p < r){
            int q = (p+r)/2;
            merge_sort(arr, p, q);
            merge_sort(arr, q+1, r);
            if(K == cnt)
                return;
            merge(arr, p, q, r);
        }
    }
    public static void merge(int[] arr, int p, int q, int r){
        int i = p;
        int j = q + 1;
        int t = 0;
        //tmp = new int[arr.length];
        while (i<=q && j<=r){
            if(arr[i] <= arr[j]){
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }
        while (i <=q){
            tmp[t++] = arr[i++];
        }
        while (j <= r){
            tmp[t++] = arr[j++];
        }
        i = p;
        t = 0;
        while (i <= r){
            cnt++;
            if(K == cnt) {
                num = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }
    }
}
