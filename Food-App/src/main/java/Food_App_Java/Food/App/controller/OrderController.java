package Food_App_Java.Food.App.controller;


import Food_App_Java.Food.App.model.FoodItem;
import Food_App_Java.Food.App.model.Order;
import Food_App_Java.Food.App.model.User;
import Food_App_Java.Food.App.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{username}")
    public List<Order> getUserOrders(@PathVariable String username) {
        User user = userService.findByUsername(username);
        return orderService.getUserOrders(user);
    }

    @PostMapping("/{username}/{foodItemId}")
    public Order createOrder(@PathVariable String username, @PathVariable Long foodItemId) {
        User user = userService.findByUsername(username);
        FoodItem foodItem = foodItemService.getFoodItemById(foodItemId);
        return orderService.createOrder(user, foodItem);
    }
}
