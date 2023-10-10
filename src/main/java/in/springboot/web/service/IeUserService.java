package in.springboot.web.service;

import java.util.List;

import in.springboot.web.user.User;

public interface IeUserService {

	void saveUser(User e);
	List<User> getAllUsers();
}
