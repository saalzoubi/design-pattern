package creational.abstractFactory.products.checkBox;


public class LightCheckBox implements CheckBox {
    @Override
    public void onClick() {
        System.out.println("Light CheckBox clicked");
    }

    @Override
    public void onHover() {
        System.out.println("Light CheckBox hovered");
    }

    @Override
    public void render() {
        System.out.println("Light CheckBox rendered");
    }
}
