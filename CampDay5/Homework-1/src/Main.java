import Business.Abstract.VerificationMailService;
import Business.Concrete.UserDataCheckManager;
import Business.Concrete.UserManager;
import Business.Concrete.VerificatonMailManager;
import DataAccess.Concrete.HibernateUserDao;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"Ali","Veli","aliVeli23@gmail.com","1234567");
		User user2=new User(1,"mehmet","Bakýr","MehmetBakir231@hotmail.com","4654654");
		UserManager userManager=new UserManager(new HibernateUserDao(),new UserDataCheckManager(),
				new VerificatonMailManager());
		userManager.signUp(user);
		userManager.signUp(user2);
		userManager.signIn(user,"aliVeli23@gmail.com", "1234567");
		userManager.signIn(user2,"Mehmet231@hotmail.com","4654654");
		userManager.signIn(user2,"MehmetBakir231@hotmail.com","asdasdsad" );
		
	}

}
