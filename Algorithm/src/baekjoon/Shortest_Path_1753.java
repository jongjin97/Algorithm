package baekjoon;

import java.io.*;
import java.util.*;

public class Shortest_Path_1753 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int V = Integer.parseInt(str[0]);
        int E = Integer.parseInt(str[1]);
        int K = Integer.parseInt(br.readLine());
        List<List<Node>> list = new ArrayList<>();
        for(int i=0; i<=V; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<E; i++){
            str = br.readLine().split(" ");
            list.get(Integer.parseInt(str[0])).add(new Node(Integer.parseInt(str[1]), Integer.parseInt(str[2])));
        }

        PriorityQueue<Node> queue = new PriorityQueue();
        queue.add(new Node(K,0));
        int[] dist = new int[V+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K] = 0;
        while(!queue.isEmpty()){
            Node node = queue.poll();

            if(dist[node.index] < node.weight)
                continue;

            for(Node nodes : list.get(node.index)){
                if(dist[node.index] + nodes.weight < dist[nodes.index]){
                    dist[nodes.index] = dist[node.index] + nodes.weight;
                    queue.add(new Node(nodes.index, dist[nodes.index]));
                }
            }
        }

        for(int i=1; i<dist.length; i++){
            if(dist[i] == Integer.MAX_VALUE)
                bw.write("INF\n");
            else
                bw.write(dist[i] + "\n");
        }
        bw.flush();
    }

    public static class Node implements Comparable<Node>{
        int index;
        int weight;

        Node(int index, int weight){
            this.index = index;
            this. weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.weight, o.weight);
        }
    }
}
