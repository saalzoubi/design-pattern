package structural.decorator.nonModified;

import java.util.List;

public class StandardCar implements Car{
    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public Double getPrice() {
        return 15000.0;
    }

    @Override
    public Integer getDoors() {
        return 0;
    }

}
