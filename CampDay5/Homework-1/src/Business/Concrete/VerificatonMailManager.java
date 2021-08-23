package Business.Concrete;

import Business.Abstract.VerificationMailService;
import Entities.Concrete.User;

public class VerificatonMailManager implements VerificationMailService {

	@Override
	public void sendVerificationMail(User user) {
		System.out.println("Email sent to verify : "+user.geteMail());
	}

	@Override
	public void mailVerify(User user) {
		System.out.println("Verified : "+user.geteMail());
		
	}
	
}
