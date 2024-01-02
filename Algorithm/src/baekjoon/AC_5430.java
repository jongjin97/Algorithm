package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class AC_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            String[] str = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            boolean check = true;
            boolean error = false;
            String s = br.readLine();
            String[] arr = s.substring(1, s.length()-1).split(",");
            Deque<String> deque = new ArrayDeque<>();
            for(String a : arr)
                if(!a.isEmpty())
                    deque.add(a);

            for(int i=0; i<str.length; i++){
                if(str[i].equals("R")){
                    check = !check;
                } else if(str[i].equals("D")){
                    if(check){
                        if(!deque.isEmpty()){
                            deque.pollFirst();
                        } else if(deque.isEmpty()){
                            error = true;
                            break;
                        }
                    } else if(!check) {
                        if(!deque.isEmpty()){
                            deque.pollLast();
                        } else if(deque.isEmpty()){
                            error = true;
                            break;
                        }
                    }
                }
            }
            if(error) {
                bw.write("error");
                bw.newLine();
                continue;
            }
            if(check){
                bw.write("[");
                while (!deque.isEmpty()){
                    bw.write(deque.pollFirst());
                    if(deque.size() != 0)
                        bw.write(",");
                }
                bw.write("]");
                bw.newLine();
            } else if(!check){
                bw.write("[");
                while (!deque.isEmpty()){
                    bw.write(deque.pollLast());
                    if(deque.size() != 0)
                        bw.write(",");
                }
                bw.write("]");
                bw.newLine();
            }
        }
        bw.flush();
    }
}
