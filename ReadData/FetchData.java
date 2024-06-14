package ReadData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchData {
	
	public static void fetchData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management_System", "root", "root");
			
		String sql="Select * from student_data";
		
		Scanner sc=new Scanner(System.in);
		
		
		PreparedStatement ps=con.prepareStatement(sql);
	
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println("*******************************");
			System.out.println();
			System.out.println(" Student ID "+rs.getInt("id"));
			
			System.out.println("Enter the Student Name "+rs.getString("name"));
			
			System.out.println("Enter the Student Email ID "+rs.getString("email"));
	
			System.out.println("Enter the Student PhoneNumber  "+rs.getString("phone"));
	
			System.out.println("Enter the Student City "+rs.getString("city"));
		
		}
		
	}

}
