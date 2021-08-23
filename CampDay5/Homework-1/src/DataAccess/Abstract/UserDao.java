package DataAccess.Abstract;
import Entities.Concrete.User;
import java.util.List;
//Logging to database
public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	boolean getPassAndEmail(User user,String userEmail, String userPassword);
	List<User> getAll();
}
