package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//수들의 합 7
public class Sum_of_numbers_7_2268 {
    static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] tree = new long[N*4];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0){
                result = 0;
                int min = Math.min(b,c);
                int max = Math.max(b,c);
                find(tree, 1, min-1, max-1, 0, N-1);
                bw.write(String.valueOf(result));
                bw.newLine();
            } else if (a == 1){
                update(tree, 1, b-1, c, 0, N-1);
            }
        }
        bw.flush();
    }
    public static void update(long[] tree, int index, int pos, int num, int left, int right){
        if(left == right && left == pos){
            tree[index] = num;
            return;
        }
        if(left > pos || right < pos)
            return;
        int mid = (left + right)/2;
        update(tree, index*2, pos, num, left, mid);
        update(tree, index*2+1, pos, num, mid+1, right);
        tree[index] = tree[index*2] + tree[index*2+1];
    }

    public static void find(long[] tree, int index, int start, int end, int left, int right){
        if(left > end || right < start){
            return;
        }
        if(left >= start && right <=end){
            result += tree[index];
            return;
        }
        int mid = (left + right)/2;
        find(tree, index*2, start, end, left, mid);
        find(tree, index*2+1, start, end, mid+1, right);
    }
}
