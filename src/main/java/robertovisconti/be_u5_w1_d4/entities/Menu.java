package robertovisconti.be_u5_w1_d4.entities;

import java.util.List;


public class Menu {

    private List<Pizza> pizzas;
    private List<Drink> drink;
    private List<Topping> toppings;


    public Menu(List<Pizza> pizzas, List<Drink> drink, List<Topping> toppings) {
        this.pizzas = pizzas;
        this.drink = drink;
        this.toppings = toppings;
    }

    // Getter semplici per accedere ai dati nel Runner
    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Drink> getDrink() {
        return drink;
    }

    public List<Topping> getToppings() {
        return toppings;
    }
}

