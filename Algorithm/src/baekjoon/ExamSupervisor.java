package baekjoon;

import java.util.Scanner;

public class ExamSupervisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int location = sc.nextInt();
		int[] person = new int[location];
		for(int i=0; i<location; i++) {
			person[i] = sc.nextInt();
		}
		int general = sc.nextInt();
		int assistant = sc.nextInt();
		
		long result = 0;
		
		for(int i=0; i<location; i++) {
			person[i] -= general;
			result++;
			
			if(person[i] <= 0)
				continue;
			result += person[i] / assistant;
			if(person[i]%assistant != 0)
				result++;
		}
		
		System.out.println(result);
	}

}
