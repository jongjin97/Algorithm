package baekjoon;

import java.io.*;

public class master_of_recursion_25501 {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0){
            String s = br.readLine();
            cnt = 0;
            int n = isPalindrome(s);
            bw.write(n + " " + cnt + "\n");
        }
        bw.flush();
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}
