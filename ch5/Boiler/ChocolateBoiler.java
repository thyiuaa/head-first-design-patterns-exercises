package ch5.Boiler;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private ChocolateBoiler uniqueBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // for multithreading:
    // 1. synchronized getter
    // 2. instanciate in uniqueBoiler
    // 3. double-checked locking
    public ChocolateBoiler getBoiler() {
        if (uniqueBoiler == null) {
            uniqueBoiler = new ChocolateBoiler();
        }
        return uniqueBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    
    public boolean isBoiled() {
        return boiled;
    }
}
