package robertovisconti.be_u5_w1_d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private int calories;

    public Drink() {
    }

    public Drink(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
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
}
