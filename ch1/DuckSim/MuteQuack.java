package ch1.DuckSim;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Slience >>");
    }
}
