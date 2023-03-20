package lv0;

public class p120866
{
//https://school.programmers.co.kr/learn/courses/30/lessons/120866
	public static void main(String[] args)
	{
		int[][] board = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
		int answer = 0;
		
		int[][] arr = new int[board.length+2][board[0].length+2];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==1) {
					arr[i+1][j+1] = 1;                  // 한칸씩 오른쪽 아래로 이동해서 저장
					arr[i+1][j+1+1] = 1;
					arr[i+1][j-1+1] = 1;
					arr[i-1+1][j+1] = 1;
					arr[i+1+1][j+1] = 1;
					arr[i+1+1][j+1+1] = 1;
					arr[i+1+1][j-1+1] = 1;
					arr[i-1+1][j+1+1] = 1;
					arr[i-1+1][j-1+1] = 1;
				}
			}
		}
		
		for(int i=1;i<arr.length-1;i++) {
			for(int j=1;j<arr[0].length-1;j++) {
				if(arr[i][j]!=1) {
					answer += 1;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(answer);
		

	}

}
