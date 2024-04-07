package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Find_the_minimum_cost_1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] dist = new int[N+1];
        Node[] nodes = new Node[N+1];
        StringTokenizer st;
        for(int i=0; i<=N; i++){
            nodes[i] = new Node(i, 0);
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            nodes[a].list.add(new Node(b, c));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((o1, o2) -> o1.dist - o2.dist);
        priorityQueue.add(nodes[start]);
        dist[start] = 0;
        while (!priorityQueue.isEmpty()){
            Node curr  = priorityQueue.poll();

            if(curr.dist > dist[curr.index])
                continue;

            for(Node node : nodes[curr.index].list){
                if(dist[node.index] > dist[curr.index] + node.dist){
                    dist[node.index] = dist[curr.index] + node.dist;
                    priorityQueue.add(node);
                }
            }
        }

        System.out.println(dist[end]);
    }

    static class Node {
        int index;
        int dist;
        ArrayList<Node> list;
        Node(int index, int dist){
            this.index = index;
            this.dist = dist;
            list = new ArrayList<>();
        }
    }
}
