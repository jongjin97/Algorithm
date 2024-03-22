package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
//오등큰수
public class Be_greater_than_me_on_the_right_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] result = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++){
            while (!stack.isEmpty() && map.get(arr[stack.peek()]) < map.get(arr[i])){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            result[stack.pop()] = -1;
        }
        for(int i : result)
            bw.write(i + " ");
        bw.flush();
    }
}
