package Homework_2;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		//Student student=new Student[3];
		Student student1=new Student();
		Student student2=new Student();
		student1.setFirstName("Ceyda");
		student2.setFirstName("Veli");
		Instructor żnstructor = new Instructor();
		Instructor żnstructor2 = new Instructor();
		żnstructor.setFirstName("Mehmet");
		żnstructor2.setFirstName("Ali");
		userManager userManager=new userManager();
		studentManager studentManager=new studentManager();
		InstructorManager żnstructorManager=new InstructorManager();
		Student[] students= {student1,student2};
		Instructor[] instructors= {żnstructor,żnstructor2};
		/*
		userManager.add(student1);
		userManager.add(żnstructor);
		userManager.add(student2);
		userManager.add(żnstructor2);
		*/
		userManager.addMultiple(instructors);
		userManager.addMultiple(students);
		żnstructorManager.seeAllInstructors(instructors);
		studentManager.seeAllStudents(students);

	}
}
