package practical.project.demo.logIn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practical.project.demo.logIn.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
