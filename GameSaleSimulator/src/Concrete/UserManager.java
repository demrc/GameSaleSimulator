package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entity.User;


public class UserManager implements UserService{

	@Override
	public void Save(User user) {
		if(UserCheckService.CheckIfRealPerson(user)) {
			System.out.println("User added!");
		}
		else {
			System.out.println("User can not added!");
		}
		
	}
	@Override
	public void multipleSave(User[] users) {
		
			for (User user : users) {
				Save(user);}
		
		
	}

	@Override
	public void Delete(User user) {
		System.out.println("User deleted!");
		
	}

	@Override
	public void Update(User user) {
		if(!UserCheckService.CheckIfRealPerson(user)) {
			System.out.println("User updated!");
		
	}
		else {
				System.out.println("User can not updated!");
			}
		}
	
	}


