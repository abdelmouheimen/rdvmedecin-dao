package rdvmedecins.security;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

	
	Role findRoleByName(String name);

}
