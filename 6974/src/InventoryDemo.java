

//Inventory Management System

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

class InventoryDemo
{
	int productid;
	String productname;
	String Quantity;
	String Description;
	Float Price;
	
	public InventoryDemo(int productid, String productname, String Quantity, String Description, Float price)
	{
		this.productid=productid;
		this.productname=productname;
		this.Quantity=Quantity;
		this.Description=Description;
		this.Price=price;
		
	}
	
	public String toString()
	{
		return("\nProduct Details:"+"\nPRODUCTID:"+this.productid+"\nPRODUCTNAME:"+this.productname+"\nQUANTITY:"+this.Quantity+"\nDESCRIPTION:"+this.Description+"\nPRICE:"+this.Price);	
	}
	
	
public class InventoryManagementSystem
{
 void display(ArrayList<InventoryDemo>al)
	{
		System.out.println("\n-----------Product List-----------\n");
		System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s%-10s","PRODUCTID","PRODUCTNAME","QUANTITY","DESCRIPTION","PRICE"));
		
		for(InventoryDemo s:al)
			
		{
			System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s%-20s",s.productid,s.productname,s.Quantity,s.Description,s.Price));
		}
	}
	
	@SuppressWarnings("unchecked")
	public void main(String[] args)
	{
		int Productid;
		String productname;
		String Quantity;
		String Description;
		Float Price;
		
		Scanner sc=new Scanner(System.in);
		ArrayList<InventoryDemo> al=new ArrayList<InventoryDemo>();
		
		File f=null;
		FileInputStream fis=null;
		ObjectInput ois=null;
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try
		{
			f=new File("/home/Divya/eclipse.workspace/Inventory/src/Inventory");
			if(f.exists())
			{
				fis=new FileInputStream(f);
				al=(ArrayList<InventoryDemo>)ois.readObject();
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		do
		{
			System.out.println("\n*************Welcome to Inventory Management System**********\n");
			System.out.println("1). Add Product to the Database\n"+ "2). Search for Product\n"+ "3). Edit Product deatils\n"+ "4).Delete product details\n"+ "5). Display all Produts in the supermarket\n"+ "6). Exit\n");
			System.out.println("zenter Your Choice :");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: System.out.println("Enter the following details to ADD List:\n");
			System.out.println("Enter Product ID:");
			Productid=sc.nextInt();
			System.out.println("Enter Product Name:");
			productname=sc.next();
			System.out.println("Enter Quantity:");
			Quantity=sc.next();
			System.out.println("Enter Description:");
			Description=sc.next();
			System.out.println("Enter Price:");
			Price=sc.nextFloat();
			al.add(new InventoryDemo(Productid,productname,Quantity,Description,Price));
			display(al);
			break;
			
			case 2: System.out.println("Enter the Product id to search:");
			Productid=sc.nextInt();
			int i=0;
			for(InventoryDemo d:al)
			{
				if(productid==s.productid)
				{
					System.out.println(s+"\n");
					i++;
					
				}
			}
				if(i==0)
				{
					System.out.println("\n Product details are not available, please enter a valid productid:");
				}
				break;
			
				
				case 3: System.out.println("\nEnter the Product id to Edit the details");
				Productid=sc.nextInt();
				int j=0;
				for(InventoryDemo s:al)
				{
					if(productid==s.productid)
					{
						j++;
						do
						{
							int ch1=0;
					System.out.println("\nEdit product details:\n"+"1).Product ID\n"+ "2). Productname\n"+ "3).Quantity\n"+ "4).Description\n"+ "5).Price\n"+ "6).GO BACK\n");
			System.out.println("Enter your choice:");
			ch1=sc.nextInt();
			switch(ch1)
			{
				case 1: System.out.println("Enter New Product Id:");
				s.productid=sc.nextInt();
				System.out.println(s+"\n");
				break;
				
				case 2: System.out.println("Enter New Product Name:");
				sc.nextLine();
				s.productname=sc.nextLine();
				System.out.println(s+"\n");
				break;
				
				case 3: System.out.println("Enter New Product Quantity:");
				s.Quantity=sc.nextLine();
				System.out.println(s+"\n");
				break;
				
				case 4: System.out.println("Enter New Product Description:");
				s.Description=sc.nextLine();
				System.out.println(s+"\n");
				break;
				
				case 5: System.out.println("Enter Product Price:");
				s.Price=sc.nextFloat();
				System.out.println(s+"\n");
				break;
				
				case 6: j++;
				break;
				default:  System.out.println("\nEnter the correct choice from the List:");
				break;
						}
						}
						while(j==1);
					}
				}
				if(j==0)
				{
					System.out.println("\nProduct details are not available.Please enter a valid ProductID:");
				}
				break;
				
				case 4: System.out.println("\nEnter product ID to DELETE from the Database:");
				Productid=sc.nextInt();
			    int k=0;
			    try
			    {
			    	for(InventoryDemo s:al)
			    	{
			    		if(productid==s.productid)
			    		{
			    			al.remove(s);
			    			display(al);
			    			k++;
			    		}
			    	}
			    	if(k==0)
			    	{
			    		System.out.println("\nProduct Details are not available.please enter a valid ProductID:");
			    	}
			    }
			    catch(Exception ex)
			    {
			    	System.out.println(ex);
			    }
			    break;
			    case 5:try
			    {
			    	al=(ArrayList<InventoryDemo>)ois.readObject();
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
			    
			    case 6:try
			    {
			    	fos=new FileOutputStream(f);
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
			    	System.out.println("\n You have chosen EXIT !!! saving Files are Closing the tool.");
			    	sc.close();
			    	System.exit(0);
			    	break;
			    
			    	default:System.out.println("\n Enter a correct choice from the List:");
			    	break;
			    }
			}
			while(true);
			}
 }
}

