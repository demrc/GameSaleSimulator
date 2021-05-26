package Entity;

import Abstract.Entity;

public class Game implements Entity {
	private int id;
	private String gameName;
	private String gameDetail;
	private String gameGenre;
	private double gamePrice;
	private double gamePriceInDiscount;
	private double discount;
	
	
	public Game(int id, String gameName, String gameDetail, String gameGenre, double gamePrice,
			double gamePriceInDiscount) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameDetail = gameDetail;
		this.gameGenre = gameGenre;
		this.gamePrice = gamePrice;
		this.gamePriceInDiscount = gamePriceInDiscount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getGameDetail() {
		return gameDetail;
	}


	public void setGameDetail(String gameDetail) {
		this.gameDetail = gameDetail;
	}


	public String getGameGenre() {
		return gameGenre;
	}


	public void setGameGenre(String gameGenre) {
		this.gameGenre = gameGenre;
	}


	public double getGamePrice() {
		return gamePrice;
	}


	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}


	public double getGamePriceInDiscount(Discount discount) {
		return this.gamePrice-(this.gamePriceInDiscount*this.discount/100);
	}


}
