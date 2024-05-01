package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

//나는야 포켓몬 마스터 이다솜
public class I_am_the_Pokemon_Master_Lee_Da_som_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> stringHashMap = new HashMap<>();

        for(int i=0; i<N; i++){
            String s = br.readLine();
            stringHashMap.put(String.valueOf(i+1), s);
            stringHashMap.put(s, String.valueOf(i+1));
        }
        for(int i=0; i<M; i++){
            bw.write(stringHashMap.get(br.readLine()));
            bw.newLine();
        }
        bw.flush();
    }
}
