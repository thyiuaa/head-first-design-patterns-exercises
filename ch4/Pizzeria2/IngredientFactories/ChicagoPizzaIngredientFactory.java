package ch4.Pizzeria2.IngredientFactories;

import ch4.Pizzeria2.Ingredients.Dough.*;
import ch4.Pizzeria2.Ingredients.Sauce.*;
import ch4.Pizzeria2.Ingredients.Cheese.*;
import ch4.Pizzeria2.Ingredients.Veggies.*;
import ch4.Pizzeria2.Ingredients.Pepperoni.*;
import ch4.Pizzeria2.Ingredients.Clams.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {
            new BlackOlives(),
            new Spinach(),
            new Eggplant()
        };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
