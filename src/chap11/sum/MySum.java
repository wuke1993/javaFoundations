package chap11.sum;

public class MySum 
{
	public static void main(String[] args)
	{
		System.out.println(MySum.sum(4));
	}
	
	public static int sum(int num)
	{
		int result = 0;
		if(num == 1) // »ù´¡ÇéĞÎ
			result = 1;
		else
			result = num + sum(num-1);
		return result;
	}
}
