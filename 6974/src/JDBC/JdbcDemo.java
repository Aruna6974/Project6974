package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo 
{

	public static void main(String[] args) throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6974","root","123456789");
			Statement stmt = con.createStatement();
			System.out.println(" Enter Manager id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Manager name ");
			String name = sc.nextLine();
			//String query = "create table Manager(id int,name varchar(25),contactNo varchar(10))";
			//String query1 = "insert into Manager values(1,'arun','1234567891')";
			//String query = "select * from Manager";
			//ResultSet rs = stmt.executeQuery(query);
			String query = "insert into Manager(id,name)values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			int i = pstmt.executeUpdate();
			if(i>0)
			{
				System.out.println("inserted");
			}
			else
			{
				System.out.println("not inserted");
			}
				
			//while(rs.next())
			//{
				//System.out.println(rs.getInt(1)+"              "+rs.getString(2));
			//}			
			//int i = stmt.executeUpdate(query);
			//if(i>0)
			//{
				//System.out.println("Record inserted");
			//}
			//else
			//{
				//System.out.println("Record not inserted");
			//}
		}
		catch(Exception e)
		{
			System.out.println("Exception has occured "+e);
		}

	}

}
