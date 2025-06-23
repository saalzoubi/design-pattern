package creational.abstractFactory.products.button;

public class LightButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Light Button clicked");
    }

    @Override
    public void onHover() {
        System.out.println("Light Button hovered");
    }

    @Override
    public void render() {
        System.out.println("Light Button rendered");
    }
}
