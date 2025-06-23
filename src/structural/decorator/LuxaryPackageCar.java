package structural.decorator;

import structural.decorator.nonModified.Car;

public class LuxaryPackageCar extends CarDecorator {

    public LuxaryPackageCar(Car car) {
        super(car);
    }

    @Override
    public Double getPrice() {
       return super.getPrice() + 30000.0;
    }
    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public Integer getDoors() {
        return 4;
    }
}
