package question2;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Students {
	
	public String lastName;
	public String firstName;
	public String course;
	public int test1;
	public int test2;
	public int summative;
	public int exam;
	public double finalMark;
	public String grade;
	
	public void Student() {
		
		lastName = " ";
		firstName = " ";
		course = " ";
		test1 = 0;
		test2 = 0;
		summative = 0;
		exam = 0;
		finalMark = 0;
		grade = " ";
		
	};
	public void setDetails(String surname,String name,String cous,int t1,int t2,int sum,int ex) {
	
		lastName = surname;
		firstName = name;
		course = cous;
		test1 = t1;
		test2 = t2;
		summative = sum;
		exam = ex;
		
	}
	
	public String getSurname() {
		
		return lastName;
	}
	public String getName() {
		
		return firstName;
	}
	public String getCourse() {
		
		return course;
	}
	public String getGrade() {
		
		return grade;
	}
	public String [] getStudents() {
		
		int stringline = 0;
		File filename = new File("student.txt");
		try {
			Scanner sl = new Scanner(filename);
			//get number of lines
			while (sl.hasNextLine()){
				
				stringline = stringline +1;
				sl.next();
			}
			
			//create a string that equals to the number of students text file lines
			String [] list = new String[stringline];
			
			Scanner s2 = new Scanner (filename);
			//get the list 
			for(int i = 0; i < stringline; i++) {
				
				list[i] = s2.next();
			}
			return list ;
			
		}catch(Exception e) {
			return null ;
		}
		
	}
	public void addDetails()
	{
		try {
			
			File fileName = new File("student.txt");
			FileWriter fw = new FileWriter(fileName,true);
			PrintWriter fp = new PrintWriter(fw);
			
			fp.println(lastName+","+firstName+","+course+","+test1+","+test2+","+summative+","+exam);
			fp.close();
			System.out.println(lastName + " " + firstName + " " + " detailes added to the text file");
		
		}catch(Exception e){
			
			System.out.println("Fail to open a file");
		}
	}
	public double calculateFinalMark() {
		
		
		finalMark = ((test1 + test2 + summative)/3) * 0.4 + exam* 0.6;
		
		if(finalMark <= 40) {
			
			grade = "Fail";
			
		}else if(finalMark <= 49) {
			
			grade = "D";
			
		}else if(finalMark <= 59) {
			
			grade = "C";
			
		}else if(finalMark <= 69) {
			
			grade = "B";
			
		}else if(finalMark <= 79) {
			
			grade = "A";
			
		}else if(finalMark <= 100) {
			
			grade = "A+";
		}
		
		return finalMark;
	}
	
	
}
