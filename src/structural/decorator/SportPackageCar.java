package structural.decorator;

import structural.decorator.nonModified.Car;

public class SportPackageCar extends CarDecorator {

    public SportPackageCar(Car car) {
        super(car);
    }

    @Override
    public Double getPrice() {
       return super.getPrice() + 13000.0;
    }
    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public Integer getDoors() {
        return 2;
    }
}
