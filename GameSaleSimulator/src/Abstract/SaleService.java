package Abstract;

import Entity.Game;
import Entity.User;

public interface SaleService {
	void giveBack(User user,Game game);
	void sold(User user, Game game);
}
