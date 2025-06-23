package creational.abstractFactory.products.button;

public class DarkButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Dark Button clicked");
    }

    @Override
    public void onHover() {
        System.out.println("Dark Button hovered");
    }

    @Override
    public void render() {
        System.out.println("Dark Button rendered");
    }
}
