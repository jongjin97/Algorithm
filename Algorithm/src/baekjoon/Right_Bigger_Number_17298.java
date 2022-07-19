package baekjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Right_Bigger_Number_17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[size];

        String[] str = br.readLine().split(" ");

        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        for(int i=0; i<size; i++){
            if(stack.isEmpty()){
                stack.push(i);
            } else {
                if(arr[stack.peek()] >= arr[i])
                    stack.push(i);
                else{
                    while(!stack.isEmpty()){
                        if(arr[stack.peek()] < arr[i])
                            arr[stack.pop()] = arr[i];
                        else
                            break;
                    }
                    stack.push(i);
                }
            }
        }
        while(!stack.isEmpty()){
            arr[stack.pop()] = -1;
        }
        for(int i : arr)
            bw.write(Integer.toString(i) + " ");
        bw.flush();

    }
}
