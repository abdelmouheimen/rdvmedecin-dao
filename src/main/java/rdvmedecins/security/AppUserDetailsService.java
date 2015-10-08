package rdvmedecins.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		
		User user = userRepository.findUserByLogin(login);
		
		if (user == null) {
			throw new UsernameNotFoundException(String.format("login [%s] inexistant", login));
		}
		
		return new AppUserDetails(user, userRepository);
	}

}
