import java.time.LocalDate;

import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entity.Discount;
import Entity.Game;
import Entity.User;

public class main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		User[] users= {new User(1,"someone","anyone","98562369",LocalDate.of(1900, 5, 14))};
		userManager.multipleSave(users);
		userManager.Save(new User(2,"aaaa","bbbbb","*985632",LocalDate.of(1900, 1, 1)));
		
		DiscountManager discount = new DiscountManager();
		discount.add(new Discount(10));
		
		GameManager game = new GameManager();
		game.add(new Game(1," anygame ","sandbox ","fps ",5,52));
		
		SaleManager sale = new SaleManager();
		sale.sold(new User(1,"someone","anyone","98562369",LocalDate.of(1900, 5, 14)), new Game(1," anygame ","sandbox ","fps ",5,52));
	}

}
