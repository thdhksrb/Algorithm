package lv0;

public class p120808
{
//https://school.programmers.co.kr/learn/courses/30/lessons/120808
	public static void main(String[] args)
	{
		int numer1 = 1;
		int denom1 = 2;
		int numer2 = 3;
		int denom2 = 4;
		
		int ans;
		int deAns;
		
		deAns = denom1*denom2;  // 분모 
		
		numer1 *= denom2;
		numer2 *= denom1;
		
		ans = numer1+numer2;  // 분자
		
		int value = gcd(Math.max(ans, deAns),Math.min(ans, deAns));
		
		int[] answer = {ans/value,deAns/value};
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);

	}
	static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}

}
