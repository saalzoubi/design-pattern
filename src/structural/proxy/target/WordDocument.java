package structural.proxy.target;

public class WordDocument implements Document{
    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
