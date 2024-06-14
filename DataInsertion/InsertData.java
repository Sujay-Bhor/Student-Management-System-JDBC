package DataInsertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
	
	public static void insertData() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management_System", "root", "root");
			
		String sql="insert into student_data (id,name,email,phone,city) values(?,?,?,?,?)";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Student ID ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Name ");
		String name =sc.nextLine();
		System.out.println("Enter the Student Email ID ");
		String email =sc.nextLine();
		System.out.println("Enter the Student PhoneNumber  ");
		String phone =sc.nextLine();
		System.out.println("Enter the Student City ");
		String city =sc.nextLine();
		
		
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3,email);
		ps.setString(4,phone);
		ps.setString(5,city);
		
		
		int status=ps.executeUpdate();
		
		System.out.println();
		
		if(status==1)
		{
			System.out.println("Insertion Complete ");
		}
		else
		{
			System.out.println("Insertion Denied");
		}
		
		
			
	}

}
