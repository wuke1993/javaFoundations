package chap03;

public class TestEnum 
{
	enum Season {spring,summer,fall,winter};
    public static void main(String[] args)
    {
        Season s1,s2,s3;
        s1 = Season.spring;
        s2 = Season.summer;
        s3 = Season.winter;
        
        System.out.println("s1 value: " + s1);
        System.out.println("s1 ordinal: " + s1.ordinal());
        System.out.println("s1 name: " + s1.name());
    }
}
