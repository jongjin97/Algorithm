package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//나이순 정렬
public class Sort_by_age_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Person[] people = new Person[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(people, (o1, o2) -> o1.age - o2.age);

        for (Person person : people) {
            System.out.println(person.age + " " + person.name);
        }
    }
    static class Person{
        int age;
        String name;
        Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
}
