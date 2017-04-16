package chap07;

//  使用初值表实例化一个数组，代替使用new
//  只能用在第一次声明数组的时候

public class Primes
{
	public static void main(String[] args)
	{
	    int[] primeNums = {2,3,5,7,11,13,17,19};
	    
	    System.out.println("数组的长度：" + primeNums.length);
	    
	    for(int prime : primeNums)
	    	System.out.print(prime + "  ");
	}
} 