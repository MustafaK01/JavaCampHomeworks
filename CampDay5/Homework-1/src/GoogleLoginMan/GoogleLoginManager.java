package GoogleLoginMan;

import Entities.Concrete.User;

public class GoogleLoginManager {
	public void sendVerificationMail(User user) {
		System.out.println("Email sent to verify : " + user.geteMail() );
	}
	public void verifyEmail(User user) {
		System.out.println("Verified");
	}
}
