package gr.uom.myUoM.restaurant;

import gr.uom.myUoM.Utils.StringListConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
public class Lunch {

    @Column(name = "lunch_main")
    @Convert(converter = StringListConverter.class)
    private List<String> kirios;
    @Column(name = "lunch_special")
    private String eidiko;
    @Column(name = "lunch_garnish")
    private String garnitoura;
    @Column(name = "lunch_salad")
    private String salata;
    @Column(name = "lunch_dessert")
    private String epidorpio;

    public Lunch(List<String> kirios, String eidiko, String garnitoura, String salata, String epidorpio) {
        this.kirios = kirios;
        this.eidiko = eidiko;
        this.garnitoura = garnitoura;
        this.salata = salata;
        this.epidorpio = epidorpio;
    }

    public Lunch() {
    }

    public List<String> getKirios() {
        return kirios;
    }

    public void setKirios(List<String> kirios) {
        this.kirios = kirios;
    }

    public String getEidiko() {
        return eidiko;
    }

    public void setEidiko(String eidiko) {
        this.eidiko = eidiko;
    }

    public String getGarnitoura() {
        return garnitoura;
    }

    public void setGarnitoura(String garnitoura) {
        this.garnitoura = garnitoura;
    }

    public String getSalata() {
        return salata;
    }

    public void setSalata(String salata) {
        this.salata = salata;
    }

    public String getEpidorpio() {
        return epidorpio;
    }

    public void setEpidorpio(String epidorpio) {
        this.epidorpio = epidorpio;
    }
}
