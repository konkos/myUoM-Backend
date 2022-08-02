package gr.uom.myUoM.restaurant;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

        String gevmaEpidorpio = restaurantDTO.getGevmaEpidorpio();
        String gevmaGarnitoura = restaurantDTO.getGevmaGarnitoura();
        List<String> gevmaKirios = restaurantDTO.getGevmaKirios();
        String gevmaSalata = restaurantDTO.getGevmaSalata();
        String gevmaEidiko = restaurantDTO.getGevmaEidiko();

        Restaurant restaurant = new Restaurant(day, gevmaKirios, gevmaEidiko, gevmaGarnitoura, gevmaSalata, gevmaEpidorpio, deipnoKirios, deipnoEidiko, deipnoGarnitoura, deipnoSalata, deipnoEpidorpio);
        restaurantRepository.save(restaurant);
        return restaurantRepository.findByDay(day);
    }
}
