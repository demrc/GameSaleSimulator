package Concrete;

import Abstract.SaleService;
import Entity.Game;
import Entity.User;

public class SaleManager implements SaleService {

	
	
	@Override
	public void sold(User user,Game game) {
		System.out.println("Game= "+game.getGameName()+ "is bought by= "+user.getFirstName());
		
	}

	@Override
	public void giveBack(User user,Game game) {
		System.out.println("Game= "+game.getGameName()+ "is returned by= "+user.getFirstName());
		
	}

	
	}


