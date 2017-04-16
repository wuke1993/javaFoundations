package chap03;

public class TestWrapper
{
    public static void main(String[] args)
    {
    	Integer ageObj = new Integer(40);
    	System.out.println(ageObj.doubleValue());
    	
    	int num1 = 4;
    	ageObj = num1;
    	System.out.println(ageObj.intValue());
    	
    	int ageNum = ageObj;
    	System.out.println(ageNum);
    	
    	String str = "35";
    	int num = Integer.parseInt(str);
    	System.out.println(num);
    	
    	
    }
}
