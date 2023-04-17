package test.anywr.test;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import test.anywr.test.entities.User;
import test.anywr.test.repository.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(value = false)
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    TestEntityManager entityManager;

   /* @Test
    public void registerUser()  {
        User user = new User();
        user.setUsername("alhassane");
        user.setPassword("alhassane1995");
        user.setName("Camara");
        user.setEmail("aloucams@gmail.com");

      User savedUser = userRepository.save(user);
      User existingUser =  entityManager.find(User.class, savedUser.getId());

     assertThat(savedUser.getUsername()).isEqualTo(existingUser.getUsername());
    }

    @Test
    public void testFindUserByUsername()  {
      String username = "alou2";
      User user =  userRepository.findUserByUsername(username);
      assertThat(user).isNotNull();
    }*/
}
