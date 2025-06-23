package behavioral.observer.observer;

public class Subscriber implements Observer{
    private String name;
    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println("Update the Subscriber: " + name);
    }
}
