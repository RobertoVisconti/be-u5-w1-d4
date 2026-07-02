package robertovisconti.be_u5_w1_d4.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "topping")
public class Topping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private int calories;

    public Topping() {
    }

    public Topping(String name, double price, int calories) {
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

