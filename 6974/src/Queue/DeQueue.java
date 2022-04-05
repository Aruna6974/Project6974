package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DeQueue 
{

	public static void main(String[] args) 
	{
		//Creating and initialising dequeue
		//Declaring object of integer type
		
		Deque<Integer> de_que=new ArrayDeque<Integer>(10);
		
		//using add() method to insert
		
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);
		
		//Iterating using for each loop
		
		for (Integer element : de_que)
		{
			//Print the Corresponding element
			
			System.out.println("Element : "+element);
		}
		System.out.println("\n\n");
		
		//clear() method
		System.out.println("Using clear() ");
		
		//Clearing all elements using clear() method
		de_que.clear();
		
		//Display message
		System.out.println("The Queue is Cleared");
		System.out.println("\n\n");
		
		//addLast() method
		//Inserting at end
		
		de_que.addLast(24);
		de_que.addLast(14);
		
		//addFirst() method
		//Inserting at the Start
		
		de_que.addFirst(565);
		de_que.addFirst(292);
		
		//Iterators
		
		//Display message
		System.out.println("Elements of dequeue using Iterator : ");
		
		for(Iterator itr=de_que.iterator();itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		 System.out.println("\n\n");
		 
		 //element() method : to get Head element
		 System.out.println("\nHead Element using element(): "+de_que.element());
		 
		 //getFirst() method : to get Head element
		 System.out.println("Head ELement using getFirst(): "+de_que.getFirst());
		 
		 //getLast() method : to get Head Element
		 System.out.println("Head ELement using getLast(): "+de_que.getLast());
		 
		 System.out.println("\n\n");
		 
		 //toArray() method :
		 Object[] arr=de_que.toArray();
		 System.out.println("\nArray size : "+arr.length);
		 
		 System.out.println("\nArray elements : ");
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(" "+arr[i]);
		 }
		 //peek() method : to get head
		 
		 System.out.println("\n\nHead element : "+de_que.peek());
		 
		 //elements are 246,564,345,24,14,
		 //poll() method : to get head
		 
		 System.out.println("\nHead element poll : "+de_que.poll()); //564
		 
		 //push() -the method pushes an element onto stack represented by deque
		 
		 de_que.push(265);
		 de_que.push(984);
		 
		 //elements are 564,24,14,265,984
		 
		 //remove() method : to get head
		 System.out.println("\nHead element remove : "+de_que.remove()); //984
		 System.out.println("\nThe final array is : "+de_que);
		 
		 
		}

}
