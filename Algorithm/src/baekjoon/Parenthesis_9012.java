package baekjoon;

import java.io.*;

public class Parenthesis_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());

        for(int i=0; i<size; i++){
            String str = br.readLine();
            if(!check_cnt(str)) {
                bw.write("NO");
                bw.newLine();
                continue;
            } else if(check_balance(str)){
                bw.write("YES");
                bw.newLine();
            } else if(!check_balance(str)){
                bw.write("NO");
                bw.newLine();
            }
        }
        bw.flush();
    }
    public static boolean check_balance(String str){
        String[] arr= str.split("");
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(cnt == 0 && arr[i].equals(")")){
                return false;
            } else if(arr[i].equals("(")){
                cnt++;
            } else if(arr[i].equals(")")){
                cnt--;
            }
        }

        return true;
    }

    public static boolean check_cnt(String str){
        String[] arr = str.split("");
        int cnt = 0;
        int cnt2 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("("))
                cnt++;
            else
                cnt2++;
        }

        return cnt == cnt2 ? true : false;
    }
}
