package lv0;

public class p120875
{
//https://school.programmers.co.kr/learn/courses/30/lessons/120875
	public static void main(String[] args)
	{
		int[][] dots = {{1,4},{9,2},{3,8},{11,6}};
		
		int answer = 0;
		
		if((dots[1][0]-dots[0][0])*(dots[3][1]-dots[2][1])==(dots[1][1]-dots[0][1])*(dots[3][0]-dots[2][0])) {
			answer = 1;
		}
		if((dots[2][0]-dots[0][0])*(dots[3][1]-dots[1][1])==(dots[2][1]-dots[0][1])*(dots[3][0]-dots[1][0])) {
			answer = 1;
		}
		if((dots[3][0]-dots[0][0])*(dots[2][1]-dots[1][1])==(dots[3][1]-dots[0][1])*(dots[2][0]-dots[1][0])) {
			answer = 1;
		}
		
			
		System.out.println(answer);

	}

}
