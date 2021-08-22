package Homework_3;

public class eDevlet implements UserCheckService{
	@Override
	public boolean checkUser(User user) {
		System.out.println(user.getFirstName()+"\n"+
						   user.getLastName()+"\n"+
						   user.getNationalIdentity()+"\n"+
						   user.getDateOfBirth()+" is verified");
		return true;
	}
	
}
