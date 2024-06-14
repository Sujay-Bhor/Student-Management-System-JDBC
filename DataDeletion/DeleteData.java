package DataDeletion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	
	public static void deleteData() throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management_System", "root", "root");
			
		String sql="delete from student_data where id=?";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the ID where  to Delete ");
		int id =sc.nextInt();
		
		
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1,id);
		
		
		int status=ps.executeUpdate();
		
		System.out.println();
		
		if(status==1)
		{
			System.out.println("Deletion Complete ");
		}
		else
		{
			System.out.println("Deletion Denied");
		}
		
	}

}
