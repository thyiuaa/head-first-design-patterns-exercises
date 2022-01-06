package ch2.Weather_push;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
