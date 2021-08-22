package Homework_2;

public class studentManager extends userManager {
	public void courseReg (Student student) {
		System.out.println(student.getFirstName()+" is added to course");
	}
	public void seeAllStudents(Student[] students) {
		System.out.println("Students : ");
		for(Student students_:students) {
			System.out.println(students_.getFirstName());
		}
	}
}
