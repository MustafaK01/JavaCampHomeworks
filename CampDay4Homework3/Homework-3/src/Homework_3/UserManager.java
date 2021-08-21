package Homework_3;

public class UserManager implements UserService{
	UserCheckService userCheck;
	public UserManager(UserCheckService userCheck) {
		this.userCheck=userCheck;
	}
	
	@Override
	public void addUser(User user) {
		if(userCheck.checkUser(user)) {
			System.out.println(user.getFirstName()+" is added.");
		}else {
			System.out.println(user.getFirstName()+" did not match");
		}
			
	}
	
	@Override
	public void deleteUser(User user) {
		System.out.println(user.getFirstName()+"is deleted.");
		
	}
	
	@Override
	public void updateUser(User user) {
		System.out.println(user.getFirstName()+"is updated.");
	}
	
}
