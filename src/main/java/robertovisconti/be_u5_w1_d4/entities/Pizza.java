package robertovisconti.be_u5_w1_d4.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private int calories;

    // Relazione molti-a-molti: Una pizza può avere più toppings
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Topping> toppings;

    public Pizza() {
    }

    public Pizza(String name, double price, int calories, List<Topping> toppings) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppings = toppings;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

}
