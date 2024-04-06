package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//DFS와 BFS
public class dfs_and_bfs_1260 {
    static boolean[] dfs;
    static boolean[] bfs;
    static int cnt;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st =  new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(int i=1; i<=N; i++){
            list.get(i).sort((o1, o2) -> o1-o2);
        }
        dfs = new boolean[N+1];
        bfs = new boolean[N+1];
        cnt = 1;
        dfs(list, V);
        bw.newLine();
        cnt = 1;
        bfs(list, V);

        bw.flush();
    }

    public static void dfs(ArrayList<ArrayList<Integer>> list, int V) throws IOException {
        if(dfs[V]) {
            return;
        }
        dfs[V] = true;
        bw.write(V + " ");
        for(int i : list.get(V)){
            if(!dfs[i])
                dfs(list, i);
        }
    }
    public static void bfs(ArrayList<ArrayList<Integer>> list, int V) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);

        while (!queue.isEmpty()){
            int tmp = queue.poll();
            if(!bfs[tmp])
                bw.write(tmp + " ");
            bfs[tmp] = true;

            for(int i : list.get(tmp)){
                if(!bfs[i]) {
                    queue.add(i);
                }
            }
        }
    }
}
