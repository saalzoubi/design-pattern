package creational.abstractFactory.products.checkBox;


public class DarkCheckBox implements CheckBox {
    @Override
    public void onClick() {
        System.out.println("Dark CheckBox clicked");
    }

    @Override
    public void onHover() {
        System.out.println("Dark CheckBox hovered");
    }

    @Override
    public void render() {
        System.out.println("Dark CheckBox rendered");
    }
}
