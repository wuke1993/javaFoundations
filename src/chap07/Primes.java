package chap07;

//  ʹ�ó�ֵ��ʵ����һ�����飬����ʹ��new
//  ֻ�����ڵ�һ�����������ʱ��

public class Primes
{
	public static void main(String[] args)
	{
	    int[] primeNums = {2,3,5,7,11,13,17,19};
	    
	    System.out.println("����ĳ��ȣ�" + primeNums.length);
	    
	    for(int prime : primeNums)
	    	System.out.print(prime + "  ");
	}
} 