//Implement the assignment 1 using Vector.


package Assignment3;

import java.util.Vector;

public class ListVector 
{
    private Vector<Integer> list = new Vector<Integer>();
    
    public Vector<Integer> saveEvenNumbers(int N)
    {
    	list=new Vector<Integer>();
    	
    	for(int i=2;i<=N;i++)
    	{
    		if(i%2==0)list.add(i);
    	}
    	return list;
    }
    public Vector<Integer> PrintEvenNumbers()
    {
    	Vector<Integer> newlist=new Vector<Integer>();
    	
    	for(int item:list)
    	{
    		newlist.add(item*2);
    		System.out.println(item*2);
    	}
    	return newlist;
    }
	public static void main(String[] args) 
	{
		ListVector ltv=new ListVector();
		ltv.saveEvenNumbers(20);
		ltv.PrintEvenNumbers();

	}

}
