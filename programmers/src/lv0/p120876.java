package lv0;

public class p120876
{
//https://school.programmers.co.kr/learn/courses/30/lessons/120876   다시
	public static void main(String[] args)
	{
		int[][] lines = {{0, 5},{3, 9},{1, 10}};
		
		
		int min = Math.min(Math.min(lines[0][0], lines[1][0]), lines[2][0]);
		int max = Math.max(Math.max(lines[0][1], lines[1][1]), lines[2][1]);
		
		
		int totalLength = lines[0][1]-lines[0][0] + 
						lines[1][1]-lines[1][0] + 
						lines[2][1]-lines[2][0];
		
		int answer = totalLength - (max - min);
		System.out.println(answer);

	}

}
