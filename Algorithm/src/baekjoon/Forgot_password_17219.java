package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Forgot_password_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        HashMap<String, String> hashMap = new HashMap<>();

        for(int i=0; i<N; i++){
            str = br.readLine().split(" ");
            hashMap.put(str[0], str[1]);
        }
        for(int i=0; i<M; i++){
            System.out.println(hashMap.get(br.readLine()));
        }
    }
}
