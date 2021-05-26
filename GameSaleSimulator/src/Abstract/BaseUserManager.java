package Abstract;

import Entity.User;

public class BaseUserManager implements UserService {

	@Override
	public void Save(User user) {
		System.out.println("Saved to database"+" "+user.getFirstName());
		
	}

	@Override
	public void Delete(User user) {
		System.out.println("Deleted from database"+" "+user.getFirstName());
		
	}

	@Override
	public void Update(User user) {
		System.out.println("Updated database"+" "+user.getFirstName());		
	}

}
