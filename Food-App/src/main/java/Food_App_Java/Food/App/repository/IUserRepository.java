package Food_App_Java.Food.App.repository;

import Food_App_Java.Food.App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
