package main.com;

import java.util.Scanner;

public class Runnabel {
	public static void main(String[] args) {
		
		entry();
		entry();
	}

	private static void entry() {
		Database db = new Database();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome all !!");
		System.out.println("This is the Survey about You");
		
		System.out.println("Let we Start ? (Y/N)");
		char ans = in.nextLine().charAt(0);
		if(ans  == 'Y') {
				
			while(ans == 'Y') {
				in.nextLine();
			System.out.print("What is your name : ");
			String name = in.nextLine();
			
			System.out.print("What is your father name : ");
			String Fname = in.nextLine();
			
			System.out.print("What is your Mother name : ");
			String Mname =in.nextLine();
			
			System.out.print("Your Qualification : ");
			String qualification = in.nextLine();
			in.nextLine();
			System.out.print("Mobile Number : ");
			long num = in.nextLong();
			in.nextLine();
			System.out.println();
			System.out.print("Shall we sumbit the data ? (Y/N)");
			char sumit = in.next().charAt(0);
			System.out.println();
				if(sumit == 'Y') {
					try {
					
						db.insertData(name,Fname,Mname,qualification,num);
						System.out.println();
						{
							System.out.println("Thank you Mr/Mrs."+name+" for Filling oru Survey !! Have a nice Day!");
						}
						ans='N';
					} catch (Exception e) {
						
						System.out.println(e.getMessage());
						System.out.println();
						break;
						
					}
				
					
				}else {
					
				System.out.println("Is somthing went Wrong");
				System.out.println("Lets Start from Scrtach !");
				
				System.out.println();
				}
			
				}
		}else {
			System.out.println("Sorry for inconvies!! ");
		}
		
		
		
	}
	
}
