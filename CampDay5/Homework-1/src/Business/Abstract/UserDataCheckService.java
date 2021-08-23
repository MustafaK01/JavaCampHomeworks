package Business.Abstract;

import Entities.Concrete.User;

public interface UserDataCheckService {
	boolean checkFirstAndLastName(User user);
	boolean checkEmail(User user);
	boolean checkPassword(User user);
	boolean checkUniqeEmail(User user);
	boolean validation(User user);

}
