package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class OrganizationComposite implements Organization {
    private final String name;
    private final List<Organization> employeeList;

    public OrganizationComposite(String name) {
        employeeList = new ArrayList<>();
        this.name = name;
    }
    void add(Organization organization) {
        employeeList.add(organization);
    }

    void remove(Organization organization) {
        employeeList.remove(organization);
    }

    @Override
    public void showDetails() {
        System.out.println("Show details for Organization: " + this.name);
        employeeList.forEach(Organization::showDetails);

    }
}
