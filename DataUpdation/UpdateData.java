package DataUpdation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {

	public static void updateData() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management_System", "root", "root");
			
		String sql="update student_data set name=?,email=?,phone=?,city=? where id=?";
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Student Name to Update ");
		String name =sc.nextLine();
		System.out.println("Enter the Student Email ID to Update ");
		String email =sc.nextLine();
		System.out.println("Enter the Student PhoneNumber to Update  ");
		String phone =sc.nextLine();
		System.out.println("Enter the Student City to Update ");
		String city =sc.nextLine();
		System.out.println("Enter the ID where  to Update ");
		int id =sc.nextInt();
		
		
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,phone);
		ps.setString(4,city);
		ps.setInt(5,id);
		
		
		int status=ps.executeUpdate();
		
		System.out.println();
		
		if(status==1)
		{
			System.out.println("Updation Complete ");
		}
		else
		{
			System.out.println("Updation Denied");
		}
		
	}
}
