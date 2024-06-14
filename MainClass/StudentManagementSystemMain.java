package MainClass;

import java.util.Scanner;

import DataDeletion.DeleteData;
import DataInsertion.InsertData;
import DataUpdation.UpdateData;
import ReadData.FetchData;

public class StudentManagementSystemMain {

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to Student Management System ");

		String s1 = "*** Menu ***";
		String s2 = "1. Insert Data ";
		String s3 = "2. Read Data ";
		String s4 = "3. Update Data ";
		String s5 = "4. Delete Data ";
		String s6 = "5. Exit Menu";
		String s7 = " *** Menu End ***";

		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
			Thread.sleep(100);
		}
		System.out.println();
		for (int i = 0; i < s2.length(); i++) {
			System.out.print(s2.charAt(i));
			Thread.sleep(100);
		}
		System.out.println();

		for (int i = 0; i < s3.length(); i++) {
			System.out.print(s3.charAt(i));
			Thread.sleep(100);
		}
		System.out.println();
		for (int i = 0; i < s4.length(); i++) {
			System.out.print(s4.charAt(i));
			Thread.sleep(100);
		}
		System.out.println();

		for (int i = 0; i < s5.length(); i++) {
			System.out.print(s5.charAt(i));
			Thread.sleep(100);
		}
		System.out.println();
		for (int i = 0; i < s6.length(); i++) {
			System.out.print(s6.charAt(i));
			Thread.sleep(100);
		}
		System.out.println();
		for (int i = 0; i < s7.length(); i++) {
			System.out.print(s7.charAt(i));
			Thread.sleep(100);
		}

		System.out.println();
		Thread.sleep(200);

		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{

		System.out.println("Enter the Your Choice ");
		 choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			InsertData.insertData();
			break;
		case 2:
			FetchData.fetchData();
			break;

		case 3:
			UpdateData.updateData();
			FetchData.fetchData();
			break;

		case 4:
			DeleteData.deleteData();
			FetchData.fetchData();
			break;
		case 5:
			System.exit(choice);
			break;

		}
		
	
		}while(choice!=5);

	}

}
