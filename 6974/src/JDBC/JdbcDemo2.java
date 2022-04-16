package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class JdbcDemo2 {

	public static void main(String[] args) throws SQLException 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///batch6974","root","123456789");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			
			//construct a query
			String deletequery = "DELETE FROM Watchman where id=103";
			
			//Disable auto commit to connection
			con.setAutoCommit(false);
			
			//create a savepoint object before executing the delete query
			
			Savepoint beforeDeleteSavepoint = con.setSavepoint();
			
			//Executing the Deletequery
			stmt.executeUpdate(deletequery);
			
			//Rollback to our beforeDeleteSavepoint
			con.rollback(beforeDeleteSavepoint);
			con.commit();
			
		}
		catch(ClassNotFoundException e )
		{
			e.printStackTrace();
		}

	}

}
