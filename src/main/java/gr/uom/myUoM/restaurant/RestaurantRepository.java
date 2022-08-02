package gr.uom.myUoM.restaurant;


import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    Restaurant findByDay(String day);
}
