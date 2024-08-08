class CapitalCity
 {
    String name;
    int population;

    CapitalCity(String name, int population) 
	{
        this.name = name;
        this.population = population;
    }

    void printDetails()
	{
        System.out.println("Capital City Name: " + name + ", Population: " + population);
    }
}