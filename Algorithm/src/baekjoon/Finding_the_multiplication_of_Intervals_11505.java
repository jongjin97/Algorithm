package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//구간 곱 구하기
public class Finding_the_multiplication_of_Intervals_11505 {
    static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        long[] tree = new long[N*4];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        init(arr, tree, 1, 0, N-1);

        for(int i=0; i<M+K; i++){
            result = 1L;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 1){
                update(tree, 1, b-1, c, 0, N-1);
            } else if(a == 2){
                find(tree, 1, b-1, c-1, 0, N-1);
                bw.write(String.valueOf(result));
                bw.newLine();
            }
        }
        bw.flush();
    }
    public static void find(long[] tree,int index, int start, int end, int left, int right){
        if(left > end || right < start)
            return;
        if(left >= start && right <= end){
            //result = (result*tree[index])%1000000007;
            if(tree[index] != 0 && result != 0){
                long num = (result*tree[index])%1000000007;
                if(num == 0) {
                    result = 1000000007;
                    return;
                }
            }
            result = (result*tree[index])%1000000007;
            return;
        }
        int mid = (left + right)/2;
        find(tree, index*2, start, end, left, mid);
        find(tree, index*2+1, start, end, mid+1, right);
    }
    public static void update(long[] tree, int index, int pos, int num, int left, int right){
        if(left == right && left == pos){
            tree[index] = num;
            return;
        }
        int mid = (left + right)/2;
        if(pos >= left && pos <= mid){
            update(tree, index *2, pos, num, left, mid);
        } else if(pos > mid && pos <=right){
            update(tree, index*2+1, pos, num, mid+1, right);
        }


        if(tree[index*2] != 0 && tree[index*2+1] != 0){
            long n = (tree[index*2]*tree[index*2+1])%1000000007;
            if(n == 0) {
                tree[index] = 1000000007;
                return;
            }
        }

        tree[index] = (tree[index*2]*tree[index*2+1])%1000000007;
    }
    public static void init(int[] arr, long[] tree, int index, int left, int right){
        if(left == right){
            tree[index] = arr[left];
            return;
        }
        int mid = (left + right)/2;
        init(arr, tree, index*2, left, mid);
        init(arr, tree, index*2+1, mid+1, right);

        if(tree[index*2] != 0 && tree[index*2+1] != 0){
            long num = (tree[index*2]*tree[index*2+1])%1000000007;
            if(num == 0) {
                tree[index] = 1000000007;
                return;
            }
        }
        tree[index] = (tree[index*2]*tree[index*2+1])%1000000007;
    }
}
