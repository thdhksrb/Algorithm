package lv0;

public class p120863
{
//https://school.programmers.co.kr/learn/courses/30/lessons/120863
	public static void main(String[] args)
	{
		String answer = "x + x + x";
		
		String[] arr = answer.split(" ");
		
		int var = 0;
		int num = 0;
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].matches("[0-9]+")){
				num += Integer.parseInt(arr[i]);
			}else if(arr[i].matches("[0-9a-z]+")){
				if(arr[i].equals("x")){
					var += 1;
				}else {
				var += Integer.parseInt(arr[i].replace("x", ""));
				}
			}
		}
		
		if(var==0&&num!=0) {
			System.out.println(num);
		}
		else if(var==1&&num==0) {
			System.out.println("x");
		}else if(var==1&&num!=0){
			System.out.println("x"+num);
		}else if(num==0) {
			System.out.println(Integer.toString(var) + "x");
		}
		else {
			System.out.println(Integer.toString(var) + "x + " + num);
		}


		
		
	}

}
