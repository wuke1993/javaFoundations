package chap08.hospital;

public abstract class Staff 
{
    private int staffId;
    private String name;
    private String vocation;
    
    // 构造方法
    Staff()
    {}
    public Staff(int stId,String nm,String voca)
    {
    	staffId = stId;
    	name = nm;
    	vocation = voca;
    }
    
    // 具体工作
    public abstract void service();
    
    // toString()
    public String toString()
    {
    	return(staffId + "  " + name + "  " + vocation + "  ");
    }
}
