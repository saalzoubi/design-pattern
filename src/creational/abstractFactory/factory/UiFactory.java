package creational.abstractFactory.factory;

import creational.abstractFactory.products.button.Button;
import creational.abstractFactory.products.checkBox.CheckBox;
import creational.abstractFactory.products.textField.TextField;

public interface UiFactory {
    Button createButton();
    CheckBox createCheckBox();
    TextField createTextField();
}
