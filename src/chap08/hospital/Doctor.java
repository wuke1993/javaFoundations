package chap08.hospital;

public class Doctor extends Staff
{
	final private String job = "cure";
	
    public Doctor(int stId, String nm, String voca) 
    {
		super(stId, nm, voca);
	}

	public void service()
    {
    	System.out.println(job);
    }
	
	public String toString()
	{
		return(super.toString() + job);
	}
}
