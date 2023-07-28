package Food_App_Java.Food.App.service;

import Food_App_Java.Food.App.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getUserOrders(User user) {
        return orderRepository.findByUser(user);
    }

    public Order createOrder(User user, FoodItem foodItem) {
        Order order = new Order();
        order.setUser(user);
        order.setFoodItem(foodItem);
        order.setOrderTime(LocalDateTime.now());
        return orderRepository.save(order);
    }
}
