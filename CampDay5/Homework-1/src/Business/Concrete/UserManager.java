package Business.Concrete;

import java.util.ArrayList;
import java.util.List;

import Business.Abstract.UserDataCheckService;
import Business.Abstract.UserService;
import Business.Abstract.VerificationMailService;
import DataAccess.Abstract.UserDao;
import Entities.Concrete.User;
//User kayýt alaný
public class UserManager implements UserService {

	UserDataCheckService userDataCheckService;
	UserDao userDao;
	VerificationMailService verificationMailService;
	public UserManager(UserDao userDao,UserDataCheckService userDataCheckService,
			VerificationMailService verificationMailService) {
		
		this.userDataCheckService=userDataCheckService;
		this.userDao=userDao;
		this.verificationMailService=verificationMailService;
		
	}
	@Override
	public void signIn(User user,String eMail, String Password) {
		if(userDao.getPassAndEmail(user,eMail, Password)) {
			System.out.println("Login successful : "+eMail);
		}
		else {
			System.out.println("Wrong password or email");
		}
	}
	@Override
	public void signUp(User user) {
		if(userDataCheckService.validation(user)) {
			verificationMailService.sendVerificationMail(user);
			verificationMailService.mailVerify(user);
		}
	}
	
}
