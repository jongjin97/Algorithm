package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Create_a_password_1759 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[] chars = new char[C];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<C; i++){
            String str = st.nextToken();
            chars[i] = str.charAt(0);
        }
        char[] save = new char[L];
        Arrays.sort(chars);

        rec(L, chars, 0, 0, 0, 0, save);
        bw.flush();
    }

    public static void rec(int L, char[] chars, int cnt1, int cnt2, int sum, int index, char[] save) throws IOException {
        if(sum == L){
            if(cnt1 >= 1 && cnt2 >= 2){
                for(int i=0; i<save.length; i++){
                    bw.write(save[i]);
                }
                bw.newLine();
            }
            return;
        }

        for(int i=index; i<chars.length; i++){
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'u' || chars[i] == 'o' || chars[i] == 'i'){
                save[sum] = chars[i];
                rec(L, chars, cnt1+1, cnt2, sum+1, i+1, save);
                save[sum] = '0';
            } else {
                save[sum] = chars[i];
                rec(L, chars, cnt1, cnt2+1, sum+1, i+1, save);
                save[sum] = '0';
            }

        }
    }
}
