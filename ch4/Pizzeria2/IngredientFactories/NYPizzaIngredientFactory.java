package ch4.Pizzeria2.IngredientFactories;

import ch4.Pizzeria2.Ingredients.Dough.*;
import ch4.Pizzeria2.Ingredients.Sauce.*;
import ch4.Pizzeria2.Ingredients.Cheese.*;
import ch4.Pizzeria2.Ingredients.Veggies.*;
import ch4.Pizzeria2.Ingredients.Pepperoni.*;
import ch4.Pizzeria2.Ingredients.Clams.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {
            new Garlic(),
            new Onion(),
            new Mushroom(),
            new RedPepper()
        };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
