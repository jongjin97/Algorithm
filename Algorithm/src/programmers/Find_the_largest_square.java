package programmers;

public class Find_the_largest_square {

    public int solution(int [][]board) {
        int answer = 0;
        for(int i=1; i<board.length; i++){
            for(int j=1; j<board[0].length; j++){
                if(board[i-1][j-1] != 0 && board[i-1][j] != 0 && board[i][j-1] != 0 && board[i][j] != 0){
                    int a = (int) Math.sqrt(board[i-1][j-1]);
                    int b = (int) Math.sqrt(board[i-1][j]);
                    int c = (int) Math.sqrt(board[i][j-1]);
                    System.out.println(i + " " + j);
                    System.out.println(Math.sqrt(1));
                    int num = Math.min(a, Math.min(b, c));
                    board[i][j] = Math.max((num+1) * (num+1), board[i][j]);
                    answer = Math.max(answer, board[i][j]);
                } else if(board[i][j] == 1){
                    answer = Math.max(answer, 1);
                }
            }
        }
        if(board.length == 1 && board[0].length == 1){
            if(board[0][0] == 0)
                answer = 0;
            else
                answer = 1;
        }

        return answer;
    }
}
