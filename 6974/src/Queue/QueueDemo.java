package Queue;

import java.util.PriorityQueue;

public class QueueDemo 
{

	public static void main(String[] args) 
	{
		//using priority queue
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		
		//LinkedList <Integer> queue=new LinkedLIst<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			queue.add(i);
		}
		System.out.println("The Queue is : " + queue);
		
		//Use offer method
		
		System.out.println("The Queue is : "+ queue.offer(12));
		System.out.println("The Queue is : "+ queue);
		
		//Head of Queue
		
		System.out.println("The Queue is : "+ queue.element());  //throw exception if queue empty
		System.out.println("The Queue is : "+ queue.peek());    // return null if queue empty
		System.out.println("The Queue size before element remove is : "+ queue.size());
		
		//Remove element from queue
		
		System.out.println("The Queue is : "+queue.remove());  //throw exception if queue empty
		System.out.println("The Queue is : "+queue.peek());  //return null if queue empty
		System.out.println("The Queue size after element remove is : "+queue.size());
		System.out.println("The Final Queue is : "+ queue);
		}

}
