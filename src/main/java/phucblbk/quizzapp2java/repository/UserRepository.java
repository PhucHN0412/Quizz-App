package phucblbk.quizzapp2java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import phucblbk.quizzapp2java.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  public User findByUsername (String username);
}