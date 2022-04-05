  //Student Management System Project

package Project;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("School")
class Student1 implements School
{
	int id;
	String name;
	String schoolname;
	String address;
	Float score;
	Float fees;
	
	public Student1(int id, String name,String schoolname, String address, Float score, Float fees)
	{
		this.id=id;
		this.name=name;
		this.schoolname=schoolname;
		this.address=address;
		this.score=score;
		this.fees=fees;
		
	} 
	public String toString()
	{
		return "\nStudent Details :" + "\nID:" + this.id + "\nName: "+this.name + "\nschoolname: "+this.schoolname+ "\naddress: "+this.address + "\nscore: "+this.score + "\nfees: "+this.fees;	
	}
	
}
public class StudentManagementSystem 
{
	
	static void display(ArrayList<Student1> al )
	{
		System.out.println("\n ..............Student1 List...........\n");
		System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s%-10s","ID","Name","Schoolname","Address","Score","Fees"));
		for(Student1 s: al)
		{
			System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s%-20s",s.id,s.name,s.schoolname,s.address,s.score,s.fees));
		}
	}
     @SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		int id;
		String name;
		String schoolname;
		String address;
		Float score;
		Float fees;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Student1> al=new ArrayList<Student1>();
		
		File f=null;
		FileInputStream fis=null;
		ObjectInput ois=null;
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		
		try
		{
			f=new File("/home/SathishReddy/eclipse.workspace/StudentManagementSystem/src/StudentManagementSystem");
		 if(f.exists())
		  {
			fis=new FileInputStream(f);
			al=(ArrayList<Student1>)ois.readObject();
			
		  }
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
		do
		{
			System.out.println("\n**************Welcome to the Student Management System **********\n");
			System.out.println("1).Add Student1 to the Database\n"+
			                   "2).Search for Student1\n"+
					           "3).Edit Student1 details\n"+
			                   "4).Delete Student1 details\n"+
					           "5).Display all Student1s Studying in the School\n"+
			                   "6).Exit\n");
			System.out.println("Enter Your Choice : ");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1 : System.out.println("Enter the Following details to ADD List:\n");
			         System.out.println("Enter ID : ");
			         id=sc.nextInt();
			         System.out.println("Enter Name : ");
			         name=sc.next();
			         System.out.println("Enter Schoolname : ");
			         schoolname=sc.next();
			         System.out.println("Enter Address : ");
			         address=sc.next();
			         System.out.println("Enter Score : ");
			         score=sc.nextFloat();
			         System.out.println("Enter Fees :  ");
			         fees=sc.nextFloat();
			         al.add(new Student1(id,name,schoolname,address,score,fees));
			         display(al);
			         break;
			         
			case 2 : System.out.println("Enter The Student1 ID to search : ");
			       id=sc.nextInt();
			       int i=0;
			      for(Student1 s: al)
			       {
				   if(id==s.id)
				    {
					System.out.println(s+"\n");
					i++;
				   }
				
			      }
			    if(i==0)
			     {
				   System.out.println("\nStudent1 Details are not available,please enter a valid ID:");
				
			     }
			     break;
			
			case 3 : System.out.println("\nEnter the Student1 ID to EDIT the details ");
			         id=sc.nextInt();
			         int j=0;
			         for(Student1 s: al)
			         {
			        	 if(id==s.id)
			        	 {
			        		 j++;
			        	  do
			        	    {
			        		  int ch1=0;
			        		  System.out.println("\nEDIT Student1 Details :\n"+
			        		                     "1).Student1 ID\n"+
			        				             "2).Name\n"+
			        		                     "3).Schoolname\n"+
			        		                     "4).Address\n"+
			        				             "5).Score\n"+
			        		                     "6).Fees\n"+
			        				             "7).GO BACK\n");
			        		  System.out.println("Enter your choice : ");
			        		  ch1=sc.nextInt();
			        		  switch(ch1)
			        		  {
			        		  case 1: System.out.println("Enter New Student1 ID:");
			        		          s.id=sc.nextInt();
			        		          System.out.println(s+"\n");
			        		          break;
			        		  case 2: System.out.println("Enter New Student1 Name:");
			        		           sc.nextLine();
			        		           s.name=sc.nextLine();
			        		           System.out.println(s+"\n");
			        		           break;
			        		  case 3: System.out.println("Enter New Student1 Schoolname:");
	        		                  sc.nextLine();
	        		                  s.schoolname=sc.nextLine();
	        		                  System.out.println(s+"\n");
	        		                   break;
			        		  case 4: System.out.println("Enter New Student1 Address:");
			        		         s.address=sc.nextLine();
			        		         System.out.println(s+"\n");
			        		         break;
			        		  case 5: System.out.println("Enter New Student1 Score:");
			        		          s.score=sc.nextFloat();
			        		          System.out.println(s+"\n");
			        		          break;
			        		  case 6: System.out.println("Enter New Student1 Fees:");
			        		          s.fees=sc.nextFloat();
			        		          System.out.println(s+"\n");
			        		          break;
			        		  case 7: j++;
			        		          break;
			        		  default : System.out.println("\nEnter a correct choice from the List : ");
			        		            break;
			        		  
			        		  }
			        			 
			        		 }
			        	  while(j==1);
			        	 }
			         }
			         if(j==0)
			         {
			        	 System.out.println("\nStudent1 Details are not available.please enter a valid ID:");
			         }
			         break;
			case 4: System.out.println("\nEnter Student1 ID to DELETE from the Database : ");
			        id=sc.nextInt();
			        int k=0;
			        try
			        {
			        	for(Student1 s: al)
			        	{
			        		if(id==s.id)
			        		{
			        			al.remove(s);
			        			display(al);
			        			k++;
			        		}
			        	}
			        	if(k==0)
			        	{
			        		System.out.println("\nStudent1 Details are not available.please enter a valid ID:");
			        	}
			        }
			        catch(Exception ex)
			        {
			        	System.out.println(ex);
			        }
			        break;
			case 5: try
			         {
				      al=(ArrayList<Student1>)ois.readObject();
			         }
			       catch(ClassNotFoundException e2) 
			       {
			    	 System.out.println(e2);   
			       }
			         
			       catch(Exception e2)
			         {
			        	System.out.println(e2);
			         }
					display(al);
					break;
			
			case 6 :try
					{
				      fos = new FileOutputStream(f);
				      oos=new ObjectOutputStream(fos);
				      oos.writeObject(al);
			        }
			       catch(IOException e1)
					{
			    	   e1.printStackTrace();
					}
					catch(Exception e2)
					{
						e2.printStackTrace();
					}
					finally
					{
						try
						{
							fis.close();
							ois.close();
							fos.close();
							oos.close();
						}
						catch(Exception e1)
						{
							e1.printStackTrace();
						}
					}
			               System.out.println("\n You have chosen EXIT !! Saving Files are Closing the tool. ");
			               sc.close();
			               System.exit(0);
			                break;
			         default : System.out.println("\n Enter a correct choice from the List : ");
			                   break;
			     }
		    }
	
	    while(true);
	
     }
}

