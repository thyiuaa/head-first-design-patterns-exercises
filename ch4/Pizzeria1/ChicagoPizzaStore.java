package ch4.Pizzeria1;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        // } else if (item.equals("veggie")) {
        //     return new NYStyleVeggiePizza();
        // } else if (item.equals("clam")) {
        //     return new NYStyleClamPizza();
        // } else if (item.equals("pepperoni")) {
        //     return new NYStylePepperoniPizza();
        } else return null;
    }
}
