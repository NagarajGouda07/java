public class Company {
    private int id;
    private String name;
    private String location;
    private SoftwareEngineer softwareEngineer;

    public Company(int id, String name, String location, SoftwareEngineer softwareEngineer) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.softwareEngineer = softwareEngineer;
    }

    public static void deliver(String item, String location) {
        System.out.println("Company is delivering");
        System.out.println("Item: " + item);
        System.out.println("Location: " + location);
    }

    public void printDetails() {
        System.out.println("Company ID: " + id + ", Name: " + name + ", Location: " + location);
        softwareEngineer.printDetails();
    }
}