package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
//0과1
public class Zero_and_One_8111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0){
            int N = Integer.parseInt(br.readLine());

            System.out.println(func(N));

        }
    }

    public static String func(int N){
        Queue<Integer> queue = new LinkedList<>();
        Queue<String> stringQueue = new LinkedList<>();
        boolean[] visit = new boolean[20001];
        queue.add(1%N);
        stringQueue.add("1");

        while (!queue.isEmpty()){
            int num = queue.poll();
            String s = stringQueue.poll();
            if(num == 0){
                return s;
            }
            if(!visit[num*10%N]){
                queue.add(num*10%N);
                stringQueue.add(s+"0");
                visit[num*10%N] = true;
            }
            if(!visit[(num*10+1)%N]){
                queue.add((num*10+1)%N);
                stringQueue.add(s+"1");
                visit[(num*10+1)%N] = true;
            }
        }
        return "BRAK";
    }
}
