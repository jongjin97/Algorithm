package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Tree_1068 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int start = 0;
        ArrayList<node>[] nodes = new ArrayList[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            nodes[i] = new ArrayList<>();
        }
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num != -1)
                nodes[num].add(new node(i));
            else
                start = i;
        }
        Stack<node> stack = new Stack<>();
        int result = 0;
        if(x != start){
            stack.push(new node(start));
        }
        while(!stack.isEmpty()){
            node node = stack.pop();
            if(nodes[node.index].size() != 0){
                nodes[node.index].removeIf(no -> no.index == x);
            }
            if(nodes[node.index].size() == 0)
                result++;
            for(node no : nodes[node.index]){
                if(no.index != x){
                    stack.push(no);
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static class node{
        int index;

        node(int index){
            this.index = index;
        }
    }
}
