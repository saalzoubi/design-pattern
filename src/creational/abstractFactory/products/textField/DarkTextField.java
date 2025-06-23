package creational.abstractFactory.products.textField;



public class DarkTextField implements TextField {
    @Override
    public void onClick() {
        System.out.println("Dark TextField clicked");
    }

    @Override
    public void onHover() {
        System.out.println("Dark TextField hovered");
    }

    @Override
    public void render() {
        System.out.println("Dark TextField rendered");
    }
}
