package gr.uom.myUoM.restaurant;


import gr.uom.myUoM.Utils.StringListConverter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String day;
    @Convert(converter = StringListConverter.class)
    private List<String> gevmaKirios;
    private String gevmaEidiko;
    private String gevmaGarnitoura;
    private String gevmaSalata;
    private String gevmaEpidorpio;
    @Convert(converter = StringListConverter.class)
    private List<String> deipnoKirios;
    private String deipnoEidiko;
    private String deipnoGarnitoura;
    private String deipnoSalata;
    private String deipnoEpidorpio;


//    @OneToOne
//    private Lunch lunch;
//
//    @OneToOne
//    private Dinner dinner;


    public Restaurant(Long id, String day, List<String> gevmaKirios, String gevmaEidiko, String gevmaGarnitoura, String gevmaSalata, String gevmaEpidorpio, List<String> deipnoKirios, String deipnoEidiko, String deipnoGarnitoura, String deipnoSalata, String deipnoEpidorpio) {
        this.id = id;
        this.day = day;
        this.gevmaKirios = gevmaKirios;
        this.gevmaEidiko = gevmaEidiko;
        this.gevmaGarnitoura = gevmaGarnitoura;
        this.gevmaSalata = gevmaSalata;
        this.gevmaEpidorpio = gevmaEpidorpio;
        this.deipnoKirios = deipnoKirios;
        this.deipnoEidiko = deipnoEidiko;
        this.deipnoGarnitoura = deipnoGarnitoura;
        this.deipnoSalata = deipnoSalata;
        this.deipnoEpidorpio = deipnoEpidorpio;
    }

    public Restaurant(String day, List<String> gevmaKirios, String gevmaEidiko, String gevmaGarnitoura, String gevmaSalata, String gevmaEpidorpio, List<String> deipnoKirios, String deipnoEidiko, String deipnoGarnitoura, String deipnoSalata, String deipnoEpidorpio) {
        this.day = day;
        this.gevmaKirios = gevmaKirios;
        this.gevmaEidiko = gevmaEidiko;
        this.gevmaGarnitoura = gevmaGarnitoura;
        this.gevmaSalata = gevmaSalata;
        this.gevmaEpidorpio = gevmaEpidorpio;
        this.deipnoKirios = deipnoKirios;
        this.deipnoEidiko = deipnoEidiko;
        this.deipnoGarnitoura = deipnoGarnitoura;
        this.deipnoSalata = deipnoSalata;
        this.deipnoEpidorpio = deipnoEpidorpio;
    }

    public Restaurant() {
    }

    public Long getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<String> getGevmaKirios() {
        return gevmaKirios;
    }

    public void setGevmaKirios(List<String> gevmaKirios) {
        this.gevmaKirios = gevmaKirios;
    }

    public String getGevmaEidiko() {
        return gevmaEidiko;
    }

    public void setGevmaEidiko(String gevmaEidiko) {
        this.gevmaEidiko = gevmaEidiko;
    }

    public String getGevmaGarnitoura() {
        return gevmaGarnitoura;
    }

    public void setGevmaGarnitoura(String gevmaGarnitoura) {
        this.gevmaGarnitoura = gevmaGarnitoura;
    }

    public String getGevmaSalata() {
        return gevmaSalata;
    }

    public void setGevmaSalata(String gevmaSalata) {
        this.gevmaSalata = gevmaSalata;
    }

    public String getGevmaEpidorpio() {
        return gevmaEpidorpio;
    }

    public void setGevmaEpidorpio(String gevmaEpidorpio) {
        this.gevmaEpidorpio = gevmaEpidorpio;
    }

    public List<String> getDeipnoKirios() {
        return deipnoKirios;
    }

    public void setDeipnoKirios(List<String> deipnoKirios) {
        this.deipnoKirios = deipnoKirios;
    }

    public String getDeipnoEidiko() {
        return deipnoEidiko;
    }

    public void setDeipnoEidiko(String deipnoEidiko) {
        this.deipnoEidiko = deipnoEidiko;
    }

    public String getDeipnoGarnitoura() {
        return deipnoGarnitoura;
    }

    public void setDeipnoGarnitoura(String deipnoGarnitoura) {
        this.deipnoGarnitoura = deipnoGarnitoura;
    }

    public String getDeipnoSalata() {
        return deipnoSalata;
    }

    public void setDeipnoSalata(String deipnoSalata) {
        this.deipnoSalata = deipnoSalata;
    }

    public String getDeipnoEpidorpio() {
        return deipnoEpidorpio;
    }

    public void setDeipnoEpidorpio(String deipnoEpidorpio) {
        this.deipnoEpidorpio = deipnoEpidorpio;
    }
}
