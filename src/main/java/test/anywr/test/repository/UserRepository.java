package test.anywr.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.anywr.test.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select u from User u where u.username = ?1")
    User findUserByUsername(String userName);

}
