package com.wipro.hr.ems;

import java.util.Scanner;

import com.wipro.hr.ems.exception.SMSException;

public class StudDirectory {

	public static void main(String[] args) throws SMSException {
		
		Student [] studs = new Student [25];
		int idx = 0;
		Scanner sc = new Scanner (System.in);
		String choice = " ";
		
		do {
				System.out.println("Please select a choice:");
				System.out.println("1.Add Student");
				System.out.println("2.Search Student by roll no");
				System.out.println("3.Search Student by name");
				System.out.println("4.Delete Student by roll no");
				System.out.println("5.Display all Students");
				System.out.println("6.Exit");
				
				choice = sc.nextLine();
				
				switch (choice) {
				case "1":
					System.out.println("Please enter the name:");
					String name = sc.nextLine();
					System.out.println("Please enter the roll No");
					int rollNo = sc.nextInt(); sc.nextLine();
					
					Student st = new Student(rollNo,name);	
					studs[idx] = st;
					idx++;
					System.out.println("Student created successfully");
					break;
					
				case "2":
					System.out.println("Search Student by roll No");
					int searchRollNo = sc.nextInt(); sc.nextLine();
					
					boolean found = false;
					Student temp = null;
					
					for ( Student s : studs)
					{
						if (s != null)
						{
							if (searchRollNo == s.getRollNo())
							{
								found = true;
								temp= s;
								break;
							}
						}
					}	
					if (found)
					{
						System.out.println("Student found");
						temp.printDetails();
					}
					else
					{
						System.out.println("Sorry student not found for roll no " +  searchRollNo);
					}
						
					break;
					
				case "3":
					System.out.println("Search student by name");
					String searchName = sc.nextLine();		
					
					boolean foundname = false;
					Student temp1 = null;
					
					for ( Student s : studs)
					{
						if (s != null)
						{
							if (searchName.equals(s.getName()))
							{
								foundname = true;
								temp1= s;
								break;
							}
						}
					}
					if (foundname)
					{
						System.out.println("Student name found");
						temp1.printDetails();
					}
					else
					{
						System.out.println("Sorry student not found for name " +  searchName);
					}
						
					break;
					
				case "4":
					System.out.println("Delete Student by roll no");
					int deleteRollNo= sc.nextInt(); sc.nextLine();
					
					boolean delete = false;
					//Student temp2= null;
					
					for (int i =0; i < idx; i++)
					{
						if(studs[i] != null && studs[i].getRollNo() == deleteRollNo)
						{
							delete = true;
							studs[i]=null;
							break;
						}
					}
					if (delete)
					{
						System.out.println("Student roll no deleted");
						//tempo.printDetails();
					}
					else
					{
						System.out.println("sorry student roll no not deleted");
					}
					break;
									
				case "5":
					for(int i = 0; i < idx; i++)
					{
						Student temp2 = studs [i];
						if(temp2 != null)
							temp2.printDetails();
					}
					break;
					
				case "6":
					System.out.println("Exiting application");
					break;
				default:
					System.out.println("Invalid choice!");
					break;
				}
			
		}while (!choice.equals("6"));
		sc.close();
	}
}
