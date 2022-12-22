package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Number_of_different_substrings_11478 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        HashSet<String> hashSet = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            for(int j=i; j<=str.length(); j++){
                hashSet.add(str.substring(i,j));
            }
        }
        System.out.println(hashSet.size()-1);
    }
}
