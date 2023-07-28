package Food_App_Java.Food.App.repository;

import Food_App_Java.Food.App.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodItemRepository extends JpaRepository<FoodItem,Long> {


}
