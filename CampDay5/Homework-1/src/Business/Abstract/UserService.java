package Business.Abstract;

import Entities.Concrete.User;

public interface UserService{
	void signIn(User user,String eMail, String password);
	void signUp(User user);
}
