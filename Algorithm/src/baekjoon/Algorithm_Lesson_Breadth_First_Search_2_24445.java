package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Algorithm_Lesson_Breadth_First_Search_2_24445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
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
        int[] result = new int[N+1];
        bfs(list, result ,R);

        for(int i=1; i<=N; i++){
            bw.write(result[i] + "\n");
        }
        bw.flush();
    }

    public static void bfs(ArrayList<ArrayList<Integer>> list, int[] E, int R) throws IOException {
        boolean[] visited = new boolean[list.size()];
        visited[R] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(R);
        int cnt = 1;
        while (!queue.isEmpty()){
            int tmp = queue.poll();
            E[tmp] = cnt++;
            for(int i : list.get(tmp)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}
