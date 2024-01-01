package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Best_seller_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<N; i++){
            String str= br.readLine();
            if(hashMap.containsKey(str)){
                hashMap.put(str, hashMap.get(str) + 1);
            } else {
                hashMap.put(str, 1);
            }
        }
        Set<String> set = hashMap.keySet();
        int max = 0;
        for (String string : set) {
            max = Math.max(hashMap.get(string), max);
        }
        List<String> list = new ArrayList<>();
        for(String string : set){
            if(hashMap.get(string) == max)
                list.add(string);
        }
        String[] arr = list.toArray(new String[0]);
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
