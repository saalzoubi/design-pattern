package structural.composite;

public class Test {
    public static void main(String[] args) {
        OrganizationComposite organization = new OrganizationComposite("Sawaed Elm");
        organization.add(new Employee("Saleem"));
        organization.add(new Employee("Seraj"));
        organization.add(new Employee("Abdullah"));

        OrganizationComposite sawaedJordan = new OrganizationComposite("Sawaed Jordan");
        OrganizationComposite sawaedEgypt = new OrganizationComposite("Sawaed Egypt");
        organization.add(sawaedJordan);
        organization.add(sawaedEgypt);
        sawaedJordan.add(new Employee("Ahmad"));
        sawaedJordan.add(new Employee("Karam"));
        sawaedEgypt.add(new Employee("Ali"));
        sawaedEgypt.add(new Employee("Hasan"));

        organization.showDetails();



    }
}
