package structural.decorator;

import structural.decorator.nonModified.Car;

public class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getColor() {
        return car.getColor();
    }

    @Override
    public Double getPrice() {
        return car.getPrice();
    }

    @Override
    public Integer getDoors() {
        return car.getDoors();
    }
}
