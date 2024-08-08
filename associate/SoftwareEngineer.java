class SoftwareEngineer
 {
    String name;
    int experience;
    String designation;
    double salary;

    SoftwareEngineer(String name, int experience, String designation, double salary) 
	{
        this.name = name;
        this.experience = experience;
        this.designation = designation;
        this.salary = salary;
    }

    void printDetails() 
	{
        System.out.println("Software Engineer Name: " + name + ", Experience: " + experience + " years, Designation: " + designation + ", Salary: " + salary);
    }
}