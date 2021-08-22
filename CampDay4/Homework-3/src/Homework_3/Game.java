package Homework_3;

public class Game {
	private int gameId;
	private int price;
	private String gameName;
	private String gameType;
	
	public Game(int gameId, int price, String gameName, String gameType) {
		super();
		this.gameId = gameId;
		this.price = price;
		this.gameName = gameName;
		this.gameType = gameType;
		
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
}
