package Homework_2;
public class userManager{
	
	public void add(user user) {
		System.out.println(user.getFirstName()+" is added.");
	}
	public void remove(user user) {
		System.out.println(user.getFirstName()+" is removed from system");
	}
	public void addMultiple(user[] users) {
		for(user i:users) {
			add(i);
		}
	}
}
