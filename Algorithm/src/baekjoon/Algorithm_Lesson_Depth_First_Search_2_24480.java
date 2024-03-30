package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Algorithm_Lesson_Depth_First_Search_2_24480 {
    static BufferedWriter bw;
    static int[] res;
    static int cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[N+1];
        res = new int[N+1];
        res[R] =1;
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(int i=0; i<=N; i++){
            list.get(i).sort((o1, o2) -> o2-o1);
        }
        dfs(list, visited, R);
        for(int i=1; i<=N; i++){
            bw.write(res[i]+"\n");
        }
        bw.flush();
    }

    public static void dfs(ArrayList<ArrayList<Integer>> list, boolean[] visited, int r) throws IOException {
        visited[r] = true;
        for(int i : list.get(r)){
            if(!visited[i]){
                res[i] = ++cnt;
                dfs(list, visited, i);
            }
        }

    }
}
