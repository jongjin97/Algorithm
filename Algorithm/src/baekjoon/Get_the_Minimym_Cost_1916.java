package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Get_the_Minimym_Cost_1916 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<List<Node>> list = new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            String[] str = br.readLine().split(" ");
            list.get(Integer.parseInt(str[0])).add(new Node(Integer.parseInt(str[1]), Integer.parseInt(str[2])));
        }
        String[] str = br.readLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);

        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Node> queue = new PriorityQueue();
        queue.add(new Node(start, 0));

        while (!queue.isEmpty()){
            Node node = queue.poll();

            if(node.cost > dist[node.index])
                continue;

            for(Node nodes : list.get(node.index)){
                if(dist[nodes.index] > dist[node.index] + nodes.cost){
                    dist[nodes.index] = dist[node.index] + nodes.cost;
                    queue.add(new Node(nodes.index, dist[nodes.index]));
                }
            }
        }

        bw.write(String.valueOf(dist[end]));
        bw.flush();

    }

    public static class Node implements Comparable<Node>{
        int index;
        int cost;

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }

        Node(int index, int cost){
            this.index = index;
            this.cost = cost;
        }
    }
}
