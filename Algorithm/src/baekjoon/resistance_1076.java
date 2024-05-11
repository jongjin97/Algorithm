package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
//저항
public class resistance_1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);

        String[] str = new String[3];
        for(int i=0; i<str.length; i++){
            str[i] = br.readLine();
        }

        long result = 0;
        result+= map.get(str[0])*10;
        result+= map.get(str[1]);
        result *= (long) Math.pow(10, map.get(str[2]));
        System.out.println(result);
    }
}
