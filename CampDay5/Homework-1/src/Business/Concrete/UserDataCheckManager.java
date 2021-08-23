package Business.Concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import Business.Abstract.UserDataCheckService;
import Entities.Concrete.User;

public class UserDataCheckManager implements UserDataCheckService {
	List<String> EmailList = new ArrayList<String>();
	@Override
	public boolean checkFirstAndLastName(User user) {
		if(user.getFirstName().length()<2&&user.getLastName().length()<2) {
			System.out.println("The character length of the name and last name cannot be less than 2");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		final String patternOfEmail = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$" ;
		 Pattern pattern =Pattern.compile(patternOfEmail,Pattern.CASE_INSENSITIVE);
		 if(pattern.matcher(user.geteMail()).find()==false) {
			 System.out.println("You used the wrong character, try again.");
			 return false;
		 }
		 else if(user.geteMail().isEmpty()) {
			 System.out.println("Email field cannot be blank");
			 return false;
		 }
		 return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("The character length of password cannot be less than 6");
			return false;
		}else if(user.getPassword().isEmpty()) {
			System.out.println("Password field cannot be blank");
		}
		return true;
	}

	@Override
	public boolean checkUniqeEmail(User user) {
		if(EmailList.contains(user.geteMail())) {
			System.out.println("Email already received");
			return false;
		}
		return true;
	}
	public boolean validation(User user) {
		if(checkFirstAndLastName(user)&&checkEmail(user)&&checkPassword(user)&&checkUniqeEmail(user)) {
			return true;
		}
		return false;
	}
	
}
