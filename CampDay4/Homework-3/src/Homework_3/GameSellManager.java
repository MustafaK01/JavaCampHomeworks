package Homework_3;

public class GameSellManager implements GameSellService {

	@Override
	public void sell(User user) {
		System.out.println("UserId: "+user.getId()+"\n"+"Name: "+user.getFirstName()+"is bought the game.");
	}
	
}
