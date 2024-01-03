package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minimum_10868 {
    static int res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N];
        int[] tree = new int[4*N];
        for(int i=0; i<num.length; i++){
            st = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(st.nextToken());
        }

        init(tree, 0, N-1, 1, num);

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            res = Integer.MAX_VALUE;
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            find(tree, start, end, 0, N-1, 1);
            System.out.println(res);
        }
        System.out.println();
    }
    //start, end 고정
    // left >= start
    // right <= end
    // 0 9 0 9
    // 0 9 2 4
    public static void find(int[] tree, int start, int end, int left, int right, int index){
        int mid = (left + right)/2;
        if(end < left || start > right){
            return;
        }
        if(left >= start && right <= end){
            res = Math.min(res, tree[index]);
            return;
        }
        find(tree, start, end, left, mid, index*2);
        find(tree, start, end, mid+1, right, index*2+1);

    }
    public static void init(int[] tree, int left, int right, int index, int[] num){
        if(left == right){
            tree[index] = num[left];
            return;
        }
        int mid = (left+right)/2;
        init(tree, left, mid, index*2, num);
        init(tree, mid+1, right, index*2+1, num);
        tree[index] = Math.min(tree[index*2], tree[index*2+1]);
    }
}
