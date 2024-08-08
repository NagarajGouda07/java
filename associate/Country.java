class Country 
{
    String name;
    String continent;
    State state;

    Country(String name, String continent, State state) 
	{
        this.name = name;
        this.continent = continent;
        this.state = state;
    }

    void printDetails() 
	{
        System.out.println("Country Name: " + name + ", Continent: " + continent);
        state.printDetails();
    }
}