package Food_App_Java.Food.App.repository;

import Food_App_Java.Food.App.model.Order;
import Food_App_Java.Food.App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IOrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByUser(User user);
}
