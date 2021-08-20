package Homework_2;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		//Student student=new Student[3];
		Student student1=new Student();
		Student student2=new Student();
		student1.setFirstName("Ceyda");
		student2.setFirstName("Veli");
		Instructor ınstructor = new Instructor();
		Instructor ınstructor2 = new Instructor();
		ınstructor.setFirstName("Mehmet");
		ınstructor2.setFirstName("Ali");
		userManager userManager=new userManager();
		studentManager studentManager=new studentManager();
		InstructorManager ınstructorManager=new InstructorManager();
		Student[] students= {student1,student2};
		Instructor[] instructors= {ınstructor,ınstructor2};
		/*
		userManager.add(student1);
		userManager.add(ınstructor);
		userManager.add(student2);
		userManager.add(ınstructor2);
		*/
		userManager.addMultiple(instructors);
		userManager.addMultiple(students);
		ınstructorManager.seeAllInstructors(instructors);
		studentManager.seeAllStudents(students);

	}
}
