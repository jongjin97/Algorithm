package programmers;

import java.util.ArrayList;

public class Sheep_and_wolves {
    static ArrayList<Integer>[] lists;
    static boolean[][][] visit;
    static int[] infos;
    static int max = 0;

    public static void main(String[] args) {
        int[] info = {0,0,1,1,1,0,1,0,1,0,1,1};
        int[][] edgs = {{0,1}, {1,2}, {1,4}, {0,8}, {8,7}, {9,10}, {9,11}, {4,3}, {6,5}, {4,6}, {8,9}};

        solution(info, edgs);
    }

    public static int solution(int[] info, int[][] edges) {
        int answer = 0;
        infos = info;
        lists = new ArrayList[info.length];
        for(int i=0; i<info.length; i++){
            lists[i] = new ArrayList<>();
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            lists[a].add(b);
            lists[b].add(a);
        }
        visit = new boolean[info.length][info.length][info.length];

        dfs(0,0,0);
        answer = max;

        return answer;
    }

    public static void dfs(int s, int w, int index){
        if(infos[index] == 0){
            s++;
        } else if(infos[index] == 1){
            w++;
        }
        if(w >= s){
            return;
        }
        max = Math.max(s, max);

        for(int i=0; i<lists[index].size(); i++){
            int next = lists[index].get(i);
            int tmp = infos[index];
            if(!visit[next][s][w]){
                infos[index] = -1;
                visit[index][s][w] = true;
                dfs(s,w,next);
                infos[index] = tmp;
                visit[index][s][w] = false;
            }
        }
    }
}
