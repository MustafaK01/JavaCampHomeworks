package Homework_3;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"Ali", "Veli ","123456", "21/08/2021");
		Game game=new Game(1, 180, "Witcher 3", "RPG,Open World");
		Campagin campagin=new Campagin(1, 10, "21/08/2021", "30/08/2021", 5,"Witcher 3 Oyununda İndirim");
		UserManager userManager=new UserManager(new eDevlet());
		userManager.addUser(user);
		CampaginManager campaginManager=new CampaginManager();
		campaginManager.add(campagin);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
	}

}
