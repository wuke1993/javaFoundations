package chap08.hospital;

public class Nurse extends Staff 
{
    final private String job = "take care";
	
    public Nurse(int stId, String nm, String voca) 
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
