package baekjoon;

import java.io.*;

public class Repaint_The_ChessBoard_1018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] arr = str.split(" ");

        int garo = Integer.parseInt(arr[0]);
        int sero = Integer.parseInt(arr[1]);

        String[][] map = new String[garo][sero];

        for(int i=0; i<garo; i++){
            str = br.readLine();
            arr = str.split("");
            for(int j=0; j<sero; j++){
                map[i][j] = arr[j];
            }
        }
        int max = 64;
        int x = 0;
        int y = 0;
        int result = Integer.MAX_VALUE;
        for(int n=0; n<=garo-8; n++){
            for(int m=0; m<=sero-8; m++){
                x = 0;
                y = 0;
                // 0, 8
                // 1, 9
                // 2, 10
                for(int i=n; i<n+8; i++){
                    for(int j=m; j<m+8; j++){
                        if(i%2==0){
                            if(j%2==0 && map[i][j].equals("B")){
                                x++;
                            } else if(j%2==1 && map[i][j].equals("W")){
                                y++;
                            }
                        } else if(i%2==1){
                            if(j%2==0 && map[i][j].equals("W")){
                                x++;
                            } else if(j%2==1 && map[i][j].equals("B")){
                                y++;
                            }
                        }
                    }
                }
                result = Math.min(Math.min(result, x+y), max-x-y);

            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
    }
}
