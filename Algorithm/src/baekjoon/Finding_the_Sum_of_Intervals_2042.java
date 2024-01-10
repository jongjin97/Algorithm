package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//구간 합 구하기
public class Finding_the_Sum_of_Intervals_2042 {
    static long sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[] arr = new long[N];
        long[] tree = new long[N*4];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Long.parseLong(st.nextToken());
        }

        init(arr, tree, 1, 0, N-1);
        for(int i=0; i<M+K; i++){
            sum = 0L;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if(a == 1){
                update(1, b-1, c, tree, 0,N-1);
            } else if(a == 2){
                find(tree, b-1, c-1, 0, N-1, 1);
                bw.write(String.valueOf(sum));
                bw.newLine();
            }
        }
        bw.flush();

    }
    public static void find(long[] tree, long start, long end, int left, int right, int index){
        if(left > end || right < start){
            return;
        }
        if(start <= left && end >= right){
            sum += tree[index];
            return;
        }
        int mid = (left + right)/2;
        find(tree, start, end, left, mid, index*2);
        find(tree, start, end, mid+1, right, index*2+1);
    }
    public static void update(int index, long pos, long ch, long[] tree, int left, int right){
        if(left == right && left == pos){
            tree[index] = ch;
            return;
        }
        int mid = (left + right)/2;
        if(pos <= mid){
            update(index*2, pos, ch, tree, left, mid);
        } else {
            update(index*2+1, pos, ch, tree, mid+1, right);
        }
        tree[index] = tree[index*2] + tree[index*2+1];
    }
    public static void init(long[] arr, long[] tree, int index, int left, int right){
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
