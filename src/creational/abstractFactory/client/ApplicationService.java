package creational.abstractFactory.client;

import creational.abstractFactory.factory.DarkTheme;
import creational.abstractFactory.factory.LightTheme;
import creational.abstractFactory.factory.UiFactory;
import creational.abstractFactory.products.button.Button;
import creational.abstractFactory.products.checkBox.CheckBox;
import creational.abstractFactory.products.textField.TextField;

public class ApplicationService {

    private UiFactory uiFactory;
    private Button button;
    private CheckBox checkBox;
    private TextField textField;
    public ApplicationService(UiFactory uiFactory) {
        this.uiFactory = uiFactory;
        this.button = this.uiFactory.createButton();
        this.checkBox = this.uiFactory.createCheckBox();
        this.textField = this.uiFactory.createTextField();
    }

    public void  render(){
        System.out.println("Application Service is rendering");
        button.render();
        checkBox.render();
        textField.render();
    }

    public void  onClick(){
        System.out.println("onClick");
        button.onClick();
        checkBox.onClick();
        textField.onClick();
    }

    public void  onHover(){
        System.out.println("onHover");
        button.onHover();
        checkBox.onHover();
        textField.onHover();
    }

    public static void main(String[] args) {
        ApplicationService applicationService = new ApplicationService(new LightTheme());
        applicationService.render();
        applicationService.onHover();
        applicationService.onClick();
        System.out.println("Switch to Dark Theme...");
        applicationService = new ApplicationService(new DarkTheme());
        applicationService.render();
        applicationService.onHover();
        applicationService.onClick();
    }
}
