package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("New games="+" "+game.getGameName()+
				game.getGameDetail()+game.getGamePrice()+game.getGameGenre());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game is not available anymore.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updated games="+" "+game.getGameName()+
				game.getGameDetail()+game.getGamePrice()+game.getGameGenre());
		
	}

}
