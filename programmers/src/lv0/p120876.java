package lv0;

public class p120876
{
//https://school.programmers.co.kr/learn/courses/30/lessons/120876
	public static void main(String[] args)
	{
		int[][] lines = {{0, 5},{3, 9},{1, 10}};
		int answer = 0;
		
		int min = Math.min(Math.min(lines[0][0], lines[1][0]), lines[2][0]);
		int max = Math.max(Math.max(lines[0][1], lines[1][1]), lines[2][1]);
		
		System.out.println(min + "," + max);
		
		int[] arr = new int[max-min];
		
		for(int i=lines[0][0]-min; i<lines[0][1]-min; i++) {
			arr[i] += 1;
		}
		for(int i=lines[1][0]-min; i<lines[1][1]-min; i++) {
			arr[i] += 1;
		}
		for(int i=lines[2][0]-min; i<lines[2][1]-min; i++) {
			arr[i] += 1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1) {
				answer += 1;
			}
		}
		
		System.out.println(answer);

	}

}
