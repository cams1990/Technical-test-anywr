package test.anywr.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import test.anywr.test.entities.CustumUserDetails;
import test.anywr.test.entities.User;
import test.anywr.test.repository.UserRepository;

public class CustumUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        if(user == null)  {
            throw new UsernameNotFoundException("Utlisateur inexistant");
        }
        return new CustumUserDetails(user);
    }
}


