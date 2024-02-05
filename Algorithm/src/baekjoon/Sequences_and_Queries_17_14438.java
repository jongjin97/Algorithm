package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Sequences_and_Queries_17_14438 {
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] tree = new int[N*4];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        init(arr ,tree, 0, N-1, 1);
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<M; i++){
            result = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 1){
                update(tree, 0, N-1, 1, b-1, c);
            } else if(a == 2){
                find(tree, 0, N-1, b-1, c-1, 1);
                bw.write(String.valueOf(result));
                bw.newLine();
            }
        }
        bw.flush();
    }
    public static void find(int[] tree, int left, int right, int start, int end, int index){
        if(left >= start && right <= end){
            result = Math.min(result, tree[index]);
            return;
        }
        if(left > end || right < start){
            return;
        }
        int mid = (left + right)/2;
        find(tree, left, mid, start, end, index*2);
        find(tree, mid+1, right, start, end, index*2+1);
    }
    public static void init(int[] arr, int[] tree, int left, int right, int index){
        if(left == right){
            tree[index] = arr[left];
            return;
        }

        int mid = (left + right)/2;
        init(arr, tree, left, mid, index*2);
        init(arr, tree, mid+1, right, index*2+1);
        if(tree[index*2] == 0)
            tree[index*2] = Integer.MAX_VALUE;
        if(tree[index*2+1] == 0)
            tree[index*2+1] = Integer.MAX_VALUE;
        tree[index] = Math.min(tree[index*2], tree[index*2+1]);
    }

    public static void update(int[] tree, int left, int right, int index, int pos, int num){
        if(left == right && left == pos){
            tree[index] = num;
            return;
        }
        if(left > pos || right < pos)
            return;
        int mid = (left + right)/2;
        update(tree, left, mid, index*2, pos, num);
        update(tree, mid+1, right, index*2+1, pos, num);
        if(tree[index*2] == 0)
            tree[index*2] = Integer.MAX_VALUE;
        if(tree[index*2+1] == 0)
            tree[index*2+1] = Integer.MAX_VALUE;
        tree[index] = Math.min(tree[index*2], tree[index*2+1]);
    }
}

