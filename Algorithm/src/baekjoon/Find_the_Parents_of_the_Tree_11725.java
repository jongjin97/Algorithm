package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Find_the_Parents_of_the_Tree_11725 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[size+1];
        ArrayList<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<=size; i++){
            list.add(new ArrayList<>());
        }

        for(int i=1; i<size; i++){
            String[] str = br.readLine().split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);

            list.get(num1).add(num2);
            list.get(num2).add(num1);
        }
        int[] result = new int[size+1];
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        while (!stack.isEmpty()){
            int tmp = stack.pop();

            for(int i=0; i<list.get(tmp).size(); i++){
                if(!check[list.get(tmp).get(i)]){
                    stack.push(list.get(tmp).get(i));
                    check[list.get(tmp).get(i)] = true;
                    result[list.get(tmp).get(i)] = tmp;
                }
            }
        }

        for(int i=2; i<=size; i++){
            bw.write(String.valueOf(result[i]));
            bw.newLine();
        }
        bw.flush();
    }
}
