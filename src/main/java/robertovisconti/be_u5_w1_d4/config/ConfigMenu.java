package robertovisconti.be_u5_w1_d4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import robertovisconti.be_u5_w1_d4.entities.Drink;
import robertovisconti.be_u5_w1_d4.entities.Pizza;
import robertovisconti.be_u5_w1_d4.entities.Topping;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigMenu {

    // TOPPING
    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 1.50, 35);
    }

    @Bean
    public Topping salame() {
        return new Topping("Salame", 1.50, 80);
    }

    @Bean
    public Topping porcini() {
        return new Topping("Porcini", 3.00, 75);
    }

    @Bean
    public Topping scaglieParmigiano() {
        return new Topping("Scaglie di Parmigiano", 1.50, 120);
    }


    // DRINK
    @Bean
    public Drink acqua() {
        return new Drink("Acqua Naturale", 2.00, 0);
    }

    @Bean
    public Drink cocaCola() {
        return new Drink("Coca-Cola", 3.00, 139);
    }

    @Bean
    public Drink fanta() {
        return new Drink("Fanta", 3.00, 158);
    }

    @Bean
    public Drink rumSour() {
        return new Drink("Rum Sour", 15.00, 210);
    }

    //PIZZE
    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 7.00, 750, new ArrayList<>());
    }

    @Bean
    public Pizza margheritaProsciutto() {
        Pizza pizza = new Pizza("Margherita e Prosciutto", 7.00, 750, new ArrayList<>());
        pizza.getToppings().add(prosciutto());
        pizza.getToppings().add(scaglieParmigiano());
        return pizza;
    }

    @Bean
    public Pizza specialGuest() {
        Pizza pizza = new Pizza("Special Guest", 7.00, 750, new ArrayList<>());
        pizza.getToppings().add(porcini());
        pizza.getToppings().add(salame());
        return pizza;
    }

    @Bean
    public Menu menu() {

        List<Pizza> pizze = new ArrayList<>(List.of(margherita(), margheritaProsciutto(), specialGuest()));
        List<Topping> toppings = new ArrayList<>(List.of(porcini(), prosciutto(), salame(), scaglieParmigiano()));
        List<Drink> drink = new ArrayList<>(List.of(acqua(), cocaCola(), fanta(), rumSour()));

        return new Menu(pizze, drink, toppings);
    }

}
