package Joins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InnerJoin 
{

	public static void main(String[] args) throws SQLException 
	{
		try
		{
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql:///batch6974","root","123456789");
		  Statement stmt = con.createStatement();
	//      String query = "Select Orders1.OrderId,Customer.CustomerName from Orders1 inner join Customer on Orders1.CustomerId=Customer.CustomerId";
	//	  String query="SELECT Customer.CUstomerName,Orders1.OrderId FROM Customer LEFT JOIN Orders1 ON Customer.CustomerId=Orders1.CustomerId ORDER BY Customer.CUstomerName";
	//    String rightjoin="SELECT Orders1.OrderId,Customer.CustomerName,Customer.ContactName from Orders1"+" RIGHT JOIN Customer ON Orders1.CustomerId=Customer.CustomerId";
	//    String crossjoin = "Select Customer.CustomerName,Shipper.ShipperName From Shipper CROSS JOIN Customer";
		  String selfjoin="SELECT A.CustomerName AS CustomerName1,B.CustomerName AS CustomerName2,"
		  		+ "A.City From Customer A,Customer B WHERE A.CustomerId<>B.CustomerId AND A.City = B.City ORDER BY A.City";
		  ResultSet result=stmt.executeQuery(selfjoin);
		  while(result.next())
		   {
			System.out.println(result.getString(1)+"     "+result.getString(2)+"  "+result.getString(3));
		   }
	   }
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

	


