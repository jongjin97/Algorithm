package baekjoon;

import java.io.*;
import java.util.HashSet;

public class Subtracting_duplicates_and_sorting_10867 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < N; i++) {
            set.add(Integer.parseInt(str[i]));
        }

        set.stream().sorted().forEach( i -> {
            try {
                bw.write(i + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bw.flush();
    }
}
