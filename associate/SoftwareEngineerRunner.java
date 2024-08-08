class SoftwareEngineerRunner 
{
    public static void main(String[] args) 
	{
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("sham", 5, "Senior Developer", 90000);
        Company company = new Company(1, "Tech Solutions", "Bengaluru", softwareEngineer);
        company.printDetails();
        
    }
}