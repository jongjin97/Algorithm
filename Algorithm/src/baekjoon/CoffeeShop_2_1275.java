package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//커피숍2
public class CoffeeShop_2_1275 {
    static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        long[] tree = new long[N*4];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        init(arr, tree, 1, 0, N-1);
        for(int i=0; i<Q; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int e = Math.max(a, b);
            int s = Math.min(a, b);
            result = 0;
            find(tree, 1, s-1, e-1, 0, N-1);
            bw.write(String.valueOf(result));
            bw.newLine();
            update(tree, 1, c-1, d, 0, N-1);
        }
        bw.flush();

    }
    public static void update(long[] tree, int index, int pos, int num, int left, int right){
        if(left == right && left == pos){
            tree[index] = num;
            return;
        }
        int mid = (left + right)/2;
        if(left <= pos && pos <= mid)
            update(tree, index*2, pos, num, left, mid);
        if(mid+1 <= pos && right >= pos)
            update(tree, index*2+1, pos, num, mid+1, right);
        tree[index] = tree[index*2] + tree[index*2+1];
    }
    public static void find(long[] tree, int index, int start, int end, int left, int right){
        if(left > end || right < start){
            return;
        }
        if(left >= start && right <= end){
            result += tree[index];
            return;
        }
        int mid = (left + right)/2;
        find(tree, index*2, start, end, left, mid);
        find(tree, index*2+1, start, end, mid+1, right);
    }
    public static void init(int[] arr, long[] tree, int index, int left, int right){
        if(left == right){
            tree[index] = arr[left];
            return;
        }

        int mid = (left + right)/2;
        init(arr, tree, index*2, left, mid);
        init(arr, tree, index*2+1, mid+1, right);
        tree[index] = tree[index*2] + tree[index*2+1];
    }
}
