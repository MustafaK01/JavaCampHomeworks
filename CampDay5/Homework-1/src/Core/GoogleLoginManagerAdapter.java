package Core;

import Business.Abstract.VerificationMailService;
import Entities.Concrete.User;

public class GoogleLoginManagerAdapter implements VerificationMailService {
	GoogleLoginManagerAdapter googleLoginManagerAdapter;
	public GoogleLoginManagerAdapter(GoogleLoginManagerAdapter googleLoginManagerAdapter) {
		this.googleLoginManagerAdapter=googleLoginManagerAdapter;
	}
	@Override
	public void sendVerificationMail(User user) {
		googleLoginManagerAdapter.sendVerificationMail(user);
		
	}

	@Override
	public void mailVerify(User user) {
		googleLoginManagerAdapter.mailVerify(user);
		
	}
	
}
