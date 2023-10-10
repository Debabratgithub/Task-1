package in.springboot.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.springboot.web.repo.UserRepository;
import in.springboot.web.service.IeUserService;
import in.springboot.web.user.User;

@Service
public class UserServiceImpl implements IeUserService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public void saveUser(User user) {
		user = repo.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		List<User> list = repo.findAll();
		return list;
	}

	
}
