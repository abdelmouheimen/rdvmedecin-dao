package rdvmedecins.security;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	
	@Query("select ur.role from UserRole ur where ur.user.id=?1")
	Iterable<Role> getRoles(long id);


	@Query("select ur.role from UserRole ur where ur.user.login=?1 and ur.user.password=?2")
	Iterable<Role> getRoles(String login, String password);

	
	User findUserByLogin(String login);
}
