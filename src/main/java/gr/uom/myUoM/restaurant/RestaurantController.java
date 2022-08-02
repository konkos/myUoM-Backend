package gr.uom.myUoM.restaurant;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping()
    public List<Restaurant> getAllMeals() {
        return restaurantService.getAllMeals();
    }

    @GetMapping("/{day}")
    public Restaurant getMealsOfTheDay(@PathVariable String day) {
        return restaurantService.getMealsOfTheDay(day);
    }

    @PostMapping("/addMeal")
    public Restaurant addMeal(@RequestBody RestaurantDTO restaurantDTO) {
        return restaurantService.addMeal(restaurantDTO);
    }

}
