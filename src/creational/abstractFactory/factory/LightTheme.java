package creational.abstractFactory.factory;

import creational.abstractFactory.products.button.Button;
import creational.abstractFactory.products.button.LightButton;
import creational.abstractFactory.products.checkBox.CheckBox;
import creational.abstractFactory.products.checkBox.LightCheckBox;
import creational.abstractFactory.products.textField.LightTextField;
import creational.abstractFactory.products.textField.TextField;
import org.w3c.dom.Text;

public class LightTheme implements UiFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
