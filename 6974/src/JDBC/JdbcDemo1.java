package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo1 
{

	public static void main(String[] args) throws SQLException 
	{
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	Connection con = DriverManager.getConnection("jdbc:mysql:///batch6974","root","123456789");
        	
        	con.setAutoCommit(false);
        	Statement stmt = con.createStatement();
        	Scanner sc = new Scanner(System.in);
        	//String query = "Create table Watchman(id int, name varchar(15),salary varchar(12))";
        	String query = "INSERT INTO Watchman " +"values(102,'arjun',20000),(103,'Bhanu',30000)";
        	stmt.executeUpdate(query);
        	System.out.println("commit/rollback");
        	String answer = sc.nextLine();
        	if(answer.equals("commit"))
        	{
        		con.commit();
        		System.out.println("Table is updated");
        	}
        	if(answer.equals("rollback"))
        	{
        		con.rollback();
        		System.out.println("Changes are undone");
        	}
        			
        		
        }
        catch( ClassNotFoundException e)
        {
        	e.printStackTrace();
        }
	}

}
