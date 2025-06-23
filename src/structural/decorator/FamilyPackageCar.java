package structural.decorator;

import structural.decorator.nonModified.Car;

public class FamilyPackageCar extends CarDecorator {

    public FamilyPackageCar(Car car) {
        super(car);
    }

    @Override
    public Double getPrice() {
       return super.getPrice() + 5000.0;
    }
    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public Integer getDoors() {
        return 6;
    }
}
