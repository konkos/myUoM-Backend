package gr.uom.myUoM.restaurant;


import javax.persistence.*;


@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String day;

    @Embedded
    private Lunch lunch;

    @Embedded
    private Dinner dinner;

    public Restaurant() {
    }

    public Restaurant(Long id, String day, Lunch lunch, Dinner dinner) {
        this.id = id;
        this.day = day;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public Restaurant(String day, Lunch lunch, Dinner dinner) {
        this.day = day;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Lunch getLunch() {
        return lunch;
    }

    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    public Dinner getDinner() {
        return dinner;
    }

    public void setDinner(Dinner dinner) {
        this.dinner = dinner;
    }
}
