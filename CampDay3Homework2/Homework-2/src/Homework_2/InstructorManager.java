package Homework_2;

public class InstructorManager extends userManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+"'s "+instructor.getCourse()+" course is opened");
	}
	public void seeAllInstructors(Instructor[] instructor) {
		System.out.println("Instructors : ");
		for(Instructor instructors:instructor) {
			System.out.println(instructors.getFirstName());
		}
	}
}
