package question2;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Scanner ob = new Scanner(System.in);
		
		int choice ;
		do
		{
			
			System.out.println("----------------------------");
			System.out.println("0- Exit");
			System.out.println("1- Add Student");
			System.out.println("2- Display Results");
			System.out.println("----------------------------");
			System.out.println("Make Choice");
			choice = in.nextInt();
			
			if(choice == 1) {
				
				System.out.println("Surname :");
				String surname = ob.nextLine();
				
				System.out.println("Name :");
				String name = ob.nextLine();
				
				System.out.println("Course :");
				String course = ob.nextLine();
				
				System.out.println("Class Test 1:");
				int test1 = in.nextInt();
				
				System.out.println("Class Test 2:");
				int test2 = in.nextInt();
				
				System.out.println("Summative:");
				int summ = in.nextInt();
				
				System.out.println("Exam:");
				int exam = in.nextInt();
				
				Students student = new Students();
				
				student.setDetails(surname, name, course, test1, test2, summ, exam);
				student.addDetails();
				
			}
			else if(choice == 2) {
				
				Students student = new Students();
				String [] line = student.getStudents();
				
				
				//Students [] stud = new Students[line.length];
				
				for(int index = 0; index <= line.length; index++) {
					
					String firstLine = line[index];
					int pos = firstLine.indexOf(",");
					String surname = firstLine.substring(0,pos);
					firstLine = firstLine.substring(pos+1,firstLine.length());
					
					pos =  firstLine.indexOf(",");
					String name = firstLine.substring(0,pos);
					firstLine = firstLine.substring(pos+1,firstLine.length());
					
					pos =  firstLine.indexOf(",");
					String course = firstLine.substring(0,pos);
					firstLine = firstLine.substring(pos+1,firstLine.length());
					
					pos =  firstLine.indexOf(",");
					int test1 = Integer.parseInt(firstLine.substring(0,pos));
					firstLine = firstLine.substring(pos+1,firstLine.length());
					
					pos =  firstLine.indexOf(",");
					int test2 = Integer.parseInt(firstLine.substring(0,pos));
					firstLine = firstLine.substring(pos+1,firstLine.length());
					
					pos =  firstLine.indexOf(",");
					int summ = Integer.parseInt(firstLine.substring(0,pos));
					firstLine = firstLine.substring(pos+1,firstLine.length());
					
					
					int exam = Integer.parseInt(firstLine);
					
					Students [] stud = new Students[line.length];
					
					stud[index].setDetails(surname, name, course, test1, test2, summ, exam);
				}
					Students [] s = new Students[line.length];
					
					for(int i = 0; i <= s.length; i++)
					{
						System.out.println("---------------------------");
						System.out.println("Surname :" + s[i].getSurname() );
						System.out.println("Name :" + s[i].getName() );
						System.out.println("course :" + s[i].getCourse() );
						System.out.println("final mark :" + s[i].calculateFinalMark() + " " + s[i].getGrade() );
	
					}

				
			}while(choice != 0);
	
			System.out.println("bye! bye! ");
	}
}
	
	

