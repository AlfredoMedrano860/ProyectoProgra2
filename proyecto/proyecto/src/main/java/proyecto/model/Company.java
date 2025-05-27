package proyecto.model;
import java.util.ArrayList;

public class Company {

    private int id;
    private String name;
    private ArrayList<String> offers;

    public Company() {
        offers = new ArrayList<>();
    }

    public Company(int id, String name, ArrayList<String> offers) {
        this.id = id;
        this.name = name;
        this.offers = offers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<String> offers) {
        this.offers = offers;
    }
}