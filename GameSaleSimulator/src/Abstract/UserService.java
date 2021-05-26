package Abstract;

import Entity.User;

public interface UserService {
	void Save(User user);
	void Delete(User user);
	void Update(User user);
	void multipleSave(User[] users);

}
