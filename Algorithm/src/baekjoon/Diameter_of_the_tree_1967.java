package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Diameter_of_the_tree_1967 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<node>[] nodes = new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            nodes[i] = new ArrayList<>();
        }
        for(int i=1; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            nodes[a].add(new node(b, c));
            nodes[b].add(new node(a, c));
        }
        nodes[0].add(new node(1, 0));
        boolean[] check = new boolean[n+1];
        Stack<node> stack = new Stack<>();
        stack.push(nodes[0].get(0));
        int index = 0;
        int weight = 0;
        while (!stack.isEmpty()){
            node node = stack.pop();
            check[node.index] = true;

            if(weight < node.weight){
                index = node.index;
                weight = node.weight;
            }
            for(node no : nodes[node.index]){
                if(!check[no.index])
                    stack.push(new node(no.index, node.weight + no.weight));
            }
        }
        stack.push(new node(index, 0));
        check = new boolean[n+1];
        while (!stack.isEmpty()){
            node node = stack.pop();
            check[node.index] = true;

            if(weight < node.weight){
                index = node.index;
                weight = node.weight;
            }
            for(node no : nodes[node.index]){
                if(!check[no.index])
                    stack.push(new node(no.index, node.weight + no.weight));
            }
        }
        System.out.println(weight);
    }

    public static class node{
        int index;
        int weight;

        node(int index, int weight){
            this.index = index;
            this.weight = weight;
        }
    }
}
