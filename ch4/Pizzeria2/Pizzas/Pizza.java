package ch4.Pizzeria2.Pizzas;

import ch4.Pizzeria2.Ingredients.Cheese.Cheese;
import ch4.Pizzeria2.Ingredients.Clams.Clams;
import ch4.Pizzeria2.Ingredients.Dough.Dough;
import ch4.Pizzeria2.Ingredients.Pepperoni.Pepperoni;
import ch4.Pizzeria2.Ingredients.Sauce.Sauce;
import ch4.Pizzeria2.Ingredients.Veggies.Veggies;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // public String toString() {}
}
