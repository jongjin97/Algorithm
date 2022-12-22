package baekjoon;

import java.io.*;

public class Who_hasnt_done_the_assignment_5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] num = new boolean[31];
        for(int i=0; i<28; i++){
            int n = Integer.parseInt(br.readLine());

            num[n] = true;
        }
        for(int i=1; i<30; i++){
            if(!num[i])
                bw.write(i+"\n");
        }
        bw.flush();
    }
}
