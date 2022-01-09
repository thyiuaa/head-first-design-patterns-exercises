package ch4.Pizzeria2.IngredientFactories;

import ch4.Pizzeria2.Ingredients.Cheese.Cheese;
import ch4.Pizzeria2.Ingredients.Clams.Clams;
import ch4.Pizzeria2.Ingredients.Dough.Dough;
import ch4.Pizzeria2.Ingredients.Pepperoni.Pepperoni;
import ch4.Pizzeria2.Ingredients.Sauce.Sauce;
import ch4.Pizzeria2.Ingredients.Veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
