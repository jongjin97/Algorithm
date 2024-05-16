package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//수학은 비대면강의입니다
public class Mathematics_is_a_non_face_to_face_lecture_19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        System.out.println(getX(a,b,c,d,e,f) + " " + getY(a,b,c,d,e,f));
    }

    public static int getX(int a, int b, int c, int d, int e, int f){
        a *= e;
        c *= e;
        d *= b;
        f *= b;

        int tmp = a-d;
        int tmp2 = c-f;
        return tmp2/ tmp;
    }
    public static int getY(int a, int b, int c, int d, int e, int f){
        b *= d;
        c *= d;
        e *= a;
        f *= a;

        int tmp = b-e;
        int tmp2 = c-f;
        return tmp2/ tmp;
    }
}
