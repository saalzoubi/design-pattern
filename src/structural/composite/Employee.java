package structural.composite;

public class Employee implements Organization {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println("Show details for employee: " + this.name);
    }
}
