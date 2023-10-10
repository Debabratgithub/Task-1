package in.springboot.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.springboot.web.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
