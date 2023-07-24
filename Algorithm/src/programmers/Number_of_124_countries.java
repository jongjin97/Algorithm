package programmers;
public class Number_of_124_countries {
    StringBuilder stringBuilder = new StringBuilder();
    public String solution(int n) {
        String answer = "";

        dfs(n/3, n%3);

        return stringBuilder.toString();
    }

    public void dfs(int a, int b){
        if(b == 0){
            a-=1;
        }
        if(a>4){
            dfs(a/3, a%3);
        } else if(a==4 && b!= 0){
            dfs(a/3, a%3);
        }
        if(a == 3){
            stringBuilder.append(4);
        } else if(a == 2 || a == 1){
            stringBuilder.append(a);
        }
        if(b == 0)
            stringBuilder.append(4);
        else
            stringBuilder.append(b);
    }
}
