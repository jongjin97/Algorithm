package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Josephus_Question_0_11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int index = K-1;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=N; i++){
            list.add(i);
        }
        // 1 2 ? 4 5 6 7
        bw.write("<");
        while (!list.isEmpty()){
            if(index >= list.size()){
                index %= list.size();
            }
            if(list.size() > 1)
                bw.write(list.get(index) + ", ");
            else
                bw.write(String.valueOf(list.get(index)));
            list.remove(index);
            index+= K-1;
        }
        bw.write(">");
        bw.flush();
    }
}
