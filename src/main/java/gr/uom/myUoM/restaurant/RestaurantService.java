package gr.uom.myUoM.restaurant;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getAllMeals() {
        return restaurantRepository.findAll();
    }

    public Restaurant getMealsOfTheDay(String day) {
        return restaurantRepository.findByDay(day);
    }

    public Restaurant addMeal(RestaurantDTO restaurantDTO) {
        String day = restaurantDTO.getDay();

        String deipnoEidiko = restaurantDTO.getDeipnoEidiko();
        String deipnoEpidorpio = restaurantDTO.getDeipnoEpidorpio();
        String deipnoGarnitoura = restaurantDTO.getDeipnoGarnitoura();
        List<String> deipnoKirios = restaurantDTO.getDeipnoKirios();
        String deipnoSalata = restaurantDTO.getDeipnoSalata();

        Dinner dinner = new Dinner(deipnoKirios, deipnoEidiko, deipnoGarnitoura, deipnoSalata, deipnoEpidorpio);

        String gevmaEpidorpio = restaurantDTO.getGevmaEpidorpio();
        String gevmaGarnitoura = restaurantDTO.getGevmaGarnitoura();
        List<String> gevmaKirios = restaurantDTO.getGevmaKirios();
        String gevmaSalata = restaurantDTO.getGevmaSalata();
        String gevmaEidiko = restaurantDTO.getGevmaEidiko();

        Lunch lunch = new Lunch(gevmaKirios, gevmaEidiko, gevmaGarnitoura, gevmaSalata, gevmaEpidorpio);

        Restaurant restaurant = new Restaurant(day, lunch, dinner);

        restaurantRepository.save(restaurant);
        return restaurantRepository.findByDay(day);
    }

    public void deleteMealByDay(String day) {
        restaurantRepository.deleteByDay(day);
    }
}
