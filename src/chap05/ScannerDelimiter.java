package chap05;
import java.util.Scanner;

public class ScannerDelimiter
{
    public static void main(String[] args)
    {
    	String str = "good good study,day day up";    	
    	Scanner scan = new Scanner(str);
    	
    	while(scan.hasNext())
    	{
    		System.out.println(scan.next());
    	}
    	
    	System.out.println("********************************");
    	
    	String str1 = "good,good study,day day up";
    	
    	scan = new Scanner(str1);
    	scan.useDelimiter(",");
    	 	
    	while(scan.hasNext())
    	{
    		System.out.println(scan.next());
    	}
    }
}
