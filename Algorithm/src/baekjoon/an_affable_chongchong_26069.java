package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
//붙임성 좋은 총총이
public class an_affable_chongchong_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(set.contains(a) || set.contains(b) || a.equals("ChongChong") || b.equals("ChongChong")){
                set.add(a);
                set.add(b);
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
    }
}
