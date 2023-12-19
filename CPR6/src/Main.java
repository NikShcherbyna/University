
public class Main {
    public static void main(String[] args) {

        // Створення співробітників
        OrganizationalUnit employee1 = new Employee("John Doe", "Software Developer");
        OrganizationalUnit employee2 = new Employee("Jane Doe", "Project Manager");

        // Створення підрозділів
        OrganizationalUnit department1 = new Department("Development Department");
        OrganizationalUnit department2 = new Department("Management Department");

        // Додавання співробітників до підрозділів
        ((Department) department1).addUnit(employee1);
        ((Department) department2).addUnit(employee2);

        // Додавання підрозділів до головного підрозділу
        OrganizationalUnit organization = new Department("Our Organization");
        ((Department) organization).addUnit(department1);
        ((Department) organization).addUnit(department2);

        // Вивід інформації про всю організаційну структуру
        organization.displayInfo();
    }
}