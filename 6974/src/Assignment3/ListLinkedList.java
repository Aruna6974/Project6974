//Implement the assignment 1 using Linked List.

package Assignment3;

import java.util.LinkedList;

public class ListLinkedList
{
	private LinkedList<Integer> list =new LinkedList<Integer>();
	
	public LinkedList<Integer> saveEvenNumbers(int N)
	{
		list=new LinkedList<Integer>();
		
		for(int i=2;i<=N;i++)
		{
			if(i%2==0)list.add(i);
		}
		return list;
	}
	
	public LinkedList<Integer> printEvenNumbers()
	{
		LinkedList<Integer> newlist=new LinkedList<Integer>();
		
		for(int item:list)
		{
			newlist.add(item*2);
			System.out.println(item*2);
		}
		return newlist;
	}

	public static void main(String[] args) 
	{
		ListLinkedList lst=new ListLinkedList();
		lst.saveEvenNumbers(20);
		lst.printEvenNumbers();

	}

}
