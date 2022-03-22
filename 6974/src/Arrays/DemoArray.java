package Arrays;

public class DemoArray 
{

	public static void main(String[] args) 
	{
		int [] arr;
		arr= new int[5];
		
		arr[0] = 20;
		arr[1] = 40;
		arr[2] = 50;
		arr[3] = 60;
		arr[4] = 90;
		
		for(int i = 0;i<arr.length;i++)
			System.out.println("Elements at index "+ i + ":" +arr[i]);
		 

	}

}
