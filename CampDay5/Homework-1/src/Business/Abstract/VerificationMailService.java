package Business.Abstract;

import Entities.Concrete.User;

public interface VerificationMailService {
	void sendVerificationMail(User user);
	void mailVerify(User user);
}
