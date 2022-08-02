package gr.uom.myUoM.restaurant;

import java.util.List;

public class RestaurantDTO {

    private String day;
    private List<String> gevmaKirios;
    private String gevmaEidiko;
    private String gevmaGarnitoura;
    private String gevmaSalata;
    private String gevmaEpidorpio;
    private List<String> deipnoKirios;
    private String deipnoEidiko;
    private String deipnoGarnitoura;
    private String deipnoSalata;
    private String deipnoEpidorpio;

    public RestaurantDTO(String day, List<String> gevmaKirios, String gevmaEidiko, String gevmaGarnitoura, String gevmaSalata, String gevmaEpidorpio, List<String> deipnoKirios, String deipnoEidiko, String deipnoGarnitoura, String deipnoSalata, String deipnoEpidorpio) {
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
