package baekjoon;

import java.io.*;

public class Number_of_Papers_1780 {
    static int cntminus = 0;
    static int cntzero = 0;
    static int cntone = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] map = new int[num][num];

        for(int i=0; i<num; i++){
            String[] str = br.readLine().split(" ");
            for(int j=0; j<num; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        func(0,0,num, map);

        bw.write(cntminus+"\n");
        bw.write(cntzero+"\n");
        bw.write(cntone+"\n");
        bw.flush();
    }

    public static void func(int x, int y, int n, int[][] map){
        boolean one = false;
        boolean zero = false;
        boolean minus = false;

        for(int i=x; i<x+n; i++){
            for(int j=y; j<y+n; j++){
                if(map[i][j] == 0)
                    zero = true;
                else if(map[i][j] == 1)
                    one = true;
                else if(map[i][j] == -1)
                    minus = true;
            }
        }

        if((one && zero) || (one && minus) || (zero && minus) ){
            func(x,y,n/3,map);
            func(x+n/3,y,n/3,map);
            func(x+n/3*2,y,n/3,map);
            func(x,y+n/3,n/3,map);
            func(x+n/3,y+n/3,n/3,map);
            func(x+n/3*2,y+n/3,n/3,map);
            func(x,y+n/3*2,n/3,map);
            func(x+n/3,y+n/3*2,n/3,map);
            func(x+n/3*2,y+n/3*2,n/3,map);
        } else if(one)
            cntone++;
        else if(minus)
            cntminus++;
        else if(zero)
            cntzero++;


    }
}
