package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Sum_of_two_arrays_2143 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long result = 0L;
        int T = Integer.parseInt(br.readLine());
        int A_size = Integer.parseInt(br.readLine());
        int[] A = new int[A_size+1];
        String[] str = br.readLine().split(" ");
        for(int i=1; i<A.length; i++){
            A[i] = A[i-1] +Integer.parseInt(str[i-1]);
        }
        int B_size = Integer.parseInt(br.readLine());
        str = br.readLine().split(" ");
        int[] B = new int[B_size+1];
        for(int i=1; i<B.length; i++){
            B[i] = B[i-1] + Integer.parseInt(str[i-1]);
        }

        ArrayList<Integer> AList = new ArrayList<>();

        for(int i=0; i<A.length; i++){
            for(int j=Math.max(1, i); j<A.length; j++){
                if(i == j)
                    continue;
                AList.add(A[j] - A[i]);
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<B.length; i++){
            for(int j=Math.max(1, i); j<B.length; j++){
                if(i == j)
                    continue;
                if(map.get(B[j] - B[i]) == null){
                    map.put(B[j] -B[i], 1);
                } else {
                    map.put(B[j] - B[i], map.get(B[j] - B[i]) + 1);
                }

            }
        }
        AList.sort((o1, o2) -> o1-o2);

        for(int i=0; i<AList.size(); i++){
            if(map.get(T - AList.get(i)) == null)
                continue;
            result += map.get(T - AList.get(i));
        }
        System.out.println(result);
    }
}
