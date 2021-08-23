package DataAccess.Concrete;
import java.util.ArrayList;
import java.util.List;
import DataAccess.Abstract.UserDao;
import Entities.Concrete.User;
//Logging to database
public class HibernateUserDao implements UserDao{

	public void add(User user) {
		System.out.println(user.getFirstName()+"\n"+user.getLastName()+" : "+"is added.");
	}
	
	public void update(User user) {
		
	}

	public void delete(User user) {
		
	}

	@Override
	public boolean getPassAndEmail(User user,String userEmail, String userPassword) {
			if(user.geteMail()==userEmail && user.getPassword()==userPassword){
				return true;
			}
		return false;
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	
	
}
