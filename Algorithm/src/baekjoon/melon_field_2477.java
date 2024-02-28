package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class melon_field_2477 {
    static int K,maxWidth,maxHeight, indexWidth,indexHeight;
    static int[] length = new int[6];	//입력되는 육각형 이동거리 저장 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력값 처리하는 BufferedReader
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //결과를 출력하는 BufferedWriter
        StringTokenizer st;
        K = Integer.parseInt(br.readLine());
        //최대 높이, 너비 초기화
        maxHeight = Integer.MIN_VALUE;
        maxWidth = Integer.MIN_VALUE;
        //6번 이동값을 저장할 때 최대 높이, 너비와 가리키는 인덱스 저장
        for(int i=0;i<6;i++) {
            st = new StringTokenizer(br.readLine()," ");
            int direction = Integer.parseInt(st.nextToken());
            length[i] = Integer.parseInt(st.nextToken());
            if(direction==1 || direction == 2) {
                if(maxWidth < length[i]) {
                    maxWidth = length[i];
                    indexWidth = i;
                }
            }else {
                if(maxHeight < length[i]) {
                    maxHeight = length[i];
                    indexHeight = i;
                }
            }
        }
        int tempWidth = lengthCal(indexHeight);		//잘려진 부분 너비 구하기
        int tempHeight = lengthCal(indexWidth);		//잘려진 부분 높이 구하기

        //참외밭에 심을 수 있는 참외 개수 구하기
        int result = ((maxHeight * maxWidth) - (tempWidth * tempHeight)) * K;
        bw.write(result + "\n");		//참외 개수 BufferedWriter 저장
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
    //잘려진 부분 너비, 높이 구하는 함수
    static int lengthCal(int index) {
        int result = 0;
        if(index==0)
            result = Math.abs(length[index+1] - length[5]);
        else if(index == 5)
            result = Math.abs(length[index-1] - length[0]);
        else
            result = Math.abs(length[index+1] - length[index-1]);

        return result;
    }
}
