package structural.decorator;

import structural.decorator.nonModified.Car;
import structural.decorator.nonModified.StandardCar;

public class Test {
    public static void main(String[] args) {
        Car car = new StandardCar();
        Car sportCar = new SportPackageCar(car);
        Car luxaryCar = new LuxaryPackageCar(car);
        Car familyLuxaryCar = new LuxaryPackageCar(luxaryCar);

        System.out.println("StandardCar price: " + car.getPrice());
        System.out.println("SportCar price: " + sportCar.getPrice());
        System.out.println("LuxaryCar price: " + luxaryCar.getPrice());
        System.out.println("FamilyLuxaryCar price: " + familyLuxaryCar.getPrice());


    }
}
