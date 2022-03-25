package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AB_5_10952 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int a= 1;
		int b=1;
		while(a!= 0 && b!=0) {
			StringTokenizer st = new StringTokenizer(str);
			a= Integer.parseInt(st.nextToken());
			b= Integer.parseInt(st.nextToken());
			int sum = a+b;
			if(sum != 0)
				System.out.println(sum);
			str = br.readLine();
		}
	}

}
