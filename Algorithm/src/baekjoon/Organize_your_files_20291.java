package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Organize_your_files_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String[] str = br.readLine().split("\\.");
            map.merge(str[1], 1, (a, b) -> map.get(str[b]) + b);
        }
        String[] str = map.keySet().toArray(new String[0]);
        Arrays.sort(str);
        for(int i=0; i<str.length; i++){
            System.out.println(str[i] + " " + map.get(str[i]));
        }
    }
}
