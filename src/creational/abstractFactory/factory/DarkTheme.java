package creational.abstractFactory.factory;

import creational.abstractFactory.products.button.Button;
import creational.abstractFactory.products.button.DarkButton;
import creational.abstractFactory.products.checkBox.CheckBox;
import creational.abstractFactory.products.checkBox.DarkCheckBox;
import creational.abstractFactory.products.textField.DarkTextField;
import creational.abstractFactory.products.textField.TextField;

public class DarkTheme implements UiFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
