import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationalUnit{
    private String name;
    private List<OrganizationalUnit> units;

    public Department(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }

    public void addUnit(OrganizationalUnit unit) {
        units.add(unit);
    }

    @Override
    public void displayInfo() {
        System.out.println("Department: " + name);
        System.out.println("Units:");

        for (OrganizationalUnit unit : units) {
            unit.displayInfo();
        }
    }
}
