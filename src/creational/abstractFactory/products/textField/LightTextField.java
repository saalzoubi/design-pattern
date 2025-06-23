package creational.abstractFactory.products.textField;


public class LightTextField implements TextField {
    @Override
    public void onClick() {
        System.out.println("Light TextField clicked");
    }

    @Override
    public void onHover() {
        System.out.println("Light TextField hovered");
    }

    @Override
    public void render() {
        System.out.println("Light TextField rendered");
    }
}
